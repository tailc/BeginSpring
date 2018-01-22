package com.congtai.ch02.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Account1 {

    private Date accessDate;

    private double balance;

    private long id;

    private String name;

}
