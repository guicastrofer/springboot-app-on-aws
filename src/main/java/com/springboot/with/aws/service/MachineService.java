package com.springboot.with.aws.service;

import com.springboot.with.aws.entity.DetailedMachine;
import com.springboot.with.aws.entity.Machine;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;

@Service
public class MachineService {

    @GetMapping("/basic")
    public Machine getMachineInformation(){
        try {
            InetAddress address = InetAddress.getLocalHost();
            String ip = address.getHostAddress();
            String name = address.getHostName();
            String os = System.getProperty("os.name");
            String arch = System.getProperty("os.arch");
            String osVersion = System.getProperty("os.version");
            Machine machine = new Machine(ip, name, os, arch, osVersion);
            return machine;
        } catch(UnknownHostException e){
            e.printStackTrace();
        }
        return null;
    }

    public DetailedMachine getDetailedMachineInformation() {
        Machine machine = getMachineInformation();
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorUrl = System.getProperty("java.vendor.url");
        DetailedMachine detailedMachine = new DetailedMachine(machine, javaVersion, javaVendor, javaVendorUrl);
        return detailedMachine;
    }

}
