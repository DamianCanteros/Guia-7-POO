
package Ejercicio_8.Servicio;

import Ejercicio_8.Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class EntidadServicio {
    
    Scanner leer = new Scanner(System.in);
    Cadena c1 = new Cadena();
    
    public Cadena crearCadena (){
        
        System.out.println("ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        
        return c1;
        
    }
    
    public int mostrarVocales(){
        
        
    }
    
    public void invertirFrase(){
        
        System.out.println("");
        
    }
    
    public void vecesRepetido(String letra){
        
        System.out.println("El carácter"+i+"se repite"+letra+"veces");
        
    }
      
    public boolean compararLongitud(String frase){
        
    }
    
    public void unirFrases(String frase){
        
    }
    
    public void reemplazar(String letra){
        
    }
     
    public void contiene(String letra){
        
    }
}
