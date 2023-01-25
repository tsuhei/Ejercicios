package ciclo3;

public class Ciclo3 {

    public static void main(String[] args) {
        int  contador = 0;
        for (int i= 0; i<=10000; i++) {
            if (i%20 == 0){
                contador ++;
            } 
         }
        System.out.println("La cantidad de multiplos de 20 son: " + contador);   
   }
}    
