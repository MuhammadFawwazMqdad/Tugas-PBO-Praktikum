package PBO_Tugas4;

import java.util.Locale;
import java.util.Scanner;

public class programGajiKaryawan {

    Scanner sc = new Scanner(System.in);
    String nik, nama, status, ketGolongan;
    int kodeGolongan, jumlahAnak;
    double gajiPokok, tunjanganPasangan, tunjanganAnak, tunjangan, gajiBersih;

    String rupiah(double angka){
        return "Rp" + String.format(Locale.US, "%,.0f", angka).replace(',', '.');
    }

    void input(){

        System.out.println("--PROGRAM GAJI KARYAWAN--");
        System.out.print("NIK : ");
        nik = sc.nextLine();
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.println("Kode Golongan");
        System.out.println("1. Menikah");
        System.out.println("2. Belum menikah");
        System.out.println("3. Cerai");
        System.out.println("4. Menikah dan punya anak");
        System.out.print("Kode Golongan (1-4) : ");
        kodeGolongan = sc.nextInt();
        sc.nextLine();
        System.out.print("Status Pernikahan (Menikah/Belum Menikah/Cerai) : ");
        status = sc.nextLine();
        System.out.print("Jumlah Anak : ");
        jumlahAnak = sc.nextInt();
    }
    void hitung(){

        // gaji pokok berdasarkan kode golongan
        switch(kodeGolongan) {
            case 1:
                ketGolongan = "Menikah";
                gajiPokok = 1200000;
                break;
            case 2:
                ketGolongan = "Belum menikah";
                gajiPokok = 1500000;
                break;
            case 3:
                ketGolongan = "Cerai";
                gajiPokok = 1750000;
                break;
            case 4:
                ketGolongan = "Menikah dan punya anak";
                gajiPokok = 2000000;
                break;
        }

        // c) tunjangan pasangan = 10% dari gaji pokok (jika menikah)
        if(status.equalsIgnoreCase("Menikah")) {
            tunjanganPasangan = 0.10 * gajiPokok;
        } else {
            tunjanganPasangan = 0;
        }

        // d) tunjangan anak = 5% dari gaji pokok x jumlah anak
        tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        // b) tunjangan = tunjangan pasangan + tunjangan anak
        tunjangan = tunjanganPasangan + tunjanganAnak;

        // a) gaji bersih = gaji pokok + tunjangan
        gajiBersih = gajiPokok + tunjangan;
    }
    void tampil(){

        input();
        if(kodeGolongan < 1 || kodeGolongan > 4) {
            System.out.println("Kode golongan tidak valid");
            return;
        }
        hitung();
        System.out.println();
        System.out.println("--SLIP GAJI KARYAWAN--");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Golongan           : " + kodeGolongan + " (" + ketGolongan + ")");
        System.out.println("Status Pernikahan  : " + status);
        System.out.println("Jumlah Anak        : " + jumlahAnak);
        System.out.println("Gaji Pokok         : " + rupiah(gajiPokok));
        System.out.println("Tunjangan Pasangan : " + rupiah(tunjanganPasangan));
        System.out.println("Tunjangan Anak     : " + rupiah(tunjanganAnak));
        System.out.println("Total Tunjangan    : " + rupiah(tunjangan));
        System.out.println("Gaji Bersih        : " + rupiah(gajiBersih));
    }
}
