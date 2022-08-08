
package Ejercicio_9.Servicio;

import Ejercicio_9.Entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class MatematicaServicio {
    
    Scanner leer = new Scanner(System.in);
    Matematica m1 = new Matematica();
    
//se encarga de cargar la clase Matematica
    public Matematica cargarNumeros(){
        
        m1.setNumero1(Math.random()*10);
        m1.setNumero2(Math.random()*10);
        return m1;
    }
    
//retornar cuál de los dos atributos tiene el mayor valor  
    public double devolverMayor(Matematica m1){
        
        return Math.max(m1.getNumero1(),m1.getNumero2());
    }
    
//calcula la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    public double calcularPotencia(Matematica m1){
        
        double n1 = Math.round(m1.getNumero1());
        double n2 = Math.round(m1.getNumero1());
        
        return Math.pow(Math.max(n1,n2),Math.min(n1,n2));
    }
    
//calcula la raíz cuadrada del menor de los dos valores.Antes debe obtener el valor absoluto del número  
    public double calculaRaiz(Matematica m1){
            
        return Math.sqrt(Math.round(Math.min(m1.getNumero1(),m1.getNumero2())));
    }
}
