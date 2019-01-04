package com.zhsw.rabbitmqaccess.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TreeDTO {
    private Integer id;
    private Integer parentId;
    private String parentCode;
    private String name;
    private String code;
    private String rank;

    public TreeDTO(String name, String code, String rank) {
        this.name = name;
        this.code = code;
        this.rank = rank;
    }
}
