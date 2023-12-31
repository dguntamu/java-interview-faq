package com.java.proxy.dynamicproxy;

import com.java.proxy.dynamicproxy.handler.EmployeeInvocationHandler;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ITEmployee itEmployee = new ITEmployee(100,50000,"Dhanu");
        EmployeeInvocationHandler employeeInvocationHandler = new EmployeeInvocationHandler(itEmployee);

        //Getting Proxy from Handler class, SOLID
        Employee employee = employeeInvocationHandler.getProxy();
        employee.hikeSalary(2000);
    }


}
