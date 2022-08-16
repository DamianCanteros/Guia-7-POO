
package Ejercicio_Extra_5.Servicio;

import Ejercicio_Extra_5.Entidad.Entidad;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class EntidadServicio {
    
    Scanner leer = new Scanner(System.in);
    Entidad e1 = new Entidad();
    
    public void adivinarMes(){
        
        String mesSecreto;
        
        System.out.println("Adivine el mes secreto");
        
        do {
            System.out.print("Introduzca el nombre del mes un minúsculas: ");
            mesSecreto = leer.next();
            if (!e1.getMesSecreto().equals(mesSecreto)) {
                
                System.out.println("No ha acertado");  
            } 
        } while (!e1.getMesSecreto().equals(mesSecreto));
        
        System.out.println("¡Ha acertado!");
    }
}
