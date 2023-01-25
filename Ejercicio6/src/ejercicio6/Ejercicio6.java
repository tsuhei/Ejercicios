package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner estacion = new Scanner(System.in);
        System.out.println("Digite el numero del mes para saber la Estacion: ");
        var mes = estacion.nextInt();
        var estaciones = "Estacion no es disponible";
                
        if  ( mes == 12 || mes == 1 || mes == 2) {
             estaciones = "Invierno";
         }
         else if (mes == 3 || mes == 4 || mes == 5){
             estaciones = "Primavera";
         }
         else if (mes == 6 || mes == 7 || mes == 8){
             estaciones = "Verano";
         }
         else if (mes == 9 || mes == 10 || mes == 11){
             estaciones = "Otoño";
         }
        System.out.println("La estacion a la que pertence es: " + estaciones);
       }
}
