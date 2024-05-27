/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coitt11134.employeeproj2;

/**
 *
 * @author mangu
 */
public class PieceWorker extends Employee {
    
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, int socialNo, double w, int p) {
        super(firstName, lastName, socialNo);
        this.wage=w;
        this.pieces=p;        
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
    
    
    @Override
    public double earnings() {
        return (wage * pieces);//total earnings
    }
    
    @Override
    public String toString() {
        return super.toString() + "Wages: " + wage + " pieces: " + pieces + ", Total earnings: $" + this.earnings()+ "\n";
    
    }
}
