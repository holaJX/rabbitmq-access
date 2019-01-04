package com.zhsw.rabbitmqaccess.webs;

/**
 * 模拟设备执行命令失败返回格式
 * @author ck
 *
 */
public class Result {

	
	public static String fail() {
		String result = "{\"Msg\":\"失败\",\"Result\":0}";
		return result;
	}
	
}
