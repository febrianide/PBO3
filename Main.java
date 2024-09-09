/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Fortuner", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Merah");
  
        System.out.println("Mobil 1:");
        mobil1.displayInfo();
        
        System.out.println("\n Mobil 2:");
        mobil2.displayInfo();
        
        mobil1.startEngine();
        mobil2.startEngine();
       
        mobil1.setWarna("Merah");
        mobil2.setWarna("army");
        
        System.out.println("\nMobil 1 Setelah Diubah Warna:");
        mobil1.displayInfo();
        
        System.out.println("\nMobil 2 Setelah Diubah Warna:");
        mobil2.displayInfo();
    }
}

    
    

