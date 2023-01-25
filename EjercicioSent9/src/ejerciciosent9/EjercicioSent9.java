
package ejerciciosent9;

import java.util.Scanner;

public class EjercicioSent9 {

    public static void main(String[] args) {
        Scanner  articulos = new Scanner (System.in);
        System.out.println("Escriba el nombre del cliente: ");
        String nombre = articulos.nextLine();
        System.out.println("Digite la cantidad de articulos a comprar: ");
        int cantidad = articulos.nextInt();
        
        if ( cantidad >0  && cantidad <5) {
            System.out.println("El cliente " + nombre + " compro " + cantidad + " de articulos y debe pagar  en Efectivo");
        } 
         else if (cantidad >=5 && cantidad <12){
            System.out.println("El cliente " + nombre + " compro " + cantidad + " de articulos y debe pagar en Tarjeta");
        }
         else if (cantidad >11) {
            System.out.println("El cliente " + nombre + " compro " + cantidad +" de articulos y debe pagar en Cheque");
        }
         else{
             System.out.println("ha digitado una cantidad no valida.");
         }
    }
    
}
