/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicio_4;

import Ejercicio_4.Servicio.RectanguloServicio;

/**
 *
 * @author Damian
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        
        RectanguloServicio s1 = new RectanguloServicio();
        s1.crearRectangulo();
        
        System.out.println("la superficie del rectangulo es " + s1.calcularSuperficie());
        System.out.println("el perimetro del rectangulo es " + s1.calcularPerimetro());
        s1.mostrarRectangulo();
    }
}
