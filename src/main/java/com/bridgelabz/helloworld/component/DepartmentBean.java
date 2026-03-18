package com.bridgelabz.helloworld.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    private String deptName = "Computer Science";

    public DepartmentBean() {
        System.out.println("DepartmentBean created");
    }

    public String getDeptName() {
        return deptName;
    }
}