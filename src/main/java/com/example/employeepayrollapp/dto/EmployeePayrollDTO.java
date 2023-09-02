package com.example.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
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

    @Min(value = 500, message = "Minimum salary should be more than 500")
    public int salary;

    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd MM yyyy")
    @NotNull(message = "Start Date should not be empty")
    @PastOrPresent(message = "Start Date should be past or today's date")
    public LocalDate startDate;

    @NotBlank(message = "Note cannot be empty")
    public String note;

    @NotBlank(message = "Profile Picture cannot be empty")
    public String profilePic;

    @NotNull(message = "Department should not be empty")
    public List<String> departments;

}
