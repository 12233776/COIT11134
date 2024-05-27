/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package coitt11134.employeeproj2;

import java.util.ArrayList;

/**
 *
 * @author mangu
 */
public class EmployeeProj2 {

    public static void main(String[] args) {

        ArrayList<Employee> pList = new ArrayList<Employee>();

        PieceWorker p1 = new PieceWorker("Lina", "Davis", 123, 54.24, 101);
        PieceWorker p2 = new PieceWorker("Michael", "Ronnie", 307, 41.25, 35);
        PieceWorker p3 = new PieceWorker("David", "Johns", 104, 50.0, 35);

        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        
        System.out.println("Employees:\n");

        for (int i = 0; i < pList.size(); i++) {
            pList.get(i);            
            System.out.println(pList.get(i).toString());

        }
    }
}
