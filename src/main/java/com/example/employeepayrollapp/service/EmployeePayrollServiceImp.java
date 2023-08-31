package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollServiceImp implements EmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;
    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
        return employeePayrollRepository.save(employeePayrollData);
    }

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollRepository.findAll();
    }

    @Override
    public Optional<EmployeePayrollData> getEmployeePayrollDataById(int empId) {
        return employeePayrollRepository.findById(empId);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        Optional<EmployeePayrollData> employeePayrollData = getEmployeePayrollDataById(empId);
        if(employeePayrollData.isPresent()){
            employeePayrollData.get().setEmpName(employeePayrollDTO.empName);
            employeePayrollData.get().setSalary(employeePayrollDTO.salary);
            return employeePayrollRepository.save(employeePayrollData.get());
        }
        return null;
    }

    @Override
    public String deleteEmployeePayrollDataById(int empId) {
        Optional<EmployeePayrollData> employeePayrollData = getEmployeePayrollDataById(empId);
        if(employeePayrollData.isPresent()){
            employeePayrollRepository.deleteById(empId);
            return "Deleted Successfully!";
        }
        return "Failed!";
    }

}
