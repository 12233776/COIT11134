/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coitt11134.vehicledemo;

/**
 *
 * @author mangu
 */
public class Truck extends Vehicle {
    
    private int tonnage;
    public Truck(String model, String yearBuilt, double fuel, int t) {
        super(model, yearBuilt, fuel);
        this.tonnage=t;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
    
    @Override
    public String toString(){
    return super.toString() + ", Capacity: " +
             tonnage + " Tons";
    }
}
