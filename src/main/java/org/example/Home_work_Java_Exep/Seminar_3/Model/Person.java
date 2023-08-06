package org.example.Home_work_Java_Exep.Seminar_3.Model;

public class Person {
    private String lastName;
    private String name;
    private String serName;
    private String dayBith;
    private int phoneNumber;
    private String sex;

    public Person(String lastName, String name, String serName, String dayBith, int phoneNumber, String sex) {
        this.lastName = lastName;
        this.name = name;
        this.serName = serName;
        this.dayBith = dayBith;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getDayBith() {
        return dayBith;
    }

    public void setDayBith(String dayBith) {
        this.dayBith = dayBith;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
