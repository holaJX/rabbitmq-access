package com.zhsw.rabbitmqaccess.dto;

/**
 * 账户密码
 * @author ck
 *
 */
public class VisitorInfoDTO {
	
 private String userName;
 private String password;

	public VisitorInfoDTO(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
 
}
