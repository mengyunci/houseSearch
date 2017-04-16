package com.unknow.dto;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by mac on 16/3/24.
 */

public class BaseMenu {
    private String id;
    private String text;
    private String state = "closed";
    private String url;
    private String parentId;

    private List<BaseMenu> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<BaseMenu> getChildren() {
        return children;
    }

    public void setChildren(List<BaseMenu> children) {
        this.children = children;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
