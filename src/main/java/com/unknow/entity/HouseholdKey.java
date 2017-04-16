package com.unknow.entity;

public class HouseholdKey {
    private String areaSerial;

    private String employeeSerial;

    public String getAreaSerial() {
        return areaSerial;
    }

    public void setAreaSerial(String areaSerial) {
        this.areaSerial = areaSerial == null ? null : areaSerial.trim();
    }

    public String getEmployeeSerial() {
        return employeeSerial;
    }

    public void setEmployeeSerial(String employeeSerial) {
        this.employeeSerial = employeeSerial == null ? null : employeeSerial.trim();
    }
}