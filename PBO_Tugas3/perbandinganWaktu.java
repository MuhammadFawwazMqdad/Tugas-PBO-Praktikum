package PBO_Tugas3;

import java.util.Scanner;

public class perbandinganWaktu {
    
    Scanner input = new Scanner(System.in);
    int total1, total2, jam1, jam2, menit1, menit2, detik1, detik2, selisih;
    
    int hitungTotal1(){
        
        total1 =  (jam1 * 3600) + (menit1 * 60) + detik1;
        return total1;
    }
    int hitungTotal2(){
        
        total2 = (jam2 * 3600) + (menit2 * 60) + detik2;
        return total2;
    }
    int hitungSelisih(){
        
        selisih = hitungTotal1() - hitungTotal2();
        return selisih;
    }
    void input(){
        
        System.out.println("----SOAL NOMOR 6----");
        System.out.print("Masukkan jam 1 : ");
        jam1 = input.nextInt();
        System.out.print("Masukkan jam 2 : ");
        jam2 = input.nextInt();
        System.out.print("Masukkan menit 1 : ");
        menit1 = input.nextInt();
        System.out.print("Masukkan menit 2 : ");
        menit2 = input.nextInt();
        System.out.print("Masukkan detik 1 : ");
        detik1 = input.nextInt();
        System.out.print("Masukkan detik 2 : ");
        detik2 = input.nextInt();
    }
    void tampil(){
        
        input();
        int hasil = hitungSelisih();
        System.out.println("Selisih dari jam 1 dan jam 2 adalah " + hasil + "detik");
    }
}
