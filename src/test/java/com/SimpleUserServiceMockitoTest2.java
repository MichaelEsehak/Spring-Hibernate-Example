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
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author Michael
 */

@RunWith(MockitoJUnitRunner.class)
public class SimpleUserServiceMockitoTest2 {

    @InjectMocks
    private SimpleUserService simpleUserService;

    @Mock
    private UserRepo userRepo;

//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void test() {
//        List<User> list = new ArrayList<>();
//        list.add(new User(1, "michael2"));
//
//        when(userRepo.getAll()).thenReturn(list);
//        when(userRepo.find(any(User.class))).thenReturn(new User(2,"monty"));
//        List<User> users=simpleUserService.getAll();
//        
//        User u=simpleUserService.find(new User(2,"mina"));
//        System.out.println(u);
//        
//        verify(userRepo, times(1)).getAll();
//        Assert.assertEquals(list.size(),users.size());
        
    }

}
