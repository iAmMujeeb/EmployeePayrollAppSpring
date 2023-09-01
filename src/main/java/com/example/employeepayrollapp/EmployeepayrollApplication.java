package com.example.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeepayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeepayrollApplication.class, args);
        log.info("Welcome to Employee Payroll App");
    }

}
