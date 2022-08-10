
package Ejercicio_5.Servicio;

import Ejercicio_5.Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CuentaServicio {
    
    Cuenta c1 = new Cuenta();
    Scanner leer = new Scanner(System.in);
    
    public void CrearCuenta(){

        System.out.println("ingrese el número de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese el DNI");
        c1.setDNI(leer.nextInt());
        System.out.println("ingrese el saldo actual");
        c1.setSaldoActual(leer.nextInt());
    }
    
    public void Ingresar(int CantDinero){
        
        c1.setSaldoActual(c1.getSaldoActual()+CantDinero);

    }
    
    public void Retirar(int CantDinero){
        
        if (c1.getSaldoActual()<=  CantDinero){
            c1.setSaldoActual(0);
        }else{
            c1.setSaldoActual(c1.getSaldoActual()-CantDinero);
        }

    }
    
    public void extraccionRapida(int CantDinero){
        
        if (c1.getSaldoActual()*0.2 <  CantDinero){
            System.out.println("no puede extraer mas del 20% del saldo actual");
        }else{
            c1.setSaldoActual(c1.getSaldoActual()-CantDinero);
        }
    }
    
    public void consultarSaldo(){
        System.out.println("su saldo disponible es " + c1.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println(c1.toString());
    }
}
