/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha aceciendo otro mes: agostortado. Intente adivinarlo introdu
¡Ha acertado!
 */
package Ejercicio_Extra_5;

import Ejercicio_Extra_5.Servicio.EntidadServicio;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_5 {

    public static void main(String[] args) {

        EntidadServicio s1 = new EntidadServicio();
        
        s1.adivinarMes();   
    }
}
