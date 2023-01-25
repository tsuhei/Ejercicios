package consola;
//Inicio Programa

import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Digite el numero: ");
        numero = entrada.nextInt();
        System.out.println("El numero es " + numero);      
    }
    
}
