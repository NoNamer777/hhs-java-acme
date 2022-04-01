package org.eu.nl.oscarwellner.models.vehicle;

public class Car extends Vehicle {
    private final String repairMessage = "This car has been fixed. Replaced the carburetor";

    public Car(double price, int productionYear, String status) {
        super(price, productionYear, status);
    }

    @Override
    public void move() {}

    @Override
    public void setStatus(String status) {
        super.setStatus(status);

        System.out.println(repairMessage);
    }
}
