package com.petshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shift {
    private int id;
    private int employeeId;
    private LocalDate shiftDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String attendanceStatus;
}
