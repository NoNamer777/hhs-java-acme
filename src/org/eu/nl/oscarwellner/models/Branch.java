package org.eu.nl.oscarwellner.models;

import org.eu.nl.oscarwellner.models.employee.Manager;

public class Branch {
    private String country;
    private String address;
    private Manager managedBy;

    public Branch(String country, String address, Manager managedBy) {
        this.country = country;
        this.address = address;
        this.managedBy = managedBy;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Manager getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(Manager managedBy) {
        this.managedBy = managedBy;
    }
}
