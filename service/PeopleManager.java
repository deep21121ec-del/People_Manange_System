package com.peoplemanagement.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.peoplemanagement.model.Academic;
import com.peoplemanagement.model.Identity;
import com.peoplemanagement.model.Person;

public class PeopleManager {


    private Map<String, Person> personMap = new HashMap<>();
    private Map<String, Academic> academicMap = new HashMap<>();
    private Map<String, Identity> identityMap = new HashMap<>();



    public PeopleManager() {

        Person p1 = new Person(
                "P101",
                "Ravi",
                LocalDate.of(2000, 5, 12),
                "ravi@mail.com",
                "9876543210");

        Person p2 = new Person(
                "P102",
                "Anita",
                LocalDate.of(1999, 3, 20),
                "anita@mail.com",
                "9123456789");

        personMap.put(p1.getPersonId(), p1);
        personMap.put(p2.getPersonId(), p2);

        academicMap.put("P101",
                new Academic("P101", 85.5, 88.2, 72.3));

        identityMap.put("P101",
                new Identity("P101", "PASS123", "123412341234", "ABCDE1234F"));
    }


    public void addPerson(Person p) {
        personMap.put(p.getPersonId(), p);
    }

    public boolean updatePerson(Person p) {
        if (personMap.containsKey(p.getPersonId())) {
            personMap.put(p.getPersonId(), p);
            return true;
        }
        return false;
    }


    public boolean removePerson(String personId) {
        if (personMap.containsKey(personId)) {
            personMap.remove(personId);
            academicMap.remove(personId);
            identityMap.remove(personId);
            return true;
        }
        return false;
    }


    public boolean searchById(String personId) {
        return personMap.containsKey(personId);
    }


    public boolean searchByName(String name) {
        for (Person p : personMap.values()) {
            if (p.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }


    public void viewAll(String personId) {
        System.out.println(personMap.get(personId));
        System.out.println(academicMap.get(personId));
        System.out.println(identityMap.get(personId));
    }


    public void viewIdentity(String personId) {
        Person p = personMap.get(personId);
        Identity i = identityMap.get(personId);

        System.out.println("Name: " + p.getName());
        System.out.println(i);
    }



    public void viewAcademic(String personId) {
        Person p = personMap.get(personId);
        Academic a = academicMap.get(personId);

        System.out.println("Name: " + p.getName());
        System.out.println(a);
    }
}
