package com.zhsw.rabbitmqaccess.service;


import com.alibaba.fastjson.JSON;
import com.zhsw.rabbitmqaccess.dto.MeterDTO;
import com.zhsw.rabbitmqaccess.dto.QueueMessage;
import com.zhsw.rabbitmqaccess.entity.Meter;
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
public class ConsumerEquipmentService {

    @Autowired
    private MeterService meterService;

    /**
     * 监听mis-equipment-lp队列
     *
     * @param message
     */
    @RabbitListener(queues = "${rabbitmqQueueName.mis}")
    public void receive(Message message) {
        System.out.println(message.getBody());
        try {
            byte[] body = message.getBody();
            Object o = JSON.parseObject(body, QueueMessage.class);
            QueueMessage queueMessage = (QueueMessage) o;
            Object meterDTO = JSON.parseObject(queueMessage.getData().toString(), MeterDTO.class);
            MeterDTO data = (MeterDTO) meterDTO ;
            //新增
            if (queueMessage.getOperation() == 1) {
                Meter exist = meterService.getMeterByCode(data.getMeterAddr());
                if (exist == null) {
                    data.setMeterId(0);
                    boolean b = meterService.addAndUpdateMeter(data);
                }
            }
            if (queueMessage.getOperation() == 2) {
                //修改
                boolean b = meterService.addAndUpdateMeter(data);
            }
        } catch (Exception e) {

            log.error(e.getMessage());
        }
    }

}
