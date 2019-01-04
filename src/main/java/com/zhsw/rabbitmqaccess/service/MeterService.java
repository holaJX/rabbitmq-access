package com.zhsw.rabbitmqaccess.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zhsw.rabbitmqaccess.dto.MeterDTO;
import com.zhsw.rabbitmqaccess.entity.Meter;

public interface MeterService extends IService<Meter>{
    /**
     * 调用新天接口，数据存档
     * @param paramsValue
     * @return
     */
    boolean addAndUpdateMeter(MeterDTO paramsValue);

    /**
     * 设备是否存在
     * @param code
     * @return
     */
    Meter getMeterByCode(String code);

}
