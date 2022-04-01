package org.eu.nl.oscarwellner.models.employee;

import org.eu.nl.oscarwellner.models.vehicle.Vehicle;

public class Mechanic extends Employee {
    public Mechanic(String name, String address, double salary) {
        super(name, address, salary);
    }

    public void repair(Vehicle vehicle) {
        vehicle.setStatus(Vehicle.STATUS_FIXED);
    }
}
