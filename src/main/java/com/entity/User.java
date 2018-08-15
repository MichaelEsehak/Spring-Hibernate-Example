/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @Column
    private String name;

    public User() {
    }

    public User(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "id:" + super.getId() + " name:" + name;
    }

}
