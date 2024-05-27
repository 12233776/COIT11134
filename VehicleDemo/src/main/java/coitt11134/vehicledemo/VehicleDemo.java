/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package coitt11134.vehicledemo;

/**
 *
 * @author mangu
 */
public class VehicleDemo {

    public static void main(String[] args) {
        // To do :create three Vehicle objects
        Vehicle v1 = new Vehicle("Tesla", "2020-12", 8.0);
        Car c1 = new Car("Toyota", "2023-01", 10.0, 5);
        Truck t1 = new Truck("Benz", "2024-03", 12.0, 18);

        Vehicle v2 = new Car("HBYD","2024-01", 7.0, 5 ); 
        
/*
//call each object’s toString method
        System.out.println(v1.toString());
        System.out.println(c1.toString());
        System.out.println(t1.toString());
        System.out.println(v2.toString());
*/
      
        
        // using Array
        // Constant for the number of vehicle.
        final int NUM_VEHICLES = 3;

        // an array of Vehicle references.     
        Vehicle[] v = new Vehicle[NUM_VEHICLES];
        // Assign VEHICLE objects to the array elements.
        v[0] = v1;
        v[1] = c1;
        v[2] = t1;
        

        // Call each object's toString method.
        for (Vehicle i : v) {
            System.out.println(i.toString());

        }

    }
}
