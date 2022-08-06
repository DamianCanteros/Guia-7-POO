
package Ejercicio_3.Servicio;

import Ejercicio_3.Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class OperacionServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        Operacion o1 = new Operacion();
        
        System.out.println("ingrese el primer número");
        o1.setNumero1(leer.nextInt());
        
        System.out.println("ingrese el segundo número");
        o1.setNumero2(leer.nextInt());
        
        return o1;
    }
    
    public int sumar(Operacion o1){
        
       int suma=  o1.getNumero1()+ o1.getNumero2();
       return suma;
    }
    
    public int restar(Operacion o1){
        
        int resta=  o1.getNumero1()- o1.getNumero2(); 
        return resta;
    }
    
    public int multiplicar(Operacion o1){
        int multiplicacion;
        if (o1.getNumero1()==0 || o1.getNumero2()==0){
            multiplicacion=0;
        }else {
            multiplicacion=  o1.getNumero1()* o1.getNumero2();
        }
        return multiplicacion;
    }
    
    public double dividir(Operacion o1){
        double dividision;
        if (o1.getNumero1()==0 || o1.getNumero2()==0){
            dividision=0;
        }else {
            dividision=  o1.getNumero1()/ o1.getNumero2();
        }
        return dividision; 
    }
}
