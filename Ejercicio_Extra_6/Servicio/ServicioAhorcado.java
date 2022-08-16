
package Ejercicio_Extra_6.Servicio;

import Ejercicio_Extra_6.Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ServicioAhorcado {
    
    Scanner leer = new Scanner(System.in);
    Ahorcado a1 = new Ahorcado();
    
//le pide la palabra al usuario, cantidad de jugadas máxima y encontradas en 0.
    public void crearJuego(){
        
        System.out.println("ingrese la palabra a buscar");
        String palabra = leer.next();
        
        String Vector []= new String [palabra.length()];
        a1.setPalabra(new String [palabra.length()]);
                
        for (int i = 0; i < palabra.length(); i++) {

            Vector [i]=palabra.substring(i,i+1);
            a1.setPalabra(Vector);
        }
        
        System.out.println("ingrese la cantidad de jugadas máximas");
        a1.setJugadasMaximas(leer.nextInt());
        a1.setLetrasEncontradas(0);
    }
    
//muestra la longitud de la palabra que se debe encontrar.
        public void longitud(){
            
            System.out.println("La palabra tiene "+a1.getPalabra().length+" letras");
        }
        
//recibe una letra, busca si es parte de la palabra o no e informa si la letra estaba o no.  
    public void buscar(String letra){
        
        if (encontradas(letra)) {
            System.out.println("La letra pertenece a la palabra ");
        }else {
            System.out.println("La letra no pertenece a la palabra ");
            intentos();
        }    
    }
    
//recibe una letra y muestra cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba   
    public boolean encontradas(String letra){
        
        boolean aux=false;
        for (int i = 0; i < a1.getPalabra().length; i++) {  

            if ( (a1.getPalabra()[i]).equalsIgnoreCase(letra)) {
                a1.setLetrasEncontradas(a1.getLetrasEncontradas()+1);
                aux=true;
            }
        }
        System.out.println("Número de letras encontradas: "+a1.getLetrasEncontradas());
        System.out.println("Número de letras faltantes: "+(a1.getPalabra().length-a1.getLetrasEncontradas()));
            
        return aux;
    } 
//muestra cuantas oportunidades le queda al jugador. 
    public void intentos(){
        
        a1.setJugadasMaximas(a1.getJugadasMaximas()-1);
        System.out.println("Número de oportunidades restantes: "+a1.getJugadasMaximas());
    }
//llama todos los métodos e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
    public void juego(){
        
        crearJuego();
        longitud();
        do {
            System.out.println("ingrese una letra");
            String letra = leer.next();
            
            buscar(letra);

            System.out.println("----------------------------------------------");
            if (a1.getLetrasEncontradas()==a1.getPalabra().length) {
                System.out.println("Felicidades, descubriste la palabra");
                break;
            } else if (a1.getJugadasMaximas()==0) {
                System.out.println("Lo sentimos, no hay más oportunidades");
            }   
        } while (a1.getJugadasMaximas()!=0);
    }
}
