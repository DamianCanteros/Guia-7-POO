/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Ejercicio_1;

import Ejercicio_1.Entidad.Libro;
import Ejercicio_1.Servicio.LibroServicio;

/**
 *
 * @author Damian
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        LibroServicio LS = new LibroServicio();
        Libro L1 = LS.Cargar();
        LS.Mostrar(L1);
    }  
}
