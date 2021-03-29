/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Induk {
    // Inputan user    
    Scanner input = new Scanner(System.in);
    
    // Variabel instance
    public String nama;
    public int pilihan, banyak;
    public double totalHarga,pembayaran, kembalian;
    
    // Method untuk judul program
    public void judul(){
        System.out.println("===================================================================");
        System.out.println("                      PROGRAM TIKET KERETA API                     ");
        System.out.println("===================================================================");
    }
    
    // Method untuk daftar tiket
    public void daftarTiket(){
        System.out.println(" ");
        System.out.println("                            DAFTAR TIKET KA                         ");
        System.out.println("--------------------------------------------------------------------");  
        System.out.println("| NO |    NAMA KA     |            TUJUAN          |     HARGA     |");
        System.out.println("| 1. |Tegal Bahari    |        Gambir - Tegal      |Rp. 80.000-,   |");
        System.out.println("| 2. |Gajayana        |        Gambir - Malang     |Rp. 90.000-,   |");
        System.out.println("| 3. |Taksaka         |        Gambir - Yogyakarta |Rp. 60.000-,   |");
        System.out.println("--------------------------------------------------------------------");  
    }
    
    // Method untuk pemesanan tiket
    public void pemesanan(){
        System.out.println(" "); // Penjeda
        System.out.print("Masukkan Nama Anda : ");
         nama = input.nextLine();      
        System.out.print("Masukkan Pilihan Anda [1/2/3] : ");
         pilihan = input.nextInt(); 
    }
    
    // Method untuk pilihan
    public void pilihan(){ 
         switch (pilihan) { // Kondisi percabangan dengan menggunakan switch case
            case (1): // Case 1 atau pilihan 1
                System.out.println("Pilihan Anda Adalah | 1. |Tegal Bahari | Gambir - Tegal   |"); // Menampilkan tiket yang dipesan
                System.out.println("Harga Tiket                : Rp. 80.000-,"); // Menampilkan harga tiket yang dipesan
                System.out.print("Masukkan Jumlah Tiket      : ");
                banyak = input.nextInt(); // User memasukkan jumlah tiket yang akan dipesan
                totalHarga = 80000*banyak; // Menghitung total harga
                System.out.println("Total Yang Harus Dibayar   : Rp. "+totalHarga); // Menmapilkan total harga
                System.out.print("Masukkan Nominal Uang Anda : Rp. ");
                pembayaran = input.nextDouble(); // User memasukkan nominal pembayaran
                kembalian = pembayaran - totalHarga; // Menghitung kembalian
                System.out.println("Kembalian Anda             : Rp. "+kembalian); // Menampilkan kembalian   
                break; // Berhenti
    
            case (2):
                System.out.println("Pilihan Anda Adalah | 2. |Gajayana | Gambir - Malang     |"); // Menampilkan harga tiket yang dipesan
                System.out.println("Harga Tiket                : Rp. 90.000-,"); // Menampilkan harga tiket yang dipesan
                System.out.print("Masukkan Jumlah Tiket      : ");
                banyak = input.nextInt(); // User memasukkan jumlah tiket yang akan dipesan
                totalHarga = 90000*banyak; // Menghitung total harga
                System.out.println("Total Yang Harus Dibayar   : Rp. "+totalHarga); // Menmapilkan total harga
                System.out.print("Masukkan Nominal Uang Anda : Rp. ");
                pembayaran = input.nextDouble(); // User memasukkan nominal pembayaran
                kembalian = pembayaran - totalHarga; // Menghitung kembalian
                System.out.println("Kembalian Anda             : Rp. "+kembalian); // Menampilkan kembalian   
                break; // Berhenti
     
          case (3):
                System.out.println("Pilihan Anda Adalah | 3. |Taksaka | Gambir - Yogyakarta |"); // Menampilkan harga tiket yang dipesan
                System.out.println("Harga Tiket                : Rp. 60.000-,"); // Menampilkan harga tiket yang dipesan
                System.out.print("Masukkan Jumlah Tiket      : ");
                banyak = input.nextInt(); // User memasukkan jumlah tiket yang akan dipesan
                totalHarga = 60000*banyak; // Menghitung total harga
                System.out.println("Total Yang Harus Dibayar   : Rp. "+totalHarga); // Menmapilkan total harga
                System.out.print("Masukkan Nominal Uang Anda : Rp. ");
                pembayaran = input.nextDouble(); // User memasukkan nominal pembayaran
                kembalian = pembayaran - totalHarga; // Menghitung kembalian
                System.out.println("Kembalian Anda             : Rp. "+kembalian); // Menampilkan kembalian  
                break; // Berhenti
        }
    }
    
    // Method untuk menampilkan pesan (overriding)
     public void pesan(){
         System.out.println(" ");
         System.out.println("             TERIMA KASIH TELAH PERCAYA KEPADA KAMI              ");
     }
         
}
