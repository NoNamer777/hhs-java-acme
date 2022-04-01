package org.eu.nl.oscarwellner.models.employee;

import org.eu.nl.oscarwellner.models.vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class Purchaser extends Employee {
    private double budget;
    private final List<Car> purchasedCars;

    public Purchaser(String name, String address, double salary, double budget) {
        super(name, address, salary);

        this.budget = budget;
        this.purchasedCars = new ArrayList<>();
    }

    public boolean purchaseCar(Car car) {
        if (budget - car.getPrice() < 0) return false;

        buyCar(car);

        return true;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Car> getPurchasedCars() {
        return purchasedCars;
    }

    public void sellCar(Car car) {
        if (purchasedCars.isEmpty() || !purchasedCars.contains(car)) return;

        purchasedCars.remove(car);
        budget += (car.getPrice() * 1.1);
    }

    private void buyCar(Car car) {
        purchasedCars.add(car);
        budget -= car.getPrice();
    }
}
