package com.company;

public class Worker extends Person{

    private int salary;
    private String rang;

    @Override
    public String toString() {
        return super.toString()+" "+
                "salary=" + salary +
                ", rang='" + rang + '\'' +
                '}';
    }

    public Worker(String name, int age, String country) {
        super(name, age, country);
    }

    public int getSalary() {
        return salary;
    }

    public String getRang() {
        return rang;
    }

    public Worker(String name, int age, String country, int salary, String rang) {
        super(name, age, country);
        this.salary = salary;
        this.rang = rang;
    }
}
