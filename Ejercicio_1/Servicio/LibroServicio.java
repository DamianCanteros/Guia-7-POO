
package Ejercicio_1.Servicio;

import Ejercicio_1.Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class LibroServicio {

    Scanner Leer = new Scanner(System.in);   
    
    public Libro Cargar() {

        Libro L1 = new Libro();

        System.out.println("ingrese el ISBN");
        L1.setISBN(Leer.nextInt());

        System.out.println("ingrese el Título");
        L1.setTitulo(Leer.next());
        
        System.out.println("ingrese el Autor");
        L1.setAutor(Leer.next());

        System.out.println("ingrese el Número de Páginas");
        L1.setNumeroDePaginas(Leer.nextInt());

        return L1;
    }
    
        public void Mostrar(Libro L1) {
            
            System.out.println( L1.toString());
        }
}
