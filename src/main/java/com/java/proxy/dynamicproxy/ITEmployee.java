package com.java.proxy.dynamicproxy;

public class ITEmployee implements Employee {
    private Integer salary;
    private String empName;
    private Integer empId;

    public ITEmployee(Integer empId, Integer salary, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public Integer hikeSalary(Integer hike) {
        System.out.println("Inside hikeSalary()");
        return this.salary+hike;
    }

    @Override
    public Integer cutSalary(Integer deductAmount) {
        System.out.println("Inside cutSalary()");
        return this.salary-deductAmount;
    }
}
