package org.eu.nl.oscarwellner.models.vehicle;

public class Bike extends Vehicle {
    private final String repairMessage = "";

    public Bike(double price, int productionYear, String status) {
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
