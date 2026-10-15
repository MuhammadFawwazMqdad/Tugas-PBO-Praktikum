package pbop;

public class Burung {
    
    String nama;
    String suara; 
    String jenis;
    String warna;
    
    void informasi(){
        System.out.println("Ini burung");
        System.out.println("Nama  : " + nama);
        System.out.println("Suara : " + suara);
        System.out.println("Jenis : " + jenis);
        System.out.println("Warna : " + warna);
    }
    
    void bersuara(){
        System.out.println("Cawww");
    }
    void terbang(){
        System.out.println("Anyirrr ngapung");
    }
    void bertelur(){
        System.out.println("Pluk!! Jol kalaur endog");
    }
    void makan(){
        System.out.println("Hap hap hap, siga nu can dahar sataun wae");
    }
}
