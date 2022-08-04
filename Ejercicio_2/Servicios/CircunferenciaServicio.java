
package Ejercicio_2.Servicios;

import Ejercicio_2.Objetos.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CircunferenciaServicio {
    
    Circunferencia c1 = new Circunferencia();
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);  
        
        System.out.println("ingrese el radio");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    }
    
    public Circunferencia calcularArea (Circunferencia c1){
        
        c1.setArea(Math.PI * Math.pow(c1.getRadio(),2));
        
        return c1;
        
    }
    
    public Circunferencia calcularPerimetro (Circunferencia c1){
        
        c1.setPerimetro(2 * Math.PI * c1.getRadio());
        
        return c1;
    }
        
    public void Mostrar(Circunferencia c1){

        System.out.println(c1.toString());
    }
}