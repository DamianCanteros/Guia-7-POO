
package Ejercicio_Extra_3.Servicio;

import Ejercicio_Extra_3.Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    Raices r1 = new Raices();

//Carga la entidad Raices
    public void cargarRaices(){
        System.out.println("ingrese el valor de A");
        r1.setA(leer.nextInt());
        System.out.println("ingrese el valor de B");
        r1.setB(leer.nextInt());
        System.out.println("ingrese el valor de C");
        r1.setC(leer.nextInt());
    }
    
//devuelve el valor del discriminante = (b^2)-4*a*c
    public double getDiscriminante(){

        return Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC();
    }
    
//indica si tiene dos soluciones, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(){

        return getDiscriminante()>0;
    }
    
//indica si tiene una única solución, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(){

        return getDiscriminante()==0;
    }
//llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles soluciones.
    public void obtenerRaices(){

        if (tieneRaices()){
            System.out.println("Solución 1: "+(-r1.getB() + Math.sqrt(getDiscriminante()))/(2*r1.getA()));
            System.out.println("Solución 2: "+(-r1.getB() - Math.sqrt(getDiscriminante()))/(2*r1.getA()));
        }
    }
    
//llama a tieneRaiz() y si devolvió́true imprime una única raíz.
    public void obtenerRaiz(){
        
        if (tieneRaiz()){
            System.out.println("Solución: "+(-r1.getB()/(2*r1.getA())));
        }
    }
    
//llama tieneRaices() y a tieneRaíz(), y muestra por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
//(-b±√((b^2)-(4*a*c)))/(2*a) 
    public void calcular(){
        
        if (tieneRaices()   ) {
            obtenerRaices();
        }else if (tieneRaiz()) {
            obtenerRaiz(); 
        }else{
            System.out.println("No existe solución");
        }
    }
}
