
package Ejercicio_7.Servicio;

import Ejercicio_7.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class PersonaServicio {
    
    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);

//el método crear persona, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//Si no es correcto se deberá mostrar un mensaje
    public void crearPersona(){

        System.out.println("el nombre");
        p1.setNombre(leer.next());
        System.out.println("la edad");
        p1.setEdad(leer.nextInt());
        
        do {
            System.out.println("el sexo");
            System.out.println("'H' hombre");
            System.out.println("'M' mujer");
            System.out.println("'O' otro");
            p1.setSexo(leer.next());
            
            if (!p1.getSexo().equalsIgnoreCase("H") && !p1.getSexo().equalsIgnoreCase("M") && !p1.getSexo().equalsIgnoreCase("O")) {
                
                System.out.println("el sexo ingresado no es valido");
            }
        } while (!p1.getSexo().equalsIgnoreCase("H") && !p1.getSexo().equalsIgnoreCase("M") && !p1.getSexo().equalsIgnoreCase("O"));
        
        System.out.println("el peso");
        p1.setPeso(leer.nextDouble());
        System.out.println("la altura");
        p1.setAltura(leer.nextDouble());
    }
    
//calculara si la persona está en su peso ideal
//Si esta fórmula da menor que 20, la persona está por debajo de su peso ideal y la función devuelve un -1. 
//Si da mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
//Si da entre 20 y 25 (incluidos), significa que está en su peso ideal y la función devuelve un 0. 
    public int calcularIMC(){
        
        int IMC;
        
        if (p1.getPeso()/(Math.pow(p1.getAltura(), 2)) < 20) {
            IMC=-1;
        }else if(p1.getPeso()/(Math.pow(p1.getAltura(), 2)) > 20){
            IMC=1;
        }else{
            IMC=0;
        }
        return IMC;
    }
    
//indica si la persona es mayor de edad.
    public boolean esMayorDeEdad(){
        
        return p1.getEdad()>=21;
    }
}
