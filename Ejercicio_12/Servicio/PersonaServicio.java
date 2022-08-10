
package Ejercicio_12.Servicio;

import Ejercicio_12.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();

//rellena el objeto mediante un Scanner
    public void crearPersona(){
        
        System.out.println("ingrese el nombre");
        p1.setNombre(leer.next());
        System.out.println("ingrese la fecha de nacimiento");
        System.out.println("el dia");
        int dia = leer.nextInt();
        System.out.println("el mes");
        int mes = leer.nextInt();;
        System.out.println("el año");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        p1.setFechaDeNacimiento(fecha);
    }
    
//calcula la edad a partir de la fecha de nacimiento ingresada
    public int calcularEdad(){
        
        Date fechaActual = new Date();
        if (fechaActual.getMonth()>p1.getFechaDeNacimiento().getMonth()) {
            
            return fechaActual.getYear()-p1.getFechaDeNacimiento().getYear()-1;
        }else{
            return fechaActual.getYear()-p1.getFechaDeNacimiento().getYear();         
        }
    }
    
//retorna true en caso de que el receptor tenga menor edad que la persona que se recibe como parámetro, o false en caso contrario.   
    public boolean menorQue(int edad){

        return calcularEdad()< edad;
    }
    
//muestra la persona creada
    public void mostrarPersona(){

        System.out.println(p1.toString());
    }
}
