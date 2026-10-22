package PBO_Tugas3;

import java.io.*;

public class programHitungBelanja {
    
    String nama;
    double totalB, total, bayar, kembalian;
    double diskon;
    
    //Kenapa double semua ? Saya teringat kata kata ken thompson, yaitu "When you're in doubt, use brute force"

    public programHitungBelanja() throws IOException{
    
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream("belanja.dat")
        );
       
        output.writeUTF("Asep karbu");
        output.writeDouble(350000);
        output.writeDouble(400000);
        
        output.close();
        
        DataInputStream input = new DataInputStream(
                new FileInputStream("belanja.dat")
        );
        nama = input.readUTF();
        totalB = input.readDouble();
        bayar = input.readDouble();
        
        input.close();
        
    }
    void tampil(){
        
        hitungKembalian();
        System.out.println("----SOAL NOMOR 2----");
        System.out.println("Nama          : " + nama);
        System.out.println("Total belanja : Rp" + totalB);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Total         : Rp" + total);
        System.out.println("Bayar         : Rp" + bayar);
        System.out.println("Kembalian     : Rp" + kembalian);
        System.out.println();
    }
    double hitungDiskon(){
        
        if (totalB >= 300000) {
            diskon = totalB * 0.20;
        } else if (totalB >= 200000) {
            diskon = totalB * 0.15;
        } else if (totalB >= 100000) {
            diskon = totalB * 0.10;
        } else {
            diskon = 0;
        }
        return diskon;
    }
    double hitungTotal(){
        
        hitungDiskon();
        total = totalB - diskon;
        return total;
    }
    double hitungKembalian(){
        
        hitungTotal();
        kembalian = bayar - total;
        return kembalian;
    }
    
    
}
