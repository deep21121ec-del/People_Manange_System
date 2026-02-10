package com.peoplemanagement.model;

import java.time.LocalDate;

public class Person {

    private String personId;
    private String name;
    private LocalDate dob;
    private String email;
    private String phone;

    public Person(String personId, String name, LocalDate dob, String email, String phone) {
        this.personId = personId;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
    }

    public String getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PersonId=" + personId +
                ", Name=" + name +
                ", DOB=" + dob +
                ", Email=" + email +
                ", Phone=" + phone;
    }
}
