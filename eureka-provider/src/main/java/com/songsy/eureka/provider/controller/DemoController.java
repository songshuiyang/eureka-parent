package com.songsy.eureka.provider.controller;

import com.songsy.eureka.provider.domain.Person;
import com.songsy.eureka.provider.utils.IpConfigurationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author songshuiyang
 * @date 2018/8/15 13:50
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId, HttpServletRequest request) {
        Person person = new Person(personId, "songsy", 18);
        person.setName(person.getName() + "端口：" + IpConfigurationUtils.getPort());
        return person;
    }
}
