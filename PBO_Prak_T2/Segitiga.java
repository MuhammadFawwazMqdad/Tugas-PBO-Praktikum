package PBO_Prak_T2;

public class Segitiga {
    
    double luasSegitiga(double a, double b){
        
        return((a * b) / 2);
    }
    double nilaiC(double a, double b){
        
        return Math.sqrt((a*a) + (b*b));
    }
    double kelilingSegitiga(double a, double b){
        
        double c = nilaiC(a, b);
        return(a + b + c);
    }
    void tampil(double a, double b){
        
        double luas = luasSegitiga(a, b);
        System.out.println("\nTugas 5");
        System.out.println("Luas segitiga : " + luas);
    }
    void tampil1(double a, double b){
        double c = nilaiC(a, b);
        double keliling = kelilingSegitiga(a, b);
        System.out.println("\nTugas 6");
        System.out.println("Nilai c : " + c );
        System.out.println("Keliling segitiga : " + keliling);
    }
    void konversi(String a){
        String lower = a.toLowerCase();
        String upper = a.toUpperCase();
        
        System.out.println("\nTugas 7");
        System.out.println("Lower case : " + lower);
        System.out.println("Upper case : " + upper);
    }
}
