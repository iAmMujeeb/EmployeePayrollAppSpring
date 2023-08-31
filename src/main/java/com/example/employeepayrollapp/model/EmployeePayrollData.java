package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_payroll")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollData {

    @Id
    @GeneratedValue
    private int empId;

    private String empName;
    private int salary;

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.salary = employeePayrollDTO.salary;
        this.empName = employeePayrollDTO.empName;
    }
}
