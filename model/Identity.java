package com.peoplemanagement.model;

public class Identity {

    private String personId;
    private String passport;
    private String aadhar;
    private String pan;

    public Identity(String personId, String passport, String aadhar, String pan) {
        this.personId = personId;
        this.passport = passport;
        this.aadhar = aadhar;
        this.pan = pan;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPassport() {
        return passport;
    }

    public String getAadhar() {
        return aadhar;
    }

    public String getPan() {
        return pan;
    }

    @Override
    public String toString() {
        return "Passport=" + passport + ", Aadhar=" + aadhar + ", PAN=" + pan;
    }
}
