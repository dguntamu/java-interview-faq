package com.java.faq.immutable;

/**
 * Student is a Immutable class where as Address is NOT.
 * Step-1: final class Student -> so that child classes can't change the content of Student
 * Step-2: Make the fields private, so that setter's are not required as we dont want to update the content.
 * Step-3: create Arg constructor to instantiate the Student object
 * Note: Address class is not final and its properties too not final, its mutable class
 */
final class Student {
    final private Integer studentId;
    final private String studentName;
    final private Address address;

    public Student(Integer studentId, String studentName, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                '}';
    }
}
