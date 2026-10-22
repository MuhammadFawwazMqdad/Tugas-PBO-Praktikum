package PBO_Tugas3;

import java.util.Scanner;

public class programPenggajian {
    
    Scanner input = new Scanner(System.in);
    long npm;
    String nama, alamat, jabatan;
    int p1, p2, p3, p4, tg, gb;
    double pajak;
    
    void input(){
        
        System.out.print("Masukkan nama          : ");
        nama = input.nextLine();
        System.out.print("Masukkan nomor induk   : ");
        npm = input.nextLong();
        input.nextLine();
        System.out.print("Masukkan alamat        : ");
        alamat = input.nextLine();
        System.out.println("Masukkan jabatan");
        System.out.println("----List Jabatan----");
        System.out.println("1. Manager = 'M'");
        System.out.println("2. HR = 'HR'");
        System.out.println("3. Karyawan tetap = 'KT'");
        System.out.println("4. Karyawan kontrak = 'KK'");
        System.out.print("Input : ");
        jabatan = input.nextLine();
        System.out.print("Masukkan gaji pokok      : ");
        p1 = input.nextInt();
        System.out.print("Masukkan tunjangan anak  : ");
        p3 = input.nextInt();
        System.out.print("Masukkan tunjangan istri : ");
        p4 = input.nextInt();
        if(jabatan.equals("M")){
            p2 = 2000000;
        }else if(jabatan.equals("HR")){
            p2 = 1500000;
        }else if(jabatan.equals("KT")){
            p2 = 1000000;
        }else if(jabatan.equals("KK")){
            p2 = 750000;
        }else{
            System.out.println("Jabatan anda invalid, tolong ulangi program !");
        }
    }
    
    double hitungPajak(){
        pajak = (p1 + p2 + p4) * 0.10;
        return pajak;
    }
    
    int hitungGaji(){
        tg = p1 + p2 + p3 + p4;
        return tg;
    }
    
    int hitungGajiTotal(){
        
        hitungPajak();
        hitungGaji();
        gb = (int) ((double)tg - pajak);
        return gb;
    }
    
    void tampil(){
        
        input();
        int bersih = hitungGajiTotal();
        
        System.out.println("----SOAL NOMOR 1----");
        System.out.println("Nama                    : " + nama);
        System.out.println("Nomor Induk             : " + npm);
        System.out.println("Alamat                  : " + alamat);
        System.out.println("Jabatan                 : " + jabatan + ". Dengan tunjangan sebesar Rp." + p2);
        System.out.println("Total gaji ( kotor )    : " + tg);
        System.out.println("Total pajak penghasilan : " + pajak);
        System.out.println("Gaji bersih             : " + bersih);
        System.out.println();
        
    }
}
