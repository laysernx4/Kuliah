/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Pemograman2.src.pemograman2;

/**
 *
 * @author Komp31
 */
public class Student extends Person {
    public Student(){
        super("Nama dari super", "Alamat dari super");
       // super();
       // super.address = "alamat diganti dari super";
        System.out.println("Inside Student:Constructor");
    }

    public Student(String name, String address) {
        super(name, address);
    }
    
   /*& public String getNama{
        return ;
    } */
}
