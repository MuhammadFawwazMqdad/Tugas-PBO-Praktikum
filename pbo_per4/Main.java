package pbo_per4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
        
        int input;
        int angka1,angka2;
        System.out.println("Pilihan");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.print("Input : ");
        input = sc.nextInt();
        
        switch(input){
            case 1 :
                System.out.print("Masukkan angka 1 : ");
                angka1 = sc.nextInt();
                System.out.print("Masukkan angka 2 : ");
                angka2 = sc.nextInt();
                System.out.println("Hasil : " + (angka1 + angka2));
                break;
            case 2 :
                System.out.print("Masukkan angka 1 : ");
                angka1 = sc.nextInt();
                System.out.print("Masukkan angka 2 : ");
                angka2 = sc.nextInt();
                System.out.println("Hasil : " + (angka1 - angka2));
                break;
             case 3 :
                System.out.print("Masukkan angka 1 : ");
                angka1 = sc.nextInt();
                System.out.print("Masukkan angka 2 : ");
                angka2 = sc.nextInt();
                System.out.println("Hasil : " + ((double)angka1 / angka2));
                break;
             case 4 :
                System.out.print("Masukkan angka 1 : ");
                angka1 = sc.nextInt();
                System.out.print("Masukkan angka 2 : ");
                angka2 = sc.nextInt();
                System.out.println("Hasil : " + (angka1 * angka2));
                break;
                
        }
    }
    
}
