package com.skni.warsztatysghv2.registration;


public class Student {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Status status;

    public Student(String id, String firstName, String lastName, String email, Status status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                '}';
    }
}
