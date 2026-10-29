package PBO_Tugas4;

import java.util.Locale;
import java.util.Scanner;

public class programKasir {

    Scanner sc = new Scanner(System.in);
    String member;
    double totalBelanja, uang, diskon, totalBayar, kembalian;

    String rupiah(double angka){
        return "Rp" + String.format(Locale.US, "%,.0f", angka).replace(',', '.');
    }

    void input(){

        System.out.println("--PROGRAM KASIR--");
        System.out.print("Apakah memiliki kartu member? (ya/tidak) : ");
        member = sc.next();
        System.out.print("Total belanja (Rp) : ");
        totalBelanja = sc.nextDouble();
        System.out.print("Uang yang diberikan (Rp) : ");
        uang = sc.nextDouble();
    }
    void hitung(){

        diskon = 0;
        if(member.equalsIgnoreCase("ya")) {
            // memiliki kartu member
            if(totalBelanja > 500000) {
                diskon = 50000;
            } else if(totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            // tidak memiliki kartu member
            if(totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        totalBayar = totalBelanja - diskon;
        kembalian = uang - totalBayar;
    }
    void tampil(){

        input();
        hitung();
        System.out.println();
        System.out.println("--STRUK BELANJA--");
        System.out.println("Total Belanja  : " + rupiah(totalBelanja));
        System.out.println("Diskon         : " + rupiah(diskon));
        System.out.println("Total Bayar    : " + rupiah(totalBayar));
        System.out.println("Uang Diberikan : " + rupiah(uang));
        if(kembalian >= 0) {
            System.out.println("Kembalian      : " + rupiah(kembalian));
        } else {
            System.out.println("Uang kurang    : " + rupiah(-kembalian));
        }
    }
}
