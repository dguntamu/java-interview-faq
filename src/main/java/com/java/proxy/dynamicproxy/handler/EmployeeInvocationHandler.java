package com.java.proxy.dynamicproxy.handler;

import com.java.proxy.dynamicproxy.Employee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler implements InvocationHandler {

    private Employee employee;

    //Injecting implementation of Employee object, in this case ITEemployee.
    public EmployeeInvocationHandler(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //pre processing logic goes here
        Integer amount = (Integer) args[0];
        if(amount <=0){
            throw new RuntimeException("-ve amount cant be given here.");
        }

        //actual method invoking
        Integer result = (Integer) method.invoke(employee,args);


        //post processing logic goes here
        System.out.println("Return value is --> "+result);
        return result;
    }
}
