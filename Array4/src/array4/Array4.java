package array4;
public class Array4 {
    public static void main(String[] args) {
        int numeros [] = new int [100];
        
        int suma =0;
        double  media;
        
        for (int i=0; i<numeros.length; i++) {
            numeros [i] = i+1;
            suma += numeros [i];
        }
        System.out.println("La suma de los valores:" + suma);
        media =(double) suma/numeros.length;
        System.out.println("Le media de los valores es: " + media);
    }
    
}
