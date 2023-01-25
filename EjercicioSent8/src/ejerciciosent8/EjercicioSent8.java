package ejerciciosent8;

import javax.swing.JOptionPane;

public class EjercicioSent8 {

    public static void main(String[] args) {
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la Nota  1:" ));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la Nota  2:" ));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Escriba la Nota  3:" ));
        
        double PT = (n1 + n2 + n3)/3;
        PT += 1;
        
        JOptionPane.showMessageDialog(null, "El promedio  total es:" + PT);
       
        if (PT >= 0  && PT <=  3 ) {
            JOptionPane.showMessageDialog(null, "El estudiante no aprobo.");
            //System.out.println("El alumno no aprobo.");
        }
        else if (PT >=3 && PT <= 5){
            JOptionPane.showMessageDialog(null, "El estudiante aprobo.");
           // System.out.println("El alunmo aprobo.");
        }
        else if (PT >= 5 && PT <= 10) {
            JOptionPane.showMessageDialog(null, "Promedio fuera de Rango");
        }

    }
    
}
