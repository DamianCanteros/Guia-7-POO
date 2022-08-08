/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Ejercicio_9;

import Ejercicio_9.Entidad.Matematica;
import Ejercicio_9.Servicio.MatematicaServicio;

/**
 *
 * @author Damian
 */
public class Ejercicio_9 {

    public static void main(String[] args) {

        MatematicaServicio s1 = new MatematicaServicio();
        Matematica m1 = s1.cargarNumeros();
        System.out.println("el primer numero es: "+m1.getNumero1());
        System.out.println("el segundo numero es: "+m1.getNumero2());
        System.out.println("el mayor valor es: "+s1.devolverMayor(m1));
        System.out.println("la potencia es: "+s1.calcularPotencia(m1));
        System.out.println("la raíz cuadrada del menor es: "+s1.calculaRaiz(m1));
        
    } 
}
