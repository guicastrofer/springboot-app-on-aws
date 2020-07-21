package com.springboot.with.aws.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Machine implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ip;
    private String name;
    private String os;
    private String architecture;
    private String osVersion;

}
