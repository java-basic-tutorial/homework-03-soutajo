package com.softserveinc.task01;

public class Human {
    private String firstname;
    private String lasttname;
    private String dateOfBirth;
    private String phone;

    public Human() {
    }

    public Human(String firstname, String lasttname, String dateOfBirth, String phone) {
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lasttname='" + lasttname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
