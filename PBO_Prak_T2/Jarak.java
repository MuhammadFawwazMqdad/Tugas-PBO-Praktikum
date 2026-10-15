package PBO_Prak_T2;

public class Jarak {
    
    final double kecepatanCahaya = 300000;
    
    double jarakBulan(double a){
        
        return (a/ kecepatanCahaya);
    }
    double jarakMatahari(double a){
        
        return (a / kecepatanCahaya);
    }
    void tampil(double a, double b){
        
        System.out.println("\nTugas 8");
        System.out.println("Waktu tempuh dari bumi ke bulan : " + jarakBulan(a) + " detik");
        System.out.println("Waktu tempuh dari bumi ke matahari : " + jarakMatahari(b) + " detik");
    }
}
