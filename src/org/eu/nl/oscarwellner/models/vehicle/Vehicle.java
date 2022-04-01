package org.eu.nl.oscarwellner.models.vehicle;

public abstract class Vehicle {
    public final static String STATUS_FIXED =  "Fixed";

    private double price;
    private int productionYear;
    private String status;

    public Vehicle(double price, int productionYear, String status) {
        this.price = price;
        this.productionYear = productionYear;
        this.status = status;
    }

    public abstract void move();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    };
}
