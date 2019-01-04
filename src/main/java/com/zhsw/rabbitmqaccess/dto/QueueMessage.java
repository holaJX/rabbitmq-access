package com.zhsw.rabbitmqaccess.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueueMessage {
    /**
     * 操作类型 1：新增  2：修改
     */
    private  int operation;
    private  Object data;
    private  String msg;
}
