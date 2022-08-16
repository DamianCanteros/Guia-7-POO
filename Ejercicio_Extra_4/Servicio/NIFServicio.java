
package Ejercicio_Extra_4.Servicio;

import Ejercicio_Extra_4.Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NIFServicio {
    
    Scanner leer = new Scanner(System.in);
    NIF n1 = new NIF();
    
//le pide al usuario el DNI y calcula la letra que le corresponde  
    public void crearNif(){
        
        System.out.println("ingrese el DNI");
        n1.setDNI(leer.nextInt());
        
        String Vector[]= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        n1.setLetra(Vector[n1.getDNI()%23]); 
    }
    
//muestra el NIF (ocho dígitos, un guion y la letra en mayúscula
    public void mostrar(){

        System.out.println(n1.getDNI()+"-"+n1.getLetra());
    }
    
    
}