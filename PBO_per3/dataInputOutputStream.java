package PBO_per3;

import java.io.*;

public class dataInputOutputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream("mahasiswa.dat")
        );
        
        output.writeUTF("Nama");
        output.writeInt(29);
        output.writeDouble(3.7);
        
        output.close();
        
        DataInputStream input = new DataInputStream(
                new FileInputStream("mahasiswa.dat")
        );
        
        String a = input.readUTF();
        int b = input.readInt();
        double c = input.readDouble();
        System.out.println("Nama : " + a);
        System.out.println("Umur : " + b);
        System.out.println("IPK : " + c);
    }
}
