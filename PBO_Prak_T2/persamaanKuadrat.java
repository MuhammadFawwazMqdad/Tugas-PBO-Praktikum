package PBO_Prak_T2;

public class persamaanKuadrat {

    int hitung(int a, int b, int c){
        
        return((b * b) - (4 * a * c));
    }
    void tampil(int a, int b, int c){
        
        int d = hitung(a, b, c);
        System.out.println("\nTugas 3");
        System.out.println("b^2 - 4ac : " + d );
    }
}
