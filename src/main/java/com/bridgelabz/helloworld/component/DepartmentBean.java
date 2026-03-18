package com.bridgelabz.helloworld.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    private String deptName = "Information Technology";

    public String getDeptName() {
        return deptName;
    }
}