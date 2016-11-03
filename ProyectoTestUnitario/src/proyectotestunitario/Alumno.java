

package proyectotestunitario;


public class Alumno {

public String usuario;
public String contrasenia;
public int legajo;
public String nombre;
public Nivel nivel;
public Profesor prof;
public int puntajeAcumulado;


//constructor.   
public Alumno(String usuario, String contrasenia, int leg, String nombre, int cuilp) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.legajo = leg;
        this.nombre = nombre;
        this.nivel.numeroNivel = 1;
        this.prof = Profesor.getProfesor(cuilp);
    }

//metodo crear nuevo usuario Alumno.
public static boolean altaAlumno(String us, String con, int leg, String nomb, int cuilp ){

    boolean iscreated = true;
     
     
    if (us.length()==0) {  // valida que el usuario no sea nulo.
     iscreated = false;
     return iscreated;
     }
     if (con.length()<6){  // valida que la contraseña se mayor o igual a 6 caracteres.
     iscreated = false;
     return iscreated;
     }
   
     Alumno alumno = new Alumno(us,con,leg, nomb, cuilp);   

     return iscreated;
}

//metodo cambiar contraseña.

public boolean cambiarContrasenia(String us, String cont) {

 boolean iscreated = true;
     
     
     if (cont.length()<6){  // valida que la contraseña se mayor o igual a 6 caracteres.
     iscreated = false;
     return iscreated;
     }
     
     this.contrasenia = cont;
     return iscreated;    
}
}

