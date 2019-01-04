package com.zhsw.rabbitmqaccess.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Meter {
    private Integer meterid;

    private String metercode;

    private String metername;

    private String meteraddr;

    private String wateraddr;

    private Integer mark;

    private String villagecode;

    private String position;

    private BigDecimal locationx;

    private BigDecimal locationy;

    private BigDecimal welldepth;

    private BigDecimal swater;

    private Date welltime;

    private BigDecimal slvl;

    private BigDecimal dlvl;

    private String wtm;

    private BigDecimal wdcp;

    private BigDecimal warea;

    private String pumptp;

    private BigDecimal pumph;

    private BigDecimal pumpq;

    private BigDecimal wellpower;

    private Integer communicationtype;

    private Integer framestype;

    private Date installdate;

    private Integer metertype;

    private Integer collovertime;

    private String gprsaddr;

    private Integer gprscycle;

    private BigDecimal canpicknumber;

    private BigDecimal setpicknumber;

    private BigDecimal pickalarmnumber;

    private Integer areano;

    private Integer meterno;

    private String remark;

    private Boolean syncflag;

    private Boolean audited;

    private String bluetoothaddr;

    private Date lastcommdate;

    private String currentusernum;

    private String remoteaddr;

    private Boolean isonline;

    private Boolean onlineenable;

    private String onlinet1;

    private String onlinet2;

    private String onlinet3;

    private String onlinet4;

    private String defuploaddate;

    private String wellproperty;

    private String respperson;

    private String resppersonphone;

    private Integer welltype;

    private String wellsimnb;

    private Boolean presssendenable;

    private Integer onlinedays;

    private String gatewayaddr;

    private BigDecimal gatewaybattery;

    private Integer uploadinterval;

    private Integer valvestatus;

    private Integer alarmtype;

    public Integer getMeterid() {
        return meterid;
    }

    public void setMeterid(Integer meterid) {
        this.meterid = meterid;
    }

    public String getMetercode() {
        return metercode;
    }

    public void setMetercode(String metercode) {
        this.metercode = metercode == null ? null : metercode.trim();
    }

    public String getMetername() {
        return metername;
    }

    public void setMetername(String metername) {
        this.metername = metername == null ? null : metername.trim();
    }

    public String getMeteraddr() {
        return meteraddr;
    }

    public void setMeteraddr(String meteraddr) {
        this.meteraddr = meteraddr == null ? null : meteraddr.trim();
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getVillagecode() {
        return villagecode;
    }

    public void setVillagecode(String villagecode) {
        this.villagecode = villagecode == null ? null : villagecode.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public BigDecimal getLocationx() {
        return locationx;
    }

    public void setLocationx(BigDecimal locationx) {
        this.locationx = locationx;
    }

    public BigDecimal getLocationy() {
        return locationy;
    }

    public void setLocationy(BigDecimal locationy) {
        this.locationy = locationy;
    }

    public BigDecimal getWelldepth() {
        return welldepth;
    }

    public void setWelldepth(BigDecimal welldepth) {
        this.welldepth = welldepth;
    }

    public BigDecimal getSwater() {
        return swater;
    }

    public void setSwater(BigDecimal swater) {
        this.swater = swater;
    }

    public Date getWelltime() {
        return welltime;
    }

    public void setWelltime(Date welltime) {
        this.welltime = welltime;
    }

    public BigDecimal getSlvl() {
        return slvl;
    }

    public void setSlvl(BigDecimal slvl) {
        this.slvl = slvl;
    }

    public BigDecimal getDlvl() {
        return dlvl;
    }

    public void setDlvl(BigDecimal dlvl) {
        this.dlvl = dlvl;
    }

    public String getWtm() {
        return wtm;
    }

    public void setWtm(String wtm) {
        this.wtm = wtm == null ? null : wtm.trim();
    }

    public BigDecimal getWdcp() {
        return wdcp;
    }

    public void setWdcp(BigDecimal wdcp) {
        this.wdcp = wdcp;
    }

    public BigDecimal getWarea() {
        return warea;
    }

    public void setWarea(BigDecimal warea) {
        this.warea = warea;
    }

    public String getPumptp() {
        return pumptp;
    }

    public void setPumptp(String pumptp) {
        this.pumptp = pumptp == null ? null : pumptp.trim();
    }

    public BigDecimal getPumph() {
        return pumph;
    }

    public void setPumph(BigDecimal pumph) {
        this.pumph = pumph;
    }

    public BigDecimal getPumpq() {
        return pumpq;
    }

    public void setPumpq(BigDecimal pumpq) {
        this.pumpq = pumpq;
    }

    public BigDecimal getWellpower() {
        return wellpower;
    }

    public void setWellpower(BigDecimal wellpower) {
        this.wellpower = wellpower;
    }

    public String getWateraddr() {
        return wateraddr;
    }

    public void setWateraddr(String wateraddr) {
        this.wateraddr = wateraddr == null ? null : wateraddr.trim();
    }

    public Integer getCommunicationtype() {
        return communicationtype;
    }

    public void setCommunicationtype(Integer communicationtype) {
        this.communicationtype = communicationtype;
    }

    public Integer getFramestype() {
        return framestype;
    }

    public void setFramestype(Integer framestype) {
        this.framestype = framestype;
    }

    public Date getInstalldate() {
        return installdate;
    }

    public void setInstalldate(Date installdate) {
        this.installdate = installdate;
    }

    public Integer getMetertype() {
        return metertype;
    }

    public void setMetertype(Integer metertype) {
        this.metertype = metertype;
    }

    public Integer getCollovertime() {
        return collovertime;
    }

    public void setCollovertime(Integer collovertime) {
        this.collovertime = collovertime;
    }

    public String getGprsaddr() {
        return gprsaddr;
    }

    public void setGprsaddr(String gprsaddr) {
        this.gprsaddr = gprsaddr == null ? null : gprsaddr.trim();
    }

    public Integer getGprscycle() {
        return gprscycle;
    }

    public void setGprscycle(Integer gprscycle) {
        this.gprscycle = gprscycle;
    }

    public BigDecimal getCanpicknumber() {
        return canpicknumber;
    }

    public void setCanpicknumber(BigDecimal canpicknumber) {
        this.canpicknumber = canpicknumber;
    }

    public BigDecimal getSetpicknumber() {
        return setpicknumber;
    }

    public void setSetpicknumber(BigDecimal setpicknumber) {
        this.setpicknumber = setpicknumber;
    }

    public BigDecimal getPickalarmnumber() {
        return pickalarmnumber;
    }

    public void setPickalarmnumber(BigDecimal pickalarmnumber) {
        this.pickalarmnumber = pickalarmnumber;
    }

    public Integer getAreano() {
        return areano;
    }

    public void setAreano(Integer areano) {
        this.areano = areano;
    }

    public Integer getMeterno() {
        return meterno;
    }

    public void setMeterno(Integer meterno) {
        this.meterno = meterno;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getSyncflag() {
        return syncflag;
    }

    public void setSyncflag(Boolean syncflag) {
        this.syncflag = syncflag;
    }

    public Boolean getAudited() {
        return audited;
    }

    public void setAudited(Boolean audited) {
        this.audited = audited;
    }

    public String getBluetoothaddr() {
        return bluetoothaddr;
    }

    public void setBluetoothaddr(String bluetoothaddr) {
        this.bluetoothaddr = bluetoothaddr == null ? null : bluetoothaddr.trim();
    }

    public Date getLastcommdate() {
        return lastcommdate;
    }

    public void setLastcommdate(Date lastcommdate) {
        this.lastcommdate = lastcommdate;
    }

    public String getCurrentusernum() {
        return currentusernum;
    }

    public void setCurrentusernum(String currentusernum) {
        this.currentusernum = currentusernum == null ? null : currentusernum.trim();
    }

    public String getRemoteaddr() {
        return remoteaddr;
    }

    public void setRemoteaddr(String remoteaddr) {
        this.remoteaddr = remoteaddr == null ? null : remoteaddr.trim();
    }

    public Boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(Boolean isonline) {
        this.isonline = isonline;
    }

    public Boolean getOnlineenable() {
        return onlineenable;
    }

    public void setOnlineenable(Boolean onlineenable) {
        this.onlineenable = onlineenable;
    }

    public String getOnlinet1() {
        return onlinet1;
    }

    public void setOnlinet1(String onlinet1) {
        this.onlinet1 = onlinet1 == null ? null : onlinet1.trim();
    }

    public String getOnlinet2() {
        return onlinet2;
    }

    public void setOnlinet2(String onlinet2) {
        this.onlinet2 = onlinet2 == null ? null : onlinet2.trim();
    }

    public String getOnlinet3() {
        return onlinet3;
    }

    public void setOnlinet3(String onlinet3) {
        this.onlinet3 = onlinet3 == null ? null : onlinet3.trim();
    }

    public String getOnlinet4() {
        return onlinet4;
    }

    public void setOnlinet4(String onlinet4) {
        this.onlinet4 = onlinet4 == null ? null : onlinet4.trim();
    }

    public String getDefuploaddate() {
        return defuploaddate;
    }

    public void setDefuploaddate(String defuploaddate) {
        this.defuploaddate = defuploaddate == null ? null : defuploaddate.trim();
    }

    public String getWellproperty() {
        return wellproperty;
    }

    public void setWellproperty(String wellproperty) {
        this.wellproperty = wellproperty == null ? null : wellproperty.trim();
    }

    public String getRespperson() {
        return respperson;
    }

    public void setRespperson(String respperson) {
        this.respperson = respperson == null ? null : respperson.trim();
    }

    public String getResppersonphone() {
        return resppersonphone;
    }

    public void setResppersonphone(String resppersonphone) {
        this.resppersonphone = resppersonphone == null ? null : resppersonphone.trim();
    }

    public Integer getWelltype() {
        return welltype;
    }

    public void setWelltype(Integer welltype) {
        this.welltype = welltype;
    }

    public String getWellsimnb() {
        return wellsimnb;
    }

    public void setWellsimnb(String wellsimnb) {
        this.wellsimnb = wellsimnb == null ? null : wellsimnb.trim();
    }

    public Boolean getPresssendenable() {
        return presssendenable;
    }

    public void setPresssendenable(Boolean presssendenable) {
        this.presssendenable = presssendenable;
    }

    public Integer getOnlinedays() {
        return onlinedays;
    }

    public void setOnlinedays(Integer onlinedays) {
        this.onlinedays = onlinedays;
    }

    public String getGatewayaddr() {
        return gatewayaddr;
    }

    public void setGatewayaddr(String gatewayaddr) {
        this.gatewayaddr = gatewayaddr == null ? null : gatewayaddr.trim();
    }

    public BigDecimal getGatewaybattery() {
        return gatewaybattery;
    }

    public void setGatewaybattery(BigDecimal gatewaybattery) {
        this.gatewaybattery = gatewaybattery;
    }

    public Integer getUploadinterval() {
        return uploadinterval;
    }

    public void setUploadinterval(Integer uploadinterval) {
        this.uploadinterval = uploadinterval;
    }

    public Integer getValvestatus() {
        return valvestatus;
    }

    public void setValvestatus(Integer valvestatus) {
        this.valvestatus = valvestatus;
    }

    public Integer getAlarmtype() {
        return alarmtype;
    }

    public void setAlarmtype(Integer alarmtype) {
        this.alarmtype = alarmtype;
    }

	@Override
	public String toString() {
		return "Meter [meterid=" + meterid + ", metercode=" + metercode + ", metername=" + metername + ", meteraddr="
				+ meteraddr + ", mark=" + mark + ", villagecode=" + villagecode + ", position=" + position
				+ ", locationx=" + locationx + ", locationy=" + locationy + ", welldepth=" + welldepth + ", swater="
				+ swater + ", welltime=" + welltime + ", slvl=" + slvl + ", dlvl=" + dlvl + ", wtm=" + wtm + ", wdcp="
				+ wdcp + ", warea=" + warea + ", pumptp=" + pumptp + ", pumph=" + pumph + ", pumpq=" + pumpq
				+ ", wellpower=" + wellpower + ", wateraddr=" + wateraddr + ", communicationtype=" + communicationtype
				+ ", framestype=" + framestype + ", installdate=" + installdate + ", metertype=" + metertype
				+ ", collovertime=" + collovertime + ", gprsaddr=" + gprsaddr + ", gprscycle=" + gprscycle
				+ ", canpicknumber=" + canpicknumber + ", setpicknumber=" + setpicknumber + ", pickalarmnumber="
				+ pickalarmnumber + ", areano=" + areano + ", meterno=" + meterno + ", remark=" + remark + ", syncflag="
				+ syncflag + ", audited=" + audited + ", bluetoothaddr=" + bluetoothaddr + ", lastcommdate="
				+ lastcommdate + ", currentusernum=" + currentusernum + ", remoteaddr=" + remoteaddr + ", isonline="
				+ isonline + ", onlineenable=" + onlineenable + ", onlinet1=" + onlinet1 + ", onlinet2=" + onlinet2
				+ ", onlinet3=" + onlinet3 + ", onlinet4=" + onlinet4 + ", defuploaddate=" + defuploaddate
				+ ", wellproperty=" + wellproperty + ", respperson=" + respperson + ", resppersonphone="
				+ resppersonphone + ", welltype=" + welltype + ", wellsimnb=" + wellsimnb + ", presssendenable="
				+ presssendenable + ", onlinedays=" + onlinedays + ", gatewayaddr=" + gatewayaddr + ", gatewaybattery="
				+ gatewaybattery + ", uploadinterval=" + uploadinterval + ", valvestatus=" + valvestatus
				+ ", alarmtype=" + alarmtype + "]";
	}
    
    
}