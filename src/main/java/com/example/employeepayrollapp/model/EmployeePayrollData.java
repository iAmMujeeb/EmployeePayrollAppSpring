package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "emp_payroll")
@Data
public class EmployeePayrollData {

    @Id
    @GeneratedValue
    private int empId;

    private String empName;
    private int salary;

    public EmployeePayrollData(int i, EmployeePayrollDTO pankaj) {
    }
}
