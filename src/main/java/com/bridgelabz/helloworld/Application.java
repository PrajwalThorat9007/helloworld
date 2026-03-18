package com.bridgelabz.helloworld;

import com.bridgelabz.helloworld.component.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		System.out.println("Starting Spring");

		ApplicationContext context =
				SpringApplication.run(Application.class, args);

		System.out.println("Spring Started");

		EmployeeBean emp =
				context.getBean(EmployeeBean.class);

		emp.showEmployee();
	}
}