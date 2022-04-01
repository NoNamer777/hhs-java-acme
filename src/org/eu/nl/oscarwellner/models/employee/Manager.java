package org.eu.nl.oscarwellner.models.employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private final List<Employee> manages;

    public Manager(String name, String address, double salary) {
        super(name, address, salary);

        manages = new ArrayList<>();
    }

    public List<Employee> getManages() {
        return manages;
    }

    public void promoteEmployee(Employee employee) {
        if (!isManagingEmployee(employee)) return;

        employee.setSalary(employee.getSalary() * 1.05);
    }

    public void demoteEmployee(Employee employee) {
        if (!isManagingEmployee(employee)) return;

        employee.setSalary(employee.getSalary() * 0.95);
    }

    public void hireEmployee(Employee employee) {
        if (isManagingEmployee(employee)) return;

        manages.add(employee);
        employee.setManagedBy(this);
    }

    public void fireEmployee(Employee employee) {
        if (manages.isEmpty() || !isManagingEmployee(employee)) return;

        manages.remove(employee);
        employee.setManagedBy(null);
    }

    private boolean isManagingEmployee(Employee employee) {
        return manages.contains(employee) && employee.getManagedBy() == this;
    }
}
