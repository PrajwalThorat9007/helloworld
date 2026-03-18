package com.bridgelabz.helloworld.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private int id = 101;
    private String name = "Prajwal";

    private DepartmentBean departmentBean;

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
        System.out.println("EmployeeBean created");
    }

    public void showEmployee() {

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: "
                + departmentBean.getDeptName());
    }
}