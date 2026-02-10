package com.peoplemanagement.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.peoplemanagement.model.*;
import com.peoplemanagement.service.PeopleManager;

public class MainApp {

    public static void main(String[] args) {

        PeopleManager service = new PeopleManager();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("PEOPLE MANAGEMENT SYSTEM");
            System.out.println("1. Add New Person");
            System.out.println("2. Update Person");
            System.out.println("3. Remove Person");
            System.out.println("4. Search Person");
            System.out.println("5. View All Details");
            System.out.println("6. View Identity Details");
            System.out.println("7. View Academic Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();//to clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Person ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter DOB (yyyy-mm-dd): ");
                    LocalDate dob = LocalDate.parse(sc.nextLine());

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    Person p = new Person(id, name, dob, email, phone);
                    service.addPerson(p);

                    System.out.println("Person added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Person ID to update: ");
                    String uid = sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter New DOB (yyyy-mm-dd): ");
                    LocalDate udob = LocalDate.parse(sc.nextLine());

                    System.out.print("Enter New Email: ");
                    String uemail = sc.nextLine();

                    System.out.print("Enter New Phone: ");
                    String uphone = sc.nextLine();

                    Person up = new Person(uid, uname, udob, uemail, uphone);

                    if (service.updatePerson(up)) {
                        System.out.println("Person updated.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Person ID to remove: ");
                    String rid = sc.nextLine();

                    if (service.removePerson(rid)) {
                        System.out.println("Person removed.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Person ID to search: ");
                    String sid = sc.nextLine();

                    if (service.searchById(sid)) {
                        System.out.println("Person found.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Person ID: ");
                    service.viewAll(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter Person ID: ");
                    service.viewIdentity(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Enter Person ID: ");
                    service.viewAcademic(sc.nextLine());
                    break;

                case 0:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    System.out.println("----------------");
            }

        } while (choice != 0);

        sc.close();
    }
}
