package PBO_Tugas4;

import java.util.Scanner;

public class cekGenapGanjil {

    Scanner sc = new Scanner(System.in);
    int bilangan;
    String hasil;

    void input(){

        System.out.println("--CEK BILANGAN GENAP / GANJIL--");
        System.out.print("Masukkan bilangan : ");
        bilangan = sc.nextInt();
    }
    void hitung(){

        // genap jika sisa bagi 2 sama dengan 0
        if(bilangan % 2 == 0) {
            hasil = "GENAP";
        } else {
            hasil = "GANJIL";
        }
    }
    void tampil(){

        input();
        hitung();
        System.out.println("Bilangan " + bilangan + " adalah bilangan " + hasil);
    }
}
