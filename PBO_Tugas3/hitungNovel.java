package PBO_Tugas3;

import java.util.Scanner;

public class hitungNovel {
    
    Scanner input = new Scanner(System.in);
    final int detikPerHalaman = 1;
    int halaman, detik, jam, hari, menit;
    
    
    
    int hitungMenit(){
        
        menit = detik / 60;
        return menit;
    }
    int hitungJam(){
        
        jam = detik / 3600;
        return jam;
    }
    int hitungHari(){
        
        hari = detik / 86400;
        return hari;
    }
    void input(){
        
        System.out.println("----SOAL NOMOR 7----");
        System.out.print("Masukkan jumlah halaman novel yang ingin anda cetak : ");
        halaman = input.nextInt();
        detik = halaman * detikPerHalaman;
        
    }
    void tampil(){
        
        input();
        int hasilMenit = hitungMenit();
        int hasilJam = hitungJam();
        int hasilHari = hitungHari();
        System.out.println("KETERANGAN");
        System.out.println("Waktu ( menit ) : " + hasilMenit + " menit");
        System.out.println("Waktu ( jam ) : " + hasilJam + " jam");
        System.out.println("Waktu ( hari ) : " + hasilHari + " hari");
    }
}
