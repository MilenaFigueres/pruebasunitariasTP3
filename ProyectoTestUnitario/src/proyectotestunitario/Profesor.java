
package proyectotestunitario;

import java.util.ArrayList;
import java.util.List;



public class Profesor {

private static List<Profesor> instancias = new ArrayList(); //lista instancias de profesores.
    
public String usuario;
public String contrasenia;
public String nombre;
public int CUIL;


    public Profesor(String us, String con, String nomb, int Cuil) {
        this.usuario= us;
        this.contrasenia=con;
        this.nombre=nomb;
        this.CUIL=Cuil;
    }

public static void addList(Profesor p) {

instancias.add(p); //Agregar el nuevo profesor a la lista.

}
    
    
public static Profesor getProfesor(int cuil) {
   
    for(Profesor p  : instancias){
    if(p.CUIL == cuil)
    return p;}
    
    return new Profesor("sin usuario", "sin contraseña","sin nombre", cuil);
       
}
   
//Metodo Alta profesor. Devuelve true si el objeto es creado, y false si no se creó.

public static boolean altaProfesor(String us, String con, String nomb, int cuil){

    boolean iscreated = true;
     
     
    if (us.length()==0) {  // valida que el usuario no sea nulo.
     iscreated = false;
     return iscreated;
     }
     if (con.length()<8){  // valida que la contraseña se mayor o igual a 8 caracteres.
     iscreated = false;
     return iscreated;
     }
   
     Profesor profesor = new Profesor(us,con,nomb,cuil);   

    addList(profesor);
     
    return iscreated;
}


}