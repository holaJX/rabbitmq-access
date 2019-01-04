package com.zhsw.rabbitmqaccess.service;


import com.alibaba.fastjson.JSON;
import com.zhsw.rabbitmqaccess.dto.MeterDTO;
import com.zhsw.rabbitmqaccess.dto.QueueMessage;
import com.zhsw.rabbitmqaccess.dto.TreeDTO;
import com.zhsw.rabbitmqaccess.entity.County;
import com.zhsw.rabbitmqaccess.entity.Meter;
import com.zhsw.rabbitmqaccess.entity.Township;
import com.zhsw.rabbitmqaccess.entity.Village;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by p on  .
 * MQ消费者服务
 */
@Log4j2
@Service
public class ConsumerTreeService {

    @Autowired
    private CountyService countyService;
    @Autowired
    private TownshipService townshipService;
    @Autowired
    private VillageService villageService;

    /**
     * 监听mis-equipment-lp队列
     *
     * @param message
     */
    @RabbitListener(queues = "${rabbitmqQueueName.integration}")
    public void receive(Message message) {
        System.out.println("MQ处理灌区数据："+message.getBody());
        try {
            byte[] body = message.getBody();
            Object o = JSON.parseObject(body, QueueMessage.class);
            QueueMessage queueMessage = (QueueMessage) o;
            Object treeDTO = JSON.parseObject(queueMessage.getData().toString(), TreeDTO.class);
            TreeDTO data = (TreeDTO) treeDTO;
            //新增
            if (queueMessage.getOperation() == 1) {
                processTreeData(data);
            }
            if (queueMessage.getOperation() == 2) {
            }
        } catch (Exception e) {

            log.error(e.getMessage());
        }
        System.out.println("MQ处理灌区数据结束");
    }

    private void processTreeData(TreeDTO data) {
        //"3"= 灌区 "4"=泵站  "5" =设备组
        int rank = Integer.parseInt(data.getRank());
        if (rank == 3) {
            County county = new County();
            county.setCountyCode(data.getCode());
            county.setCountyName(data.getName());
            boolean save = countyService.save(county);
        }
        if (rank == 4) {
            Township township = new Township();
            township.setCountyCode(data.getParentCode());
            township.setTownshipCode(data.getCode());
            township.setTownshipName(data.getName());
            boolean save = townshipService.save(township);
        }
        if (rank == 5) {
            Village village = new Village();
            village.setTownshipCode(data.getParentCode());
            village.setVillageCode(data.getCode());
            village.setVillageName(data.getName());
            boolean save = villageService.save(village);
        }
    }
    private void updateTreeData(TreeDTO data) {
        //"3"= 灌区 "4"=泵站  "5" =设备组
        int rank = Integer.parseInt(data.getRank());
        if (rank == 3) {
            County county = countyService.getById(data.getCode());
            if (county!=null){
                county.setCountyName(data.getName());
                countyService.updateById(county);
            }
        }
        if (rank == 4) {
            Township township = townshipService.getById(data.getCode());
            if (township!=null){
                township.setTownshipName(data.getName());
                townshipService.updateById(township);
            }
        }
        if (rank == 5) {
            Village village = villageService.getById(data.getCode());
            if (village!=null){
                village.setVillageName(data.getName());
                villageService.updateById(village);
            }
        }
    }

}
