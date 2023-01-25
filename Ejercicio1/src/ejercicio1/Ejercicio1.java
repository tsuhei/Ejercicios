package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
         Scanner triangulo = new Scanner (System.in);
        
        System.out.println ("Digite la base del triangulo: ");
        float base = triangulo.nextFloat();
        
        System.out. print ("Digite la altura del triangulo: ");
        float altura = triangulo.nextFloat();
        
        float area = ( base* altura)/2;
        
        System. out .println("El area del traingulo es: " + area);
        

    }
    
}
