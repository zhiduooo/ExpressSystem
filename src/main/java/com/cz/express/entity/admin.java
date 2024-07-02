package com.cz.express.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@AllArgsConstructor
@Data
@TableName("admin")
public class admin {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private  String username;
    private  String password;
    private  String loginip;
    private  Timestamp logintime;
    private  Timestamp createtime;
}
