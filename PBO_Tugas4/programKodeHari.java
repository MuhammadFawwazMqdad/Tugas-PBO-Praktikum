package PBO_Tugas4;

import java.util.Scanner;

public class programKodeHari {

    Scanner sc = new Scanner(System.in);
    int kodeHari;
    String namaHari;

    void input(){

        System.out.println("--PROGRAM KODE HARI--");
        System.out.println("1 = Senin, 2 = Selasa, 3 = Rabu, 4 = Kamis");
        System.out.println("5 = Jumat, 6 = Sabtu, 7 = Minggu");
        System.out.print("Masukkan kode hari : ");
        kodeHari = sc.nextInt();
    }
    void hitung(){

        switch(kodeHari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Kode hari tidak valid";
        }
    }
    void tampil(){

        input();
        hitung();
        System.out.println("Nama hari : " + namaHari);
    }
}
