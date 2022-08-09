/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Ejercicio_10;

import java.util.Arrays;

/**
 *
 * @author Damian
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
    
        double [] VectorA = new double [50];
        double [] VectorB = new double [20];
        
        for (int i = 0; i < 50; i++) {
            
            VectorA[i]= Math.random()*100;
        }
        System.out.println("VectorA: "+Arrays.toString(VectorA));
        
        Arrays.sort(VectorA);
        
        for (int i = 0; i < 10; i++) {
            
            VectorB[i]=VectorA[i];
        }
        for (int i = 10; i < 20; i++) {
            
            VectorB[i]=0.5;
        }
        System.out.println("VectorA: "+Arrays.toString(VectorA));
        System.out.println("VectorB: "+Arrays.toString(VectorB));
    }
}
