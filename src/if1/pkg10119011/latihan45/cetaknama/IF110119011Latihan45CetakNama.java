/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama        : Reihan Wiyanda
 *  Kelas       : IF-1
 *  Nim         : 10119011
 */
public class IF110119011Latihan45CetakNama {

    private static String nama;
    private static int jumlah;
  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("----Aplikasi Pencetak Nama-----");
        System.out.print("Masukan nama anda : ");
        nama = sc.nextLine();
        System.out.print("Mau cetak berapa kali? :");
        jumlah = sc.nextInt();
        
        Printer pt = new Printer ();
        pt.setNama(nama);
        pt.setJmlCetak(jumlah);
        pt.cetak(nama);
        pt.cetak(jumlah, nama);
    }
    
}
