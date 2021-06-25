package com.company;

import java.util.ArrayList;
import java.util.List;

public class Email {

    private static String DOMAIN_NAME = "duotech.io";

    private String firstName = "";
    private String lastName = "";
    private List<String> emailAddress = new ArrayList<>();
    private String password = "";
    private String capacity = "";
    private String maxAttachmentSize = "";

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

    public List<String> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(List<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getMaxAttachmentSize() {
        return maxAttachmentSize;
    }

    public void setMaxAttachmentSize(String maxAttachmentSize) {
        this.maxAttachmentSize = maxAttachmentSize;
    }

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String generateEmail() {
        return "";
    }

    public String generatePassword() {
        return "";
    }

    @Override
    public String toString() {
        return " NAME: " + getFirstName() + " " + getLastName() + " GENERATED EMAIL ADDRESS: " + getEmailAddress() + " GENERATED PASSWORD: " + getPassword() + " CAPACITY: " + getCapacity() + " MAX ATTACHMENT SIZE: " + getMaxAttachmentSize();
    }

}