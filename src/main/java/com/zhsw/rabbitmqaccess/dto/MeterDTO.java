package com.zhsw.rabbitmqaccess.dto;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeterDTO {


    private int MeterId;
    private String VillageCode;

    private String MeterName;

//    private String GprsAddr;
    /**蝶阀类型为:5*/

    private int MeterType;
    private String MeterAddr;
    private String WaterAddr;
    private String LocationX;
    private String LocationY;
    @JSONField(name="LocationX")
    public String getLocationX() {
        return LocationX;
    }

    public void setLocationX(String locationX) {
        LocationX = locationX;
    }
    @JSONField(name="LocationY")
    public String getLocationY() {
        return LocationY;
    }

    public void setLocationY(String locationY) {
        LocationY = locationY;
    }

    @JSONField(name="MeterId")
    public int getMeterId() {
        return MeterId;
    }

    public void setMeterId(int meterId) {
        MeterId = meterId;
    }

    @JSONField(name="MeterAddr")
    public String getMeterAddr() {
        return MeterAddr;
    }

    public void setMeterAddr(String meterAddr) {
        MeterAddr = meterAddr;
    }
    @JSONField(name="WaterAddr")
    public String getWaterAddr() {
        return WaterAddr;
    }
    public void setWaterAddr(String waterAddr) {
        WaterAddr = waterAddr;
    }
    @JSONField(name="VillageCode")
    public String getVillageCode() {
        return VillageCode;
    }
    public void setVillageCode(String villageCode) {
        VillageCode = villageCode;
    }
    @JSONField(name="MeterName")
    public String getMeterName() {
        return MeterName;
    }
    public void setMeterName(String meterName) {
        MeterName = meterName;
    }
//    @JSONField(name="GprsAddr")
//    public String getGprsAddr() {
//        return GprsAddr;
//    }
//    public void setGprsAddr(String gprsAddr) {
//        GprsAddr = gprsAddr;
//    }
    @JSONField(name="MeterType")
    public int getMeterType() {
        return MeterType;
    }
    public void setMeterType(int meterType) {
        MeterType = meterType;
    }
}
