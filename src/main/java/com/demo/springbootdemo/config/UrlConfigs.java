package com.demo.springbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "urlconfigs")
public class UrlConfigs {
    private String queryUserInfo;
    private String editUserInfo;

    public String getQueryUserInfo() {
        return queryUserInfo;
    }

    public void setQueryUserInfo(String queryUserInfo) {
        this.queryUserInfo = queryUserInfo;
    }

    public String getEditUserInfo() {
        return editUserInfo;
    }

    public void setEditUserInfo(String editUserInfo) {
        this.editUserInfo = editUserInfo;
    }
}
