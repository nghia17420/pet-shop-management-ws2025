package com.petshop.model;

import lombok.Data; 
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Shift {
    private int id;
    private int employeeId;
    private String shiftDate;
    private String startTime;
    private String endTime;
    private String attendanceStatus;
}
