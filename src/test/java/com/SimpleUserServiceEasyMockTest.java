/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.entity.User;
import com.repo.UserRepo;
import com.service.impl.SimpleUserService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;

import static org.easymock.EasyMock.*;
import org.junit.Test;

/**
 *
 * @author Michael
 */
public class SimpleUserServiceEasyMockTest {

    private UserRepo userMockRepo;
    private SimpleUserService simpleUserService;

    @Before
    public void init() {
//        userMockRepo = createMock(UserRepo.class);
//        simpleUserService = new SimpleUserService();
     //   simpleUserService.setRepo(userMockRepo);

    }

    @Test
    public void getAll() {
//        User simpleUser = new User(1, "michcael");
//        List<User> users = new ArrayList();
//        users.add(simpleUser);
//        expect(userMockRepo.findAll()).andReturn(users);
//        replay(userMockRepo);
//
//        List<User> result = simpleUserService.findAll();
//        verify(userMockRepo);
//
//        result.forEach(System.out::println);
    }

}
