package PBO_Tugas3;

import java.util.Scanner;

public class GayaSentripetal {
    
    Scanner input = new Scanner(System.in);
    double f, m, v, r;
    
    double hitungGaya(){
        
        f = (m * (v*v)) / r;
        return f;
    }
    void input(){
        
        System.out.println("----SOAL NOMOR 4----");
        System.out.print("Input massa : ");
        m = input.nextDouble();
        System.out.print("Input kecepatan : ");
        v = input.nextDouble();
        System.out.print("Input jari jari : ");
        r = input.nextDouble();
        hitungGaya();
    }
    void tampil(){
        
        input();
        double hasil = hitungGaya();
        System.out.println("Gaya sentripetal dengan massa " + m + ", kecepatan " + v + ", dan jari jari " + r + ". Adalah : " + hasil);
    }
}
