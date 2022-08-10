
package Ejercicio_3.Servicio;

import Ejercicio_3.Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class OperacionServicio {
    
    Operacion o1 = new Operacion();
    Scanner leer = new Scanner(System.in);
    
    public void crearOperacion(){
        
        System.out.println("ingrese el primer número");
        o1.setNumero1(leer.nextInt());
        
        System.out.println("ingrese el segundo número");
        o1.setNumero2(leer.nextInt());
    }
    
    public int sumar(){
        
       int suma=  o1.getNumero1()+ o1.getNumero2();
       return suma;
    }
    
    public int restar(){
        
        int resta=  o1.getNumero1()- o1.getNumero2(); 
        return resta;
    }
    
    public int multiplicar(){
        int multiplicacion;
        if (o1.getNumero1()==0 || o1.getNumero2()==0){
            multiplicacion=0;
        }else {
            multiplicacion=  o1.getNumero1()* o1.getNumero2();
        }
        return multiplicacion;
    }
    
    public double dividir(){
        double dividision;
        if (o1.getNumero1()==0 || o1.getNumero2()==0){
            dividision=0;
        }else {
            dividision=  o1.getNumero1()/ o1.getNumero2();
        }
        return dividision; 
    }
}
