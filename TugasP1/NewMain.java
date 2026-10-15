package TugasP1;

public class NewMain {

    public static void main(String[] args) {
        
        SukaBelajar suka = new SukaBelajar();
        suka.kata1 = "Saya suka Pemrograman Berorientasi Objek";
        suka.kata2 = "Belajar Pemrograman Berorientasi Objek asik";
        suka.kata3 = "Yuk kita enjoy cihuyy";
        
        System.out.println(suka.kata1);
        System.out.println(suka.kata2);
        System.out.println(suka.kata3);
        
        Unsur univ = new Unsur();
        univ.kata1 = "\nUniversitas Suryakancana";
        univ.kata2 = "Universitas pilihan di Cianjur";
        univ.kata3 = "Kuliah di Fakultas Teknik";
        univ.kata4 = "Jurusan Teknik Informatika";
        
        System.out.println(univ.kata1);
        System.out.println(univ.kata2);
        System.out.println(univ.kata3);
        System.out.println(univ.kata4);
        
        Informatika infor = new Informatika();
        infor.kata1 = "\nSaya Samy adalah Mahasiswa Teknik Informatika";
        infor.kata2 = "\nJujur, Amanah, dan Informatikawan";
        infor.kata3 = "\nSenang belajar PBO";
        
        System.out.println(infor.kata1 + infor.kata2 + infor.kata3);
    }
    
}

class SukaBelajar{

    String kata1;
    String kata2;
    String kata3;
    
}

class Unsur{
    
    String kata1;
    String kata2;
    String kata3;
    String kata4;
    
}

class Informatika{
    
    String kata1;
    String kata2;
    String kata3;

}
