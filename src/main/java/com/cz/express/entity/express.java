package com.cz.express.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@AllArgsConstructor
@Data
public class express {
    private  Integer id;
    private  String number;
    private  String username;
    private  String userphone;
    private  String company;
    private  String code;
    private  Timestamp intime;
    private  Timestamp outtime;
    private  Integer status;
    private  String sysPhone;
}
