package matriz1;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digitar la filas de la matriz");
        int filas = entrada.nextInt();
        System.out.println("Digitar la columnas de la matriz");
        int columnas = entrada.nextInt();
        int matriz [][] = new int [filas][columnas];
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++ ) {
                matriz [i] [j] = (i*matriz.length) + (j+1);
                System.out.print(matriz [i] [j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    
}
