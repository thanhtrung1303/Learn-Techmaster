package model;

import util.Util;

import java.time.LocalDate;
import java.util.Arrays;

public class Teacher {
    private String idTeacher;
    private String name;
    private int year;
    private String address;
    private Subject subject;
    private String mainClass;
    private String[] teachClass;
    private final int startYear;
    private int salary;
    private int seniority;

    public Teacher(String idTeacher, String name, int year, String address, Subject subject, String mainClass, String[] teachClass, int startYear) {
        this.idTeacher = idTeacher;
        this.name = name;
        this.year = year;
        this.address = address;
        this.subject = subject;
        this.mainClass = mainClass;
        this.teachClass = teachClass;
        this.startYear = startYear;
        this.seniority = countSeniority();
        this.salary = countSalary();

    }

    public Teacher(String idTeacher, String name, int year, String address, Subject subject, int startYear) {
        this.idTeacher = idTeacher;
        this.name = name;
        this.year = year;
        this.address = address;
        this.subject = subject;
        this.startYear = startYear;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setYear(int year) {
        this.year = year;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String[] getTeachClass() {
        return teachClass;
    }


    public int countSeniority() {
        return LocalDate.now().getYear() - startYear;
    }

    public int countSalary() {
        return 5000000 + seniority * 150000;
    }

    public void showTeacherInfomation() {
        System.out.printf("%-10s %-20s %-10d %-10s %-10s %-10s %-20s %-10d %-10d %-10s \n", idTeacher, name, year, address, subject.getValue(), mainClass, Arrays.toString(teachClass), startYear, countSeniority(), Util.formatMoney(countSalary()));
    }

    @Override
    public String toString() {
        return idTeacher + " - " + name + " - " + year + " - " + address + " - " + subject.getValue() + " - " + mainClass +
                " - " + Arrays.toString(teachClass) + " - " + startYear + " - " + countSeniority();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
