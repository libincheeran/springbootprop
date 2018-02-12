package com.libin.component;

import com.libin.bean.CMDBPropConfig;
import com.libin.bean.Config;
import com.libin.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceComponent {

    private Config cfg;
    private CMDBPropConfig cmdbProp;

    public ServiceComponent(Config cfg, CMDBPropConfig cmdbProp) {
        this.cfg = cfg;
        this.cmdbProp = cmdbProp;
    }

    public Person hello(){

        Person p = new Person();
        p.setName(cfg.getName());
        p.setAge(cfg.getAge());
        System.out.println(cmdbProp);
        return p;

    }
}
