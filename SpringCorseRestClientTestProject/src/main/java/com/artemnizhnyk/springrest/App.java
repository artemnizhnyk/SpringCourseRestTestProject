package com.artemnizhnyk.springrest;

import com.artemnizhnyk.springrest.configuration.MyConfig;
import com.artemnizhnyk.springrest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);
//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);
        communication.deleteEmployee(14);
    }
}
