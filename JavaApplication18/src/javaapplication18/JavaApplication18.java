package javaapplication18;

public class JavaApplication18 {
public static void main(String[] args) {
        
        Persona per = new Persona();
        
        per.setDNI(20000001);
        per.setnombre("Pepe");
        per.setedad(50);
        per.setprov(new Provincia(22,"Mendoza"));
        
    System.out.println("Nombre: " + per.getnombre() );
    System.out.println("DNI: "+ per.getDNI());
    System.out.println("Edad: " + per.getedad() );
    System.out.println("Codigo de Provincia: " + per.getprov().getcodigoProv() );
    }
   
}
