
package Ejercicio_2.Servicio;

import Ejercicio_2.Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CircunferenciaServicio {
    
    Circunferencia c1 = new Circunferencia();
    Scanner leer = new Scanner(System.in);  
    
    public void crearCircunferencia(){

        System.out.println("ingrese el radio");
        c1.setRadio(leer.nextDouble());
    }
    
    public double calcularArea (){
        
        double area = Math.PI * Math.pow(c1.getRadio(),2);
        
        return area;
    }
    
    public double calcularPerimetro (){
        
         double perimetro = 2 * Math.PI * c1.getRadio();
        
        return perimetro;
    }
}