package com.ciusyan.bootcst.pojo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Skill {

    /**
     * 主键
     */
    private Short id;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 技能名称
     */
    private String name;
    /**
     * 技能等级
     */
    private Short level;
}
