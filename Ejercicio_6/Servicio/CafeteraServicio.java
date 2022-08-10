
package Ejercicio_6.Servicio;

import Ejercicio_6.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CafeteraServicio {
    
    Cafetera c1 = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
//hace que la cantidad actual sea igual a la capacidad máxima
    public void llenarCafetera(){
         
        System.out.println("ingrese la capacidad maxima de la cafetera");
        c1.setCapacidadMaxima(leer.nextInt());
        c1.setCantidadActual(c1.getCapacidadMaxima());  
    }
    
//el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada
//Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede
//El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza
    public void servirTaza(int taza){
        
        if (c1.getCantidadActual() < taza) {
            System.out.println("no se llenó la taza, se cargó "+c1.getCantidadActual());
            c1.setCantidadActual(0);
        }else{
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("se llenó la taza");
        }
    }
    
//pone la cantidad de café actual en cero 
    public void vaciarCafetera(){
        
        c1.setCantidadActual(0);
    }
    
//se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada
    public void agregarCafe(int cafe){
        
        c1.setCantidadActual(c1.getCantidadActual() + cafe);
    }
}
