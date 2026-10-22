package PBO_Tugas3;

import java.util.Scanner;
import java.io.IOException;

/*
A MAAP PISAN INIMAH DISINYA PAKE AI, TAPI DA ASLI DISININYA DOANG SUWER, ALASANNYA BIAR CLASS MAIN RAPIH MANTAP
*/


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
    void tampil() throws IOException{
        
        do{
            input();
            if(input == 1) {
                new programPenggajian().tampil();
            } else if(input == 2) {
                new programHitungBelanja().tampil();
            } else if(input == 3) {
                new perbedaanScannerBuffer().tampil();
            } else if(input == 4) {
                new GayaSentripetal().tampil();
            } else if(input == 5) {
                new hitungBuah().tampil();
            } else if(input == 6) {
                new perbandinganWaktu().tampil();
            } else if(input == 7) {
                new hitungNovel().tampil();
            } else if(input == 0) {
                System.out.println("Sip ah nuhun bos");
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }while(input != 0);
    }
}
