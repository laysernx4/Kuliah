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
public class Person {
    String name;
    String address;
    public Person(){
        System.out.println("Inside Person:Constructor");
    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getNama(){
        return this.name;
    }
    public void setNama(String namanya){
        this.name = namanya;
    }
    public String getLokasi(){
        return this.address;
    }
    public void setLokasi(String alamat){
        this.address = alamat;
    }
}
