package com.example.restservice;

import org.springframework.stereotype.Service;

@Service
public class StudentSevice {

    private String name = " ";

    public void test(){
        System.out.println(this.hashCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
