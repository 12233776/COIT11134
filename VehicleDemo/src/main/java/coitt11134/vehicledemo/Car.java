/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coitt11134.vehicledemo;

/**
 *
 * @author mangu
 */
public class Car extends Vehicle {
    
    private int passengers;
    
    public Car(String model, String yearBuilt, double fuel, int p) {
        super(model, yearBuilt, fuel);
        this.passengers=p;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    
    @Override
    public String toString(){
    return super.toString() + ", Maximum passengers: " +
             passengers;
    }




}
