/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coitt11134.vehicledemo;

/**
 *
 * @author mangu
 */
public class Vehicle {

    private String model;         // model description
    private String yearBuilt;     // Year& month it was built
    private double fuel;          // fuel economy

    //Constructor     
    public Vehicle(String model, String yearBuilt, double fuel) {
        this.model = model;
        this.yearBuilt = yearBuilt;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

         
    //return A string indicating the vehicle’s details.
    @Override
    public String toString() {
        return "Model: " + model + "\nYear built: "
                + yearBuilt + ", Fuel economy per litre: " + fuel + "km";

    }

}
