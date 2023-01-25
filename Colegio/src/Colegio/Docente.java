package Colegio;

public class Docente extends Persona{
    
    private int codDoc;
    private float sueldoDoc;

    public Docente(String nombre, String apellidos, int edad,int codDoc, float sueldoDoc) {
        super(nombre, apellidos, edad);
        this.codDoc = codDoc;
        this.sueldoDoc = sueldoDoc;
    }
    public void mostrarDatos (){
        System.out.println("El nombre es: " + getNombre());
        System.out.println("Los apellidos son: " + getApellidos());
        System.out.println("La edad es: " + getEdad());
        System.out.println("El codigo del Docente es: " + codDoc);
        System.out.println("La sueldo del Docente es: " + sueldoDoc);
        System.out.println("--------------------");
    }
    
    
    
}
