package ventana;

import javax.swing.JOptionPane;

public class Ventana {

    public static void main(String[] args) {
         String cadena;
         int entero;
         char letra;
         double decimal;
         
            // Entrada de Datos
         cadena = JOptionPane.showInputDialog("Digite la cadena: ");
            // System.out.println("La oracion es: " +cadena);
         entero = Integer.parseInt(JOptionPane.showInputDialog("Digite el Digito: "));
            //  System.out.println("El numero es:" + entero);
         letra = JOptionPane.showInputDialog("Digite la letra ").charAt(3);
           // System.out.println("La letras es:" + letra);
         decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite el Decimal: "));
           // System.out.prontln("El numero decimal es:" + decimal);   
           
           //Imprimir
           JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
           JOptionPane.showMessageDialog(null, "El numero es: " + entero);
           JOptionPane.showMessageDialog(null, "La letra es: " + letra);
           JOptionPane.showMessageDialog(null, "El numero decimal es: " + decimal);
           
           
           
    }
    
}
