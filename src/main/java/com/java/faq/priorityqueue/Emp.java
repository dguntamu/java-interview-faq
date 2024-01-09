package com.java.faq.priorityqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Comparable<Emp>{
    private Integer empId;
    private String empName;
    private Integer salary;


    @Override
    public int compareTo(Emp obj) {
        return obj.getEmpId() < this.getEmpId() ? 1 : -1;
    }
}
