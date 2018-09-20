/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan4.kambing;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama                 : Gery Akbar Fauzi
 * Kelas                : PBO2
 * Nim                  : 10117049
 * Deskripsi Program    : Program ini berisi program deklarasi variabel lokal
 *                        lalu mengaksesnya
 */
public class Kambing {
    
    public void tambahKambing(){
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
        //Menampilkan jumlah kambing setelah ditambahkan
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambahkan : "+ 
                jumlahKambing +" ekor");
    }
    //Method menambahkan kambing Jantan baru
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
