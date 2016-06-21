package javaapplication18;

public class Provincia {

private int codigoProv;
private String nombreProv;

Provincia(int cod, String nombre) {
this.codigoProv = cod;
this.nombreProv = nombre;
}

public int getcodigoProv() {
return this.codigoProv;
}

public String getnombreProv() {
return this.nombreProv;
}

public void setcodigoProv(int codigoProv) {
this.codigoProv = codigoProv;
}
public void setnombreProv(String nombreProv) {
this.nombreProv = nombreProv;
}    
}
