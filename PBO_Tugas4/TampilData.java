package PBO_Tugas4;

import java.util.Scanner;

public class TampilData {

    Scanner sc = new Scanner(System.in);
    int input;

    void input(){

        System.out.println("--MENU TUGAS--");
        System.out.println("--PILIH TUGAS--");
        System.out.println("Nomor 1");
        System.out.println("Nomor 2");
        System.out.println("Nomor 3");
        System.out.println("Nomor 4");
        System.out.println("Nomor 5");
        System.out.println("Nomor 6");
        System.out.println("Nomor 7");
        System.out.println("Ketik 0 untuk keluar");
        System.out.print("Input : ");
        input = sc.nextInt();
    }
    void tampil(){

        do{
            input();
            if(input == 1) {
                new cekGenapGanjil().tampil();
            } else if(input == 2) {
                new programKodeHari().tampil();
            } else if(input == 3) {
                new programGajiKaryawan().tampil();
            } else if(input == 4) {
                new cekTahunKabisat().tampil();
            } else if(input == 5) {
                new programKomisiSalesman().tampil();
            } else if(input == 6) {
                new programKasir().tampil();
            } else if(input == 7) {
                new hitungLuasBangunDatar().tampil();
            } else if(input == 0) {
                System.out.println("Sip ah nuhun bos");
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }while(input != 0);
    }
}
