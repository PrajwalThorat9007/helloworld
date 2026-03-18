package com.bridgelabz.helloworld.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private int id = 101;
    private String name = "Prajwal";

    @Autowired
    private DepartmentBean departmentBean;

    public void showEmployee() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + departmentBean.getDeptName());
    }
}