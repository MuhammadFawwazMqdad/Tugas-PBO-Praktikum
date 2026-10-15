package PBO_Prak_T2;

public class operasiAritmatika {
    
    int penjumlahan(int a, int b){
        
        return(a + b);
    }
    int pengurangan(int a, int b){
        
        return(a - b);
    }
    int perkalian(int a, int b){
        
        return(a * b);
    }
    double pembagian(double a, double b){
        
        return(a / b);
    }
    void tampil(int a, int b){
        
        int plus = penjumlahan(a, b);
        int minus = pengurangan(a, b);
        int kali = perkalian(a, b);
        double bagi = (double) pembagian(a, b);
        System.out.println("\nTugas 4");
        System.out.println("Pertambahan 22 + 33 : " + plus);
        System.out.println("Pengurangan 22 - 33 : " + minus);
        System.out.println("Perkalian 22 x 33 : " + kali);
        System.out.println("Pembagian 22 / 33 : " + bagi);
    }
}
