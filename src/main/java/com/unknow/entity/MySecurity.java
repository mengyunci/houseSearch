package com.unknow.entity;

public class MySecurity {
    private String employeeSerial;

    public String getEmployeeSerial() {
        return employeeSerial;
    }

    public void setEmployeeSerial(String employeeSerial) {
        this.employeeSerial = employeeSerial == null ? null : employeeSerial.trim();
    }
}