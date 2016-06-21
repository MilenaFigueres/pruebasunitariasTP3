package javaapplication18;


public class Persona {

private int DNI;
private String nombre;
private int edad;
private Provincia prov;



public int getDNI() {
return this.DNI;
}
public String getnombre() {
return this.nombre;
}
public int getedad() {
return this.edad;
}
public Provincia getprov() {
return this.prov;
}


public void setDNI(int DNI) {
this.DNI = DNI;
}
public void setnombre(String nombre) {
this.nombre = nombre;
}
public void setedad(int edad) {
this.edad = edad;
}
public void setprov(Provincia prov) {
this.prov = prov;
}

}
