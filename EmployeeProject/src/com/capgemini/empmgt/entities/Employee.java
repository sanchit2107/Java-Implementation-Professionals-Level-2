package com.capgemini.empmgt.entities;

public class Employee {

    public Employee() {
        this(0,"");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance;

    public  double getBalance(){
        return balance;
    }

    public void addSalary(double salary){
        balance=balance+salary;
    }

    @Override
    public String toString() {
        String display=id+" "+name +" "+balance;
        return display;
    }

    @Override
    public boolean equals(Object obj) {
        // col.Employee e1=new col.Employee(10);
        // col.Employee e2=e1;
        //  boolean result=e1.equals(e2);
        //
        if(obj==this){
            return true;
        }
        //  col.Employee e1=new col.Employee(10);
        //   col.Employee e2=null;
        //boolean result=e1.equals(e2);
        //
        // col.Employee e1=new col.Employee(10);
        //  String e2="10";
        //boolean result=e1.equals(e2);
        //
        if(obj ==null|| !(obj instanceof Employee)){
            return false;
        }
        //
        //col.Employee e1=new col.Employee(10);
        // col.Employee e2=new col.Employee(10);
        //  boolean result=e1.equals(e2);
        Employee e=(Employee)obj;
        return e.id==this.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}

