package array1;

public class Array1 {

    public static void main(String[] args) {
        String utiles [] = {"Lapicero","Cuadernos", "Marcadores", "Colores"};
        double precios [] = {2.5, 10.6, 3.7, 8.9};
        System.out.println("Lista de productos con sus precios.");
        for (int i = 0; i<utiles.length; i++){
        System.out.println(utiles[i] +" = "+precios[i]);
        }        
    }
    
}
