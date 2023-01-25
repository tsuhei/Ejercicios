package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner dinero = new Scanner(System.in);
        
        System.out.println("Digite el sueldo: ");
        float sueldo = dinero.nextFloat();
        
        System.out.print("Digite el primer gasto: ");
        float gasto1 = dinero.nextFloat();
        sueldo -= gasto1;
        System.out.println("Saldo actual es: "+ sueldo);
        
        System.out.print("Digite el primer gasto: ");
        float gasto2 = dinero.nextFloat();
        sueldo -= gasto2;
        System.out.println("Saldo actual es: "+ sueldo);
        
        System.out.print("Digite el primer gasto: ");
        float gasto3 = dinero.nextFloat();
        sueldo -= gasto3;
        System.out.println("Saldo Total es: "+ sueldo);
    }
    
}
