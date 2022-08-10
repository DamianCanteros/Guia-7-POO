/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Ejercicio_2;

import Ejercicio_2.Servicio.CircunferenciaServicio;

/**
 *
 * @author Damian
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        
        CircunferenciaServicio s1 = new CircunferenciaServicio();
        s1.crearCircunferencia();
        
        System.out.println("el area de la circunferencia es " + s1.calcularArea());
        System.out.println("el perimetro de la circunferencia es " + s1.calcularPerimetro());

    }   
}
