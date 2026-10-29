package PBO_Tugas4;

import java.util.Scanner;

public class cekTahunKabisat {

    Scanner sc = new Scanner(System.in);
    int tahun;
    boolean kabisat;

    void input(){

        System.out.println("--CEK TAHUN KABISAT--");
        System.out.print("Masukkan tahun : ");
        tahun = sc.nextInt();
    }
    void hitung(){

        // habis dibagi 4 tapi tidak habis dibagi 100, atau habis dibagi 400
        if((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            kabisat = true;
        } else {
            kabisat = false;
        }
    }
    void tampil(){

        input();
        hitung();
        if(kabisat) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat");
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat");
        }
    }
}
