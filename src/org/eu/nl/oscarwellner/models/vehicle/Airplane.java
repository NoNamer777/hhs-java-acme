package org.eu.nl.oscarwellner.models.vehicle;

public class Airplane extends Vehicle {
    private final String repairMessage = "This airplane has been fixed. Replaced the pilot.";

    public Airplane(double price, int productionYear, String status) {
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
