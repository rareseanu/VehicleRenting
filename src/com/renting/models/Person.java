package com.renting.models;

import java.time.LocalDate;

public class Person {
    private String personalIdNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfLicenseIssue;

    public Person(String personalIdNumber, String firstName, String lastName, String gender,
                  LocalDate dateOfBirth, LocalDate dateOfLicenseIssue) {
        this.personalIdNumber = personalIdNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfLicenseIssue = dateOfLicenseIssue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personalIdNumber='" + personalIdNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfLicenseIssue=" + dateOfLicenseIssue +
                '}';
    }

    public String getPersonalIdNumber() {
        return personalIdNumber;
    }

    public void setPersonalIdNumber(String personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfLicenseIssue() {
        return dateOfLicenseIssue;
    }

    public void setDateOfLicenseIssue(LocalDate dateOfLicenseIssue) {
        this.dateOfLicenseIssue = dateOfLicenseIssue;
    }
}
