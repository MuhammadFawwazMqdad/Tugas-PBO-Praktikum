package PBO_Tugas4;

import java.util.Locale;
import java.util.Scanner;

public class programKomisiSalesman {

    Scanner sc = new Scanner(System.in);
    String nama;
    double penjualan, jasa, komisi, pendapatan;

    String rupiah(double angka){
        return "Rp" + String.format(Locale.US, "%,.0f", angka).replace(',', '.');
    }

    void input(){

        System.out.println("--PROGRAM KOMISI SALESMAN--");
        System.out.print("Nama salesman : ");
        nama = sc.nextLine();
        System.out.print("Penjualan hari ini (Rp) : ");
        penjualan = sc.nextDouble();
    }
    void hitung(){

        if(penjualan <= 2000000) {
            // a) sampai Rp2.000.000
            jasa = 100000;
            komisi = 0.10 * penjualan;
        } else if(penjualan <= 5000000) {
            // b) di atas Rp2.000.000 sampai Rp5.000.000
            jasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            // c) di atas Rp5.000.000
            jasa = 300000;
            komisi = 0.20 * penjualan;
        }
        pendapatan = jasa + komisi;
    }
    void tampil(){

        input();
        hitung();
        System.out.println();
        System.out.println("--PENDAPATAN SALESMAN--");
        System.out.println("Nama             : " + nama);
        System.out.println("Penjualan        : " + rupiah(penjualan));
        System.out.println("Uang Jasa        : " + rupiah(jasa));
        System.out.println("Uang Komisi      : " + rupiah(komisi));
        System.out.println("Total Pendapatan : " + rupiah(pendapatan));
    }
}
