package com.libin.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("cmdb")
public class CMDBPropConfig {

    private String url;

    List<Integer> ports;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Integer> getPorts() {
        return ports;
    }

    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "CMDBPropConfig{" +
                "url='" + url + '\'' +
                ", ports=" + ports +
                '}';
    }
}
