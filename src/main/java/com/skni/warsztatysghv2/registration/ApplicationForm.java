package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

@Component
public class ApplicationForm {

    private final String firstName;
    private final String lastName;
    private final String email;

    public ApplicationForm(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
