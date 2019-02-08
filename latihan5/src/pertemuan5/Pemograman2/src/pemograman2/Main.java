/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Pemograman2.src.pemograman2;

import java.util.HashSet;

/**
 *
 * @author Komp31
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student();
        Student student1 = new Student();
        
        System.out.println("nama : " + student.getNama());
        student.setNama("Kuya Batok");
        System.out.println("nama : " + student.getNama());
    }

}
