/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Ejercicio_11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Date fecha = new Date();
        Date fechaActual = new Date();
        
        System.out.println("ingrese el dia");
        fecha.setDate(leer.nextInt());
        System.out.println("ingrese el mes");
        fecha.setMonth(leer.nextInt());
        System.out.println("ingrese el año");
        fecha.setYear(leer.nextInt());
        
        System.out.println("la fecha es "+fecha.getDate()+" "+fecha.getMonth()+" "+fecha.getYear());
        System.out.println("hay "+(fechaActual.getYear()+1900-fecha.getYear())+" años de diferencia"); 
    }    
}
