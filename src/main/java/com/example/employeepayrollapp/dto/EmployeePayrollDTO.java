package com.example.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class EmployeePayrollDTO {

    @NotEmpty(message = "Employee Name cannot be empty")
    @Pattern(regexp = "^[A-Z][A-Za-z]{2,}$", message = "Employee name invalid")
    public String empName;

    @Min(value = 500,message = "Minimum salary should be more than 500")
    public int salary;

    public String gender;

    public String note;

    public LocalDate startDate;

    public String profilePic;

    public List<String> departments;

}
