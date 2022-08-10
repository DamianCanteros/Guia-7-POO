
package Ejercicio_4.Servicio;

import Ejercicio_4.Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class RectanguloServicio {
    
    Rectangulo r1 = new Rectangulo();
    Scanner leer = new Scanner(System.in);
    
    public void crearRectangulo(){

        
        System.out.println("ingrese la base");
        r1.setBase(leer.nextInt());
        System.out.println("ingrese la altura");
        r1.setAltura(leer.nextInt());   

    }
    
    public double calcularSuperficie (){
        
        double superficie = r1.getBase()*r1.getAltura();
        
        return superficie;
        
    }
    
    public double calcularPerimetro (){
        
         double perimetro = 2 * r1.getBase()*r1.getAltura();
        
        return perimetro;
    }
    
    public void mostrarRectangulo (){
        
        for(int i=1 ; i<=r1.getAltura() ; i++) {
            
            System.out.println("   ");
            
            for(int j=1 ; j<=r1.getBase() ; j++) {
                
                if (i==1 || i==r1.getAltura() ){
                    System.out.print("* ");
                }else if (j==1 || j==r1.getBase()){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");    
                }       
            }
        }
        
    } 
}
