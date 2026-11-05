package org.example;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class StockItem {
    private String id;
    @NotNull
    private VehicleType vehicleType;
    @Size(min = 1, max = 20)
    private String make;
    @Size(min = 1, max = 10)
    private String model;
    private String registration;
    @NotNull
    private String vin;
    private LocalDate dateOfRegistration;
    @Positive
    private Long price;
    private boolean scrapped;
    private boolean stolen;
    private boolean exported;

    ///
    /// Fix me
    public static String generateAdvertTitle(StockItem stockItem) {
        int year = stockItem.getDateOfRegistration().getYear();

        return year + " " + stockItem.getMake() + " " + stockItem.getModel();
    }

    public enum VehicleType {
        CARS,
        BIKE,
        VAN
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isScrapped() {
        return scrapped;
    }

    public void setScrapped(boolean scrapped) {
        this.scrapped = scrapped;
    }

    public boolean isStolen() {
        return stolen;
    }

    public void setStolen(boolean stolen) {
        this.stolen = stolen;
    }

    public boolean isExported() {
        return exported;
    }

    public void setExported(boolean exported) {
        this.exported = exported;
    }



}