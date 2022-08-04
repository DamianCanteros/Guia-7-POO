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

import Ejercicio_2.Objetos.Circunferencia;
import Ejercicio_2.Servicios.CircunferenciaServicio;

/**
 *
 * @author Damian
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        
        CircunferenciaServicio s1 = new CircunferenciaServicio();
        Circunferencia c1 = s1.crearCircunferencia();
        s1.calcularArea(c1);
        s1.calcularPerimetro(c1);
        s1.Mostrar(c1);     
    }   
}
