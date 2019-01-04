package com.zhsw.rabbitmqaccess.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Village {

  @TableId(type = IdType.INPUT)
  private String villageCode;
  private String villageName;
  private String townshipCode;
  private String addvcd;
  private double tilthArea;
  private String address;
  private double locationX;
  private double locationY;
  private String remark;


  public String getVillageCode() {
    return villageCode;
  }

  public void setVillageCode(String villageCode) {
    this.villageCode = villageCode;
  }


  public String getVillageName() {
    return villageName;
  }

  public void setVillageName(String villageName) {
    this.villageName = villageName;
  }


  public String getTownshipCode() {
    return townshipCode;
  }

  public void setTownshipCode(String townshipCode) {
    this.townshipCode = townshipCode;
  }


  public String getAddvcd() {
    return addvcd;
  }

  public void setAddvcd(String addvcd) {
    this.addvcd = addvcd;
  }


  public double getTilthArea() {
    return tilthArea;
  }

  public void setTilthArea(double tilthArea) {
    this.tilthArea = tilthArea;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public double getLocationX() {
    return locationX;
  }

  public void setLocationX(double locationX) {
    this.locationX = locationX;
  }


  public double getLocationY() {
    return locationY;
  }

  public void setLocationY(double locationY) {
    this.locationY = locationY;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
