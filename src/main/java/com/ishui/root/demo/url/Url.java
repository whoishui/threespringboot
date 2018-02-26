package com.ishui.root.demo.url;

import com.ishui.root.demo.domin.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/**
 * @Description: [一句话描述该类的功能]
 * @Author: [李晓晖]
 */
@RestController
public class Url {
    @Autowired
    Person person;

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name){
        return "您好，" + name;
    }

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(){
        return person.toString();
    }

    @RequestMapping(value = "/world",method = RequestMethod.GET)
    public String world(String name){
        return "这里添加" + name;
    }
}
