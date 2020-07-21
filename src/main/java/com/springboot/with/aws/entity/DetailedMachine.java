package com.springboot.with.aws.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter

public class DetailedMachine extends Machine implements Serializable {

    private static final long serialVersionUID = 1L;


    private String javaVersion;
    private String javaVendor;
    private String javaVendorUrl;

    public DetailedMachine(Machine machine, String javaVersion, String javaVendor, String javaVendorUrl) {
        super(machine.getIp(), machine.getName(), machine.getOs(), machine.getArchitecture(),machine.getOsVersion());
        this.javaVersion = javaVersion;
        this.javaVendor = javaVendor;
        this.javaVendorUrl = javaVendorUrl;
    }
}
