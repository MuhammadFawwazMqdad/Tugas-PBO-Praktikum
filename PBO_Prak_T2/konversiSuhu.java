package PBO_Prak_T2;

public class konversiSuhu {
        
    final double celcius = 10;
    final double fahrenheit = 15;
    final double reamur = 5;
    
    double cF(){
        
        return( (9.0/5 * celcius) + 32);
    }
    double fC(){
        
        return( (fahrenheit - 32) * 5/9.0);
    }
    double cR(){
        
        return(4/5.0 * celcius);
    }
    double rC(){
        
        return(5.0/4 * reamur);
    }
    double fR(){
        
        return( (fahrenheit - 32) * 4.0/9);
    }
    double rF(){
        
        return( (9.0/4 * reamur) + 32);
    }
    void tampil(){
        System.out.println("\nTugas 9");
        System.out.println("1. Celcius ke Fahrenheit : " + cF() + "F");
        System.out.println("2. Fahrenheit ke Celcius : " + fC() + "C");
        System.out.println("3. Celcius ke Reamur : " + cR() + "R");
        System.out.println("4. Reamur ke Celcius : " + rC() + "C");
        System.out.println("5. Fahrenheit ke Reamur : " + fR() + "R");
        System.out.println("6. Reamur ke Fahrenheit : " + rF() + "F");
    }
}
