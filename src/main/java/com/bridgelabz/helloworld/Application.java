package com.bridgelabz.helloworld;

import com.bridgelabz.helloworld.component.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		System.out.println("Before Spring Run");

		ApplicationContext context =
				SpringApplication.run(Application.class, args);

		System.out.println("After Spring Run");

		EmployeeBean emp =
				context.getBean(EmployeeBean.class);

		System.out.println("Bean received from IoC");

		emp.showEmployee();
	}
}