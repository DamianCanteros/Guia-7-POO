
package Ejercicio_2.Servicio;

import Ejercicio_2.Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CircunferenciaServicio {
    
    Scanner leer = new Scanner(System.in);  
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();

        System.out.println("ingrese el radio");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    }
    
    public double calcularArea (Circunferencia c1){
        
        double area = Math.PI * Math.pow(c1.getRadio(),2);
        
        return area;
        
    }
    
    public double calcularPerimetro (Circunferencia c1){
        
         double perimetro = 2 * Math.PI * c1.getRadio();
        
        return perimetro;
    }
}