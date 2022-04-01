package org.eu.nl.oscarwellner.models.employee;

public class Employee {
    private String name;
    private String address;
    private double salary;
    private Manager managedBy;

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Manager getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(Manager managedBy) {
        this.managedBy = managedBy;
    }
}
