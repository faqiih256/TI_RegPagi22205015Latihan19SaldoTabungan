/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan19.saldotabungan;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang Saldo tabungan
 * @author 62895
 */
public class TI_RegPagi22205015Latihan19SaldoTabungan {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 19===");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan saldo anda: ");
        int saldo = scanner.nextInt();
//        double bunga = saldo * 0.15;
        System.out.print("bunga (%):" );
        int bunga = scanner.nextInt();
        System.out.print("lama menabung perbulan: ");
        int bulan = scanner.nextInt();

        
        int i = 1;
        while ( i <= bulan ){ 
            saldo = saldo+(saldo*bunga/100);
            System.out.println("saldo bulan ke "+i+" = "+saldo);
            i++;        
        }
    }
}
