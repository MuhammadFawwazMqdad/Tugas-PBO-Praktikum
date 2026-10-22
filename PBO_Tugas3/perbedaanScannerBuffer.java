package PBO_Tugas3;

import java.io.*;
import java.util.Scanner;

public class perbedaanScannerBuffer {
    
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a,b,c;
    int d;
    
    void inputScanner(){
        
        System.out.print("Nama : ");
        a = sc.nextLine();
        b = "Scanner menggunakan package Scanner, juga tidak perlu konversi tipe ( otomatis ), juga tidak perlu exeption. Contoh Scanner ada di input nama";
    }
    void inputBuffered() throws IOException{
        
        System.out.print("Umur : ");
        d = Integer.parseInt(br.readLine());
        c = "BufferedReader menggunakan package io, harus konversi tipe, contoh konversi tipe ada di inputan umur, juga bufferedreader harus menggunakan exeption, yaitu IOExeption";
    }
    void tampil() throws IOException{
        
        System.out.println("----SOAL NOMOR 3----");
        inputScanner();
        inputBuffered();

        System.out.println("Perbedaan Scanner        : " + b);
        System.out.println("Perbedaan BufferedReader : " + c);
        System.out.println("Nama                     : " + a);
        System.out.println("Umur                     : " + b);
        System.out.println();
    }
}
