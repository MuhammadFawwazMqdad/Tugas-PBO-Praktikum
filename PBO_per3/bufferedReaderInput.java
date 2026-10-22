package PBO_per3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReaderInput {
    public static void main(String[] args) throws IOException {
        
        //option 1
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in)
//        );
        
        //option 2
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Masukkan nama : ");
        String nama = br.readLine();
        
        System.out.print("Masukkan npm : ");
        int npm = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan nilai : ");
        int nilai = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan IPK : ");
        double ipk = Double.parseDouble(br.readLine());
        
        System.out.print("Masukkan goldar : ");
        char goldar = br.readLine().charAt(0);
        
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Nilai : " + nilai);
        System.out.println("Ipk : " + ipk);
        System.out.println("Goldar : " + goldar);
    }
}
