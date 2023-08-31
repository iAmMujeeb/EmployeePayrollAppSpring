package com.example.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeePayrollDTO {

    public String empName;
    public int salary;
    public int empId;

}
