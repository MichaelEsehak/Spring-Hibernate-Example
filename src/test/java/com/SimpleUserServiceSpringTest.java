/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.conf.HibernateConfiguration;
import com.entity.User;
import com.service.CompanyService;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Michael
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HibernateConfiguration.class)
public class SimpleUserServiceSpringTest {

    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;

    @Test
    public void testConf() {

        //userService.findAll().forEach(System.out::println);
        //companyService.findAll().forEach(System.out::println);
        //  userService.printAll("user");
        // companyService.findAll();
        //companyService.printAll("Company");
//        Company c=new Company();
//        c.setName("arkdev");
//        companyService.save(c);
        User u = new User();
        u.setName("mary2");
        userService.save(u);
        userService.findAll().forEach(System.out::println);
        //userService.printAll("a7a2");
        //companyService.findAll().forEach(System.out::println);
    }
}
