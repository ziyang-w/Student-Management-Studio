package com.wzy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stu {
    private String id;
    private String name;
    private String sex;
    private Date birth;
    private String note;
    private String major;
}
