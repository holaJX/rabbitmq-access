package com.zhsw.rabbitmqaccess.service.impl;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhsw.rabbitmqaccess.dao.MeterDao;
import com.zhsw.rabbitmqaccess.dto.MeterDTO;
import com.zhsw.rabbitmqaccess.dto.VisitorInfoDTO;
import com.zhsw.rabbitmqaccess.entity.Meter;
import com.zhsw.rabbitmqaccess.service.MeterService;
import com.zhsw.rabbitmqaccess.webs.AxisUtil;
import com.zhsw.rabbitmqaccess.webs.XmlResolve;
import lombok.extern.log4j.Log4j2;
import org.apache.axis2.AxisFault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class MeterServiceImp extends ServiceImpl<MeterDao, Meter> implements MeterService {


    /** 用户名 */
    @Value("${xinTianSystem.userName}")
    private String userName;
    /** 密码 */
    @Value("${xinTianSystem.password}")
    private String password;
    /**
     * 访问webservice接口地址
     */
    @Value("${xinTianSystem.url}")
    private String url ;

    /**
     * 调用新天接口 水表信息存档
     *
     * @param paramsValue
     * @return
     */
    @Override
    public boolean addAndUpdateMeter(MeterDTO paramsValue) {
        VisitorInfoDTO visitorInfo = new VisitorInfoDTO(userName,password);
//        paramsValue.setGprsAddr(paramsValue.getMeterAddr().substring(2, paramsValue.getMeterAddr().length()));
        paramsValue.setMeterType(5);
        if (paramsValue.getVillageCode().equals(""))
        {
            paramsValue.setVillageCode("101002004001");//盐井口水库灌区 北干渠泵站 北干渠设备组
        }
        //水表已经存在，不能够在添加
        try {
            String result = AxisUtil.sendMeterCommand(url, "AddAndUpdate", new String[]{JSON.toJSONString(visitorInfo), JSON.toJSONString(paramsValue)});
            System.out.println(result);
            result = XmlResolve.resolve(result);
            log.info("【水表存档】"+paramsValue+"新天接口调用成功:" + result);
            return true;
        } catch (AxisFault e) {
            log.info("【水表存档】"+paramsValue+"新天接口调用异常:" + e.getMessage());
            return false;
        }

    }

    public Meter getMeterByCode(String code) {
        QueryWrapper<Meter> wrapper = new QueryWrapper<>();
        wrapper.eq("MeterCode", code);
        List<Meter> meterList = baseMapper.selectList(wrapper);
        if (!meterList.isEmpty()) {
            return meterList.get(0);
        }
        return null;
    }


}
