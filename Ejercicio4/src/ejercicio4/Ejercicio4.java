package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner ecuacion = new Scanner(System.in);
        
        System.out.print("Digite el valor de X: ");
        float x = ecuacion.nextFloat();
         x = ((7*(3*x + 2))- (5*((4*x - 3))-1))/4;
         System.out.print("El valor de X es: " + x);
         
         
    }
    
}
