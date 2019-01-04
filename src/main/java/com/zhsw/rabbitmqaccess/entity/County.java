package com.zhsw.rabbitmqaccess.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

public class County {

  @TableId(type = IdType.INPUT)

  private String countyCode;

  private String countyName;

  private double tilthArea;

  private String address;

  private double locationX;

  private double locationY;

  private String remark;
  private String divisionCode;


  public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode;
  }


  public String getCountyName() {
    return countyName;
  }

  public void setCountyName(String countyName) {
    this.countyName = countyName;
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


  public String getDivisionCode() {
    return divisionCode;
  }

  public void setDivisionCode(String divisionCode) {
    this.divisionCode = divisionCode;
  }

}
