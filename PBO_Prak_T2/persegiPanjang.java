package PBO_Prak_T2;

class persegiPanjang{

    int hitung(int panjang, int lebar){

        return (panjang * lebar);
    }
    void tampil(int a, int b){
        
        int luas = hitung(a, b);
        System.out.println("Tugas 2");
        System.out.println("Luas : " + luas);
    }
}
