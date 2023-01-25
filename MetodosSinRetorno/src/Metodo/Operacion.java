package Metodo;
public class Operacion {
    //Atributos
    float suma, resta, multi, div;
    
    //Metodos
  public void sumar (float num1, float num2){
        suma = num1 + num2;   
    }
    public void restar (float num1, float num2){
        resta = num1 - num2;   
    }
    public void multiplicar (float num1, float num2){
        multi = num1 * num2;   
    }
    public void dividir (float num1, float num2){
        div  = num1 / num2;
    }       
   /**Con retorno
    public float sumar (float num1, float num2){
        suma = num1 + num2;
        return suma;
    }
    public float restar (float num1, float num2){
        resta = num1 - num2;   
        return resta;
    }
    public float multiplicar (float num1, float num2){
        multi = num1 * num2;  
        return multi;
    }
    public float dividir (float num1, float num2){
        div  = num1 / num2;  
        return div;
    }
     */
    public void mostrarDatos() {
        System.out.println("La suma es: " + suma);
        System.out.println("La retsa es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La division es: " + div);
     }
    
    /**Con retorno
   
   public void mostrarDatos (float suma, float resta, float multi, float div){
        System.out.println("La suma es: " + suma);
        System.out.println("La retsa es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La division es: " + div);
     }
     */
   
}       