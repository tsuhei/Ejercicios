package Colegio;

public class Estudiante extends Persona {
    
    private int codEs;
    private float nF;

    public Estudiante(String nombre, String apellidos, int edad, int codEs, float nF) {
        super(nombre, apellidos, edad);
        this.codEs = codEs;
        this.nF = nF;
    }
    
    public void mostrarDatos (){
        System.out.println("El nombre es: " + getNombre());
        System.out.println("Los apellidos son: " + getApellidos());
        System.out.println("La edad es: " + getEdad());
        System.out.println("El codigo del Estudiante es: " + codEs);
        System.out.println("La nota final es: " + nF);
        System.out.println("--------------------");
    }

}
