package com.java.proxy.dynamicproxy;

import com.java.proxy.dynamicproxy.handler.EmployeeInvocationHandler;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ITEmployee itEmployee = new ITEmployee(100,50000,"Dhanu");
        EmployeeInvocationHandler employeeInvocationHandler = new EmployeeInvocationHandler(itEmployee);

        Employee employee = (Employee) Proxy
                .newProxyInstance(
                        ITEmployee.class.getClassLoader(),//Class loader
                        new Class[]{Employee.class}, //Can have multiple implement classes
                        employeeInvocationHandler); //Handler
        employee.hikeSalary(2000);
    }
}
