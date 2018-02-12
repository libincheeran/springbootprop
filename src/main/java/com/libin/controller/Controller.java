package com.libin.controller;

import com.libin.bean.Person;
import com.libin.component.ServiceComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/libin")
public class Controller {

    private ServiceComponent component;

    public Controller(ServiceComponent component) {
        this.component = component;
    }

    @GetMapping(value = "/hello")
    public Person hello(){
        return component.hello();
    }
}
