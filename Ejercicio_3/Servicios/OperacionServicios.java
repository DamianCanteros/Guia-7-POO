
package Ejercicio_3.Servicios;

import Ejercicio_3.Objetos.Operacion;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class OperacionServicios {
    
    public Operacion crearOperacion(){
        
        Operacion o1 = new Operacion();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el primer número");
        o1.setNumero1(leer.nextInt());
        
        System.out.println("ingrese el segundo número");
        o1.setNumero2(leer.nextInt());
        
        return o1;
    }
    
    public void sumar(Operacion o1){
        
        System.out.println("La suma es "+(o1.getNumero1() + o1.getNumero2())); 
    }
    
    public void restar(Operacion o1){
        
        System.out.println("La resta es "+(o1.getNumero1() - o1.getNumero2())); 
    }
    
    public void multiplicar(Operacion o1){
        if (o1.getNumero1()==0 || o1.getNumero2()==0){
            System.out.println("esta multiplicando por cero");
        }else {
            System.out.println("La multiplicación es "+(o1.getNumero1() * o1.getNumero2()));   
        }
    }
    
    public void dividir(Operacion o1){
        if (o1.getNumero1()==0 || o1.getNumero2()==0){
            System.out.println("esta dividiendo por cero");
        }else {
            System.out.println("La division es "+(o1.getNumero1() / o1.getNumero2()));   
        }
    }
}
