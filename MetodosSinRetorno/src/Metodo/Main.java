package Metodo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el Numero 1: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el Numero 2: "));
        
        Operacion operacion1 = new Operacion ();
        
        operacion1.sumar(numero1, numero2);
        operacion1.restar(numero1, numero2);
        operacion1.multiplicar(numero1, numero2);
        operacion1.dividir(numero1, numero2);
        operacion1.mostrarDatos();
       
        /**con retorno
        float suma = operacion1.sumar(numero1, numero2);
        float resta = operacion1.restar(numero1, numero2);
        float multi = operacion1.multiplicar(numero1, numero2);
        float div = operacion1.dividir(numero1, numero2);
        operacion1.mostrarDatos(suma, resta, multi, div);
         */
    }
}
