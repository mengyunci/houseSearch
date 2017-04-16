package com.unknow.entity;

import java.util.Date;

public class Menu {
    private Integer menuId;

    private String menuName;

    private Integer parent;

    private Integer menuEnable;

    private Integer menuSequence;

    private String url;

    private Date modifyTime;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getMenuEnable() {
        return menuEnable;
    }

    public void setMenuEnable(Integer menuEnable) {
        this.menuEnable = menuEnable;
    }

    public Integer getMenuSequence() {
        return menuSequence;
    }

    public void setMenuSequence(Integer menuSequence) {
        this.menuSequence = menuSequence;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}