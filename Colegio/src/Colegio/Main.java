package Colegio;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante ("Jhon", "Garzon", 23, 304595, 4.9f);
        est1.mostrarDatos();
        Estudiante est2 = new Estudiante ("Julian", "Martinez", 22, 304596, 4.9f);
        est2.mostrarDatos();
        Estudiante est3 = new Estudiante ("Jennifer", "Garzon", 21, 304597, 4.9f);
        est3.mostrarDatos();
        
        Docente doc1 = new Docente ("Jhon", "Duque", 32, 123456, 1000000);
        doc1.mostrarDatos();
        Docente doc2 = new Docente ("Julian", "Garzon",  22, 789101, 1000000);
        doc2.mostrarDatos();
        Docente doc3 = new Docente ("Jennifer", "Duque", 12, 654322, 1000000);
        doc3.mostrarDatos();
    }
    
        
    
}
