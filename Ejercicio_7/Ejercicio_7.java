/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Ejercicio_7;

import Ejercicio_7.Entidad.Persona;
import Ejercicio_7.Servicio.PersonaServicio;

/**
 *
 * @author Damian
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        
        PersonaServicio s1 = new PersonaServicio();
        
        System.out.println("ingrese los datos de la primer persona");
        Persona p1 = s1.crearPersona();
        System.out.println("ingrese los datos de la segunda persona");
        Persona p2 = s1.crearPersona();
        System.out.println("ingrese los datos de la tercera persona");
        Persona p3 = s1.crearPersona();
        System.out.println("ingrese los datos de la cuarta persona");
        Persona p4 = s1.crearPersona();

        int[] IMC= new int[4];
        boolean[] ME= new boolean[4];

        IMC[0] = s1.calcularIMC(p1);
        ME[0] = s1.esMayorDeEdad(p1);
        IMC[1] = s1.calcularIMC(p2);
        ME[1] = s1.esMayorDeEdad(p2);
        IMC[2] = s1.calcularIMC(p3);
        ME[2] = s1.esMayorDeEdad(p3);
        IMC[3] = s1.calcularIMC(p4);
        ME[3] = s1.esMayorDeEdad(p4);
        
        int debajo = 0;
        int encima = 0;
        int ideal = 0;
        int mayores = 0;
        int menores = 0;
        
        
        for (int i = 0; i < 4; i++) {
            
            if (IMC[i] < 1) {
                debajo +=1;
            }else if(IMC[i] > 1){
                encima += 1;
            }else{
                ideal += 1;
            }
            if (ME[i]) {
                mayores += 1;
            }else{
                menores += 1;
            }   
        }
        System.out.println(debajo+"");
        System.out.println(debajo+" están por debajo de su peso");
        System.out.println(encima+" están por encima de su peso");
        System.out.println(ideal+" están en su peso ideal");
        System.out.println(mayores+" son mayores de edad");
        System.out.println(menores+" son menores de edad");
    }
}
