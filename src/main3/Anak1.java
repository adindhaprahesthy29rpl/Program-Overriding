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
// Sub class atau clss Anak
// Class Anak1 sebagai sub class dari Induk
public class Anak1 extends Induk {
    
     @Override // Pemerapan overriding
     // Method untuk menampilkan pesan (overriding)
       public void pesan(){
         System.out.println("                         TETAP JAGA JARAK!                       ");
         System.out.println("                           PAKAI MASKER!                         ");
         System.out.println("                            CUCI TANGAN!                         ");
     }
}