/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejercicio_8;

import Ejercicio_8.Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CadenaServicio s1 = new CadenaServicio();
        
        s1.crearCadena();
        int opcion;
        String frase="";
        String letra="";
        
        do {
            System.out.println("");  
            System.out.println("elija una opcion");
            System.out.println("1 contabilizar la cantidad de vocales que tiene la frase");
            System.out.println("2 invertir la frase ingresada y mostrarla por pantalla");
            System.out.println("Ingresar otra frase y:");
            System.out.println("3 comparar la longitud de las frases");
            System.out.println("4 unir las frases");
            System.out.println("Ingresar un caracter y:");
            System.out.println("5 contabilizar cuántas veces se repite el carácter en la frase");
            System.out.println("6 reemplazar todas las letras “a” por el carácter ingresado");
            System.out.println("7 comprobar si la frase contiene el carácter ingresado");
            System.out.println("8 salir");
            opcion = leer.nextInt();

            if (opcion==3 || opcion==4) {
                System.out.println("ingrese la nueva frase");
                frase = leer.next();
            }else if (opcion==5 || opcion==6 || opcion==7) {
                System.out.println("ingrese el caracter");
                letra = leer.next();
            }

            switch(opcion){
                case 1:
                    System.out.println("la frase tiene "+s1.mostrarVocales()+" vocales") ;
                break;
                case 2:
                    s1.invertirFrase();
                break;
                case 3:
                    System.out.println(s1.compararLongitud(frase));
                break;
                case 4:
                    s1.unirFrases(frase);
                break;
                case 5:
                    s1.vecesRepetido(letra);
                break;
                case 6:
                    s1.reemplazar(letra);
                break;
                case 7:
                   System.out.println(s1.contiene(letra));
                break;
            }   
        } while (opcion !=8);           
    }
}
