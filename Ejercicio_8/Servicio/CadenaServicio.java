
package Ejercicio_8.Servicio;

import Ejercicio_8.Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in);
    Cadena c1 = new Cadena();
    
//se le pide al usuario que ingrese una frase y se guarda la frase y la longitud
    public void crearCadena (){
        
        System.out.println("ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        System.out.println(c1.getFrase());
        System.out.println(c1.getLongitud());
    }
    
    //contabiliza la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(){
        
        int vocales=0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            String vocal = c1.getFrase().substring(i,i+1);
            
            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {

                    vocales +=1;
            }
        }
        return vocales;
    }
    
    
//invierte la frase ingresada y la muestra por pantalla
    public void invertirFrase(){
         
        System.out.println("FRASE ORIGINAL");
        System.out.println("");
        System.out.println(c1.getFrase());
        System.out.println("");
        System.out.println("FRASE INVERTIDA");
        for (int i = c1.getLongitud(); i > 0; i--) {
            System.out.print(c1.getFrase().substring(i-1,i));
        }
    }
    
//recibe un carácter ingresado por el usuario y contabiliza cuántas veces se repite el carácter en la frase
    public void vecesRepetido(String letra){
               
        int j=0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {

            if (c1.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {

                    j +=1;
            }
        }
        System.out.println("El carácter "+letra+" se repite "+j+" veces");
    }
      
//compara la longitud de la frase con otra nueva frase ingresada por el usuario.
    public boolean compararLongitud(String frase){
        
        return c1.getLongitud()==frase.length();    
    }
    
//une la frase contenida en la clase Cadena con una nueva frase y muestra la frase resultante
    public void unirFrases(String frase){
        
        System.out.println(c1.getFrase().concat(frase));
    }
    
//reemplazar todas las letras “a” en la frase, por otro carácter ingresado por el usuario y muestra lafrase resultante
    public void reemplazar(String letra){
        
        for (int i = 0; i < c1.getLongitud(); i++) {

            if (c1.getFrase().substring(i,i+1).equalsIgnoreCase("a")) {

                System.out.print(letra);
            }else{
                System.out.print(c1.getFrase().substring(i,i+1));    
            }
        }
    }
     
//comprueba si la frase contiene una letra ingresada por el usuario y devuelve verdadero si la contiene y falso si no
    public boolean contiene(String letra){
        
        return c1.getFrase().contains(letra);
    }
}
