package com.student.studentex.models;


public class Student {

    private String name;
    private String surname;
    private int result;

    public Student(String name, String surname, int result) {
        this.name = name;
        this.surname = surname;
        this.result = result;
    }

    public Student() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
