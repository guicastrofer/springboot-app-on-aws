package com.springboot.with.aws.resource;


import com.springboot.with.aws.entity.DetailedMachine;
import com.springboot.with.aws.entity.Machine;
import com.springboot.with.aws.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "machines")
public class MachineResource {

    @Autowired
    MachineService machineService;

    @GetMapping(value = "/basic")
    public ResponseEntity<Machine> getMachineInformation(){
       Machine machine= machineService.getMachineInformation();
       return ResponseEntity.ok(machine);
    }
    @GetMapping(value = "/detailed")
    public ResponseEntity<DetailedMachine> getDetailedMachineInformation(){
        DetailedMachine detailedMachine = machineService.getDetailedMachineInformation();
        return ResponseEntity.ok(detailedMachine);
    }

}
