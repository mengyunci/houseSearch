package com.unknow.entity;

import java.math.BigDecimal;
import java.util.List;

public class Area {
    private String areaSerial;

    private String areaCode;

    private String areaName;

    private String areaMemo;

    private Integer buildingCount;

    private Long houseCount;

    private BigDecimal jzmj;

    private String areaZhcode;

    private String areaOld;

    private List<Area> children;

    public String getAreaSerial() {
        return areaSerial;
    }

    public void setAreaSerial(String areaSerial) {
        this.areaSerial = areaSerial == null ? null : areaSerial.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaMemo() {
        return areaMemo;
    }

    public void setAreaMemo(String areaMemo) {
        this.areaMemo = areaMemo == null ? null : areaMemo.trim();
    }

    public Integer getBuildingCount() {
        return buildingCount;
    }

    public void setBuildingCount(Integer buildingCount) {
        this.buildingCount = buildingCount;
    }

    public Long getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(Long houseCount) {
        this.houseCount = houseCount;
    }

    public BigDecimal getJzmj() {
        return jzmj;
    }

    public void setJzmj(BigDecimal jzmj) {
        this.jzmj = jzmj;
    }

    public String getAreaZhcode() {
        return areaZhcode;
    }

    public void setAreaZhcode(String areaZhcode) {
        this.areaZhcode = areaZhcode == null ? null : areaZhcode.trim();
    }

    public String getAreaOld() {
        return areaOld;
    }

    public void setAreaOld(String areaOld) {
        this.areaOld = areaOld == null ? null : areaOld.trim();
    }

    public List<Area> getChildren() {
        return children;
    }

    public void setChildren(List<Area> children) {
        this.children = children;
    }
}