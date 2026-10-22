package PBO_Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hitungBuah {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int mangga, jambu, busuk, manggaSehat, tetangga, total;
    
    int hitungJambu(){
        
        jambu = 30 * tetangga;
        return jambu;
    }
    int hitungBusuk(){
        
        manggaSehat = mangga - busuk;
        return manggaSehat;
    }
    int hitungBuah(){
        
        hitungJambu();
        total = mangga + jambu;
        return total;
    }
    void input() throws IOException{
        
        hitungBusuk();
        hitungBuah();
        System.out.println("----SOAL NOMOR 5----");
        System.out.print("Masukkan jumlah total buah mangga : ");
        mangga = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jumlah tetangga : " );
        tetangga = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jumlah buah busuk : ");
        busuk = Integer.parseInt(br.readLine());
    }
    void tampil() throws IOException{
        
        input();
        int totalB = hitungBuah();
        int sehat = hitungBusuk();
        int totalJ = hitungJambu();
        System.out.println("Total buah : " + totalB);
        System.out.println("Total mangga yang tidak busuk : " + sehat);
        System.out.println("Total mangga yang busuk dan harus dikembalikan : " + this.busuk);
        System.out.println("Total jambu yang dibeli : " + totalJ);
    }
}
