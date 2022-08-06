
package Ejercicio_5.Servicio;

import Ejercicio_5.Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta CrearCuenta(){
        
        Cuenta c1 = new Cuenta();
        
        System.out.println("ingrese el número de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese el DNI");
        c1.setDNI(leer.nextInt());
        System.out.println("ingrese el saldo actual");
        c1.setSaldoActual(leer.nextInt());
        
        return c1;
    }
    
    public void Ingresar(Cuenta c1, int CantDinero){
        
        c1.setSaldoActual(c1.getSaldoActual()+CantDinero);

    }
    
    public void Retirar(Cuenta c1, int CantDinero){
        
        if (c1.getSaldoActual()<=  CantDinero){
            c1.setSaldoActual(0);
        }else{
            c1.setSaldoActual(c1.getSaldoActual()-CantDinero);
        }

    }
    
    public void extraccionRapida(Cuenta c1, int CantDinero){
        
        if (c1.getSaldoActual()*0.2 <  CantDinero){
            System.out.println("no puede extraer mas del 20% del saldo actual");
        }else{
            c1.setSaldoActual(c1.getSaldoActual()-CantDinero);
        }
    }
    
    public void consultarSaldo(Cuenta c1){
        System.out.println("su saldo disponible es " + c1.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta c1){
        System.out.println(c1.toString());
    }
}
