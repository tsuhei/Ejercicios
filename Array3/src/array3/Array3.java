package array3;

import javax.swing.JOptionPane;

public class Array3 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite el tamaño del arreglo: ");
        int numeros[] = new int [Integer.parseInt(texto)];
        rellenarAleatorio (numeros, 0, 9);
        mostrarAleatorio (numeros);

    }
    public static void rellenarAleatorio (int arreglo [], int a, int b){
        for (int i= 0; i<arreglo.length; i++){
            arreglo[i] = ((int)Math.floor(Math.random()*(a-b)+b) );
            }
        }
    public static void mostrarAleatorio(int arreglo []){
        for (int i=0; i<arreglo.length; i++) {
            System.out.println("En el indice "+i+" se encuentra el numero: "+arreglo[i]);
        
        }
    }

}
