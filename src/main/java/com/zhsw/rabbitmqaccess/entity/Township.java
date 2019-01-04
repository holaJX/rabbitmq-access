package com.zhsw.rabbitmqaccess.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Township {
  @TableId(type = IdType.INPUT)

  private String townshipCode;
  private String townshipName;
  private String countyCode;
  private double tilthArea;
  private String address;
  private double locationX;
  private double locationY;
  private String remark;


  public String getTownshipCode() {
    return townshipCode;
  }

  public void setTownshipCode(String townshipCode) {
    this.townshipCode = townshipCode;
  }


  public String getTownshipName() {
    return townshipName;
  }

  public void setTownshipName(String townshipName) {
    this.townshipName = townshipName;
  }


  public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode;
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
