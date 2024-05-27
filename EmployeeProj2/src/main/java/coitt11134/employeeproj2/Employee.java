/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coitt11134.employeeproj2;

/**
 *
 * @author mangu
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private int socialNo;

    //left side instance field we assign to parameters on the right side.   
    public Employee(String firstName, String lastName, int socialNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNo = socialNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSocialNo() {
        return socialNo;
    }

    public void setSocialNo(int socialNo) {
        this.socialNo = socialNo;
    }
    
    public abstract double earnings(); //class must be also declared as abstract
    
    @Override
    public String toString(){
    
    return "First Name: " + firstName + ", Last Name: " + lastName + ", "; 
    }
    
    
}
