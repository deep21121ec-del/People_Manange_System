package com.peoplemanagement.model;

public class Academic {

    private String personId;
    private Double tenth;
    private Double twelfth;
    private Double graduation;

    public Academic(String personId, Double tenth, Double twelfth, Double graduation) {
        this.personId = personId;
        this.tenth = tenth;
        this.twelfth = twelfth;
        this.graduation = graduation;
    }

    public String getPersonId() {
        return personId;
    }

    public Double getTenth() {
        return tenth;
    }

    public Double getTwelfth() {
        return twelfth;
    }

    public Double getGraduation() {
        return graduation;
    }

    @Override
    public String toString() {
        return "10th=" + tenth + ", 12th=" + twelfth + ", Graduation=" + graduation;
    }
}
