/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repo;

import com.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Michael
 */
public interface UserRepo extends AbstractRepo<User>, UserRepoCustom {

}
