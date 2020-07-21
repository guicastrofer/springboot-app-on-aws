package com.springboot.with.aws;

import com.springboot.with.aws.entity.DetailedMachine;
import com.springboot.with.aws.entity.Machine;
import com.springboot.with.aws.service.MachineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsServiceApplication.class, args);
	}

}
