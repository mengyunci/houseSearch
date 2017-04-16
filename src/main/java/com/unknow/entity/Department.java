package com.unknow.entity;

public class Department {
    private String departmentSerial;

    private String departmentName;

    private String departmentAllname;

    private String departmentPerson;

    private String departmentTel;

    private String departmentId;

    private String departmentMemo;

    private Integer danweiCount;

    private Integer bumenCount;

    private Integer jigouCount;

    private String departmentSpell;

    private String departmentCode;

    private String departmentZhcode;

    public String getDepartmentSerial() {
        return departmentSerial;
    }

    public void setDepartmentSerial(String departmentSerial) {
        this.departmentSerial = departmentSerial == null ? null : departmentSerial.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentAllname() {
        return departmentAllname;
    }

    public void setDepartmentAllname(String departmentAllname) {
        this.departmentAllname = departmentAllname == null ? null : departmentAllname.trim();
    }

    public String getDepartmentPerson() {
        return departmentPerson;
    }

    public void setDepartmentPerson(String departmentPerson) {
        this.departmentPerson = departmentPerson == null ? null : departmentPerson.trim();
    }

    public String getDepartmentTel() {
        return departmentTel;
    }

    public void setDepartmentTel(String departmentTel) {
        this.departmentTel = departmentTel == null ? null : departmentTel.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getDepartmentMemo() {
        return departmentMemo;
    }

    public void setDepartmentMemo(String departmentMemo) {
        this.departmentMemo = departmentMemo == null ? null : departmentMemo.trim();
    }

    public Integer getDanweiCount() {
        return danweiCount;
    }

    public void setDanweiCount(Integer danweiCount) {
        this.danweiCount = danweiCount;
    }

    public Integer getBumenCount() {
        return bumenCount;
    }

    public void setBumenCount(Integer bumenCount) {
        this.bumenCount = bumenCount;
    }

    public Integer getJigouCount() {
        return jigouCount;
    }

    public void setJigouCount(Integer jigouCount) {
        this.jigouCount = jigouCount;
    }

    public String getDepartmentSpell() {
        return departmentSpell;
    }

    public void setDepartmentSpell(String departmentSpell) {
        this.departmentSpell = departmentSpell == null ? null : departmentSpell.trim();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public String getDepartmentZhcode() {
        return departmentZhcode;
    }

    public void setDepartmentZhcode(String departmentZhcode) {
        this.departmentZhcode = departmentZhcode == null ? null : departmentZhcode.trim();
    }
}