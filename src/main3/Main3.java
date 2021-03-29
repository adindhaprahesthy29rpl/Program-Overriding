/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

/**
 *
 * @author MOKLET-2
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herea
   
        Induk objek1 = new Induk(); // Objek untuk memanggil class induk
        Anak1 objek2 = new Anak1(); // Objek untuk memanggil class Anak1
        Anak2 objek3 = new Anak2(); // Objek untuk memanggil class Anak2
        Induk objekk = new Anak1(); // Objek untuk memanggil class Anak1 sbagai sub class dari Induk
        Induk objekkk = new Anak2(); // Objek untuk memanggil class Anak2 sbagai sub class dari Induk
        
        // Untuk menjalankan method
        objek1.judul();
        objek1.daftarTiket();
        objek1.pemesanan();
        objek1.pilihan();
        objek1.pesan();
        objekk.pesan();
        objekkk.pesan();    
    }   
}
