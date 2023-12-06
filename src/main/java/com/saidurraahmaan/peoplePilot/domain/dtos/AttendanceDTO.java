package com.saidurraahmaan.peoplePilot.domain.dtos;

import com.saidurraahmaan.peoplePilot.domain.entities.Attendance;
import com.saidurraahmaan.peoplePilot.domain.entities.Employee;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
public class AttendanceDTO {

    private int id;
    private Employee employee;
    private LocalDate attendanceDate;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    static AttendanceDTO fromEntity(Attendance attendance) {
        var attendanceDTO = new AttendanceDTO();
        attendanceDTO.setId(attendanceDTO.getId());
        attendanceDTO.setEmployee(attendance.getEmployee());
        attendanceDTO.setCheckInTime(attendance.getCheckInTime());
        attendanceDTO.setCheckOutTime(attendance.getCheckOutTime());
        attendanceDTO.setAttendanceDate(attendance.getAttendanceDate());
        return attendanceDTO;
    }
}
