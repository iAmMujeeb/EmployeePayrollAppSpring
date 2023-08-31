package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;
import java.util.Optional;

public interface EmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    Optional<EmployeePayrollData> getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

    String deleteEmployeePayrollDataById(int empId);
}
