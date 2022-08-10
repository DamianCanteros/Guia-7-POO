/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Ejercicio_6;

import Ejercicio_6.Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CafeteraServicio s1 = new CafeteraServicio();
        
        s1.llenarCafetera();
        int opcion;

        do {
            System.out.println("");
            
            System.out.println("elija una opcion");
            System.out.println("1 servir taza");
            System.out.println("2 vaciar cafetera");
            System.out.println("3 agregar café");
            System.out.println("4 salir");
            opcion = leer.nextInt();


            switch(opcion){
                case 1:
                    System.out.println("ingrese el tamaño de la taza vacía");
                    int taza = leer.nextInt();
                    s1.servirTaza(taza);
                break;
                case 2:
                    s1.vaciarCafetera();
                break;
                case 3:
                    System.out.println("ingrese la cantidad de café");
                    int cafe = leer.nextInt();
                    s1.agregarCafe(cafe);
                break;
            }   
        } while (opcion !=4);           
    }
}
