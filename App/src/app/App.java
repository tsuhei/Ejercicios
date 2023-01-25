package app;
       
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        char letra;
        System.out.println("Escribe alguna palabra: ");
        letra = entrada.nextLine().charAt(5);
        
        System.out.println("La cadena es: " + letra);
    }
    
}
