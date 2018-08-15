/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.entity.User;
import com.repo.UserRepo;
import com.service.impl.SimpleUserService;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 *
 * @author Michael
 */
public class SimpleUserServiceMockitoTest {

    UserRepo mockUserRepo;
    SimpleUserService simpleUserService;

    @Before
    public void init() {
//        simpleUserService = new SimpleUserService();
//        mockUserRepo = mock(UserRepo.class);
//        //simpleUserService.setRepo(mockUserRepo);

    }

    @Test
    public void printUsersTest() {

//        List<User> list = Arrays.asList(new User(1, "michael"), new User(2, "monty"));
//        when(mockUserRepo.findAll()).thenReturn(list);
//        List<User> result = simpleUserService.findAll();
//        assertEquals(list.size(), result.size());

    }

}
