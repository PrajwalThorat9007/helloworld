package com.bridgelabz.helloworld.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private int id = 101;
    private String name = "Prajwal";

    private DepartmentBean departmentBean;

    // ---------- Field Injection ----------
    @Autowired
    private DepartmentBean fieldDept;

    // ---------- Constructor Injection ----------
    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    // ---------- Setter Injection ----------
    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public void showEmployee() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

        System.out.println("Dept (constructor/setter): "
                + departmentBean.getDeptName());

        System.out.println("Dept (field): "
                + fieldDept.getDeptName());
    }
}