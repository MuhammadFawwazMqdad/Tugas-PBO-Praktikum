package PBO_Tugas4;

import java.util.Scanner;

public class hitungLuasBangunDatar {

    Scanner sc = new Scanner(System.in);
    int pilihan;
    double luas;
    String bangun;

    void input(){

        System.out.println("--MENU LUAS BANGUN DATAR--");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih : ");
        pilihan = sc.nextInt();
    }
    void luasPersegi(){

        System.out.print("Masukkan sisi : ");
        double sisi = sc.nextDouble();
        bangun = "persegi";
        luas = sisi * sisi;
    }
    void luasSegitiga(){

        System.out.print("Masukkan alas : ");
        double alas = sc.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = sc.nextDouble();
        bangun = "segitiga";
        luas = 0.5 * alas * tinggi;
    }
    void luasLingkaran(){

        System.out.print("Masukkan jari-jari : ");
        double r = sc.nextDouble();
        bangun = "lingkaran";
        luas = Math.PI * r * r;
    }
    void luasTrapesium(){

        System.out.print("Masukkan sisi sejajar a : ");
        double a = sc.nextDouble();
        System.out.print("Masukkan sisi sejajar b : ");
        double b = sc.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double t = sc.nextDouble();
        bangun = "trapesium";
        luas = 0.5 * (a + b) * t;
    }
    void luasLayangLayang(){

        System.out.print("Masukkan diagonal 1 : ");
        double d1 = sc.nextDouble();
        System.out.print("Masukkan diagonal 2 : ");
        double d2 = sc.nextDouble();
        bangun = "layang-layang";
        luas = 0.5 * d1 * d2;
    }
    void tampil(){

        input();
        switch(pilihan) {
            case 1:
                luasPersegi();
                break;
            case 2:
                luasSegitiga();
                break;
            case 3:
                luasLingkaran();
                break;
            case 4:
                luasTrapesium();
                break;
            case 5:
                luasLayangLayang();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }
        System.out.printf("Luas %s = %.2f%n", bangun, luas);
    }
}
