
package ejercicio2.pkg2;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static void main(String[] args) {
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la Nota  1:" ));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la Nota  2:" ));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la Nota  3:" ));
        
        double PT = (n1 + n2 + n3)/3;
        PT += 1;
        
        JOptionPane.showMessageDialog(null, "El promedio  total es:" + PT);
        
    }
    
}
