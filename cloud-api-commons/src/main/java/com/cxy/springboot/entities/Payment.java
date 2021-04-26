package com.cxy.springboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;


/**
 * @Author ChenXingYu
 * @Date 2020/11/18 20:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    private Long id;

    private String serial;
}
