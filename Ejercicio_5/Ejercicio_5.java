/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Ejercicio_5;

import Ejercicio_5.Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        
        CuentaServicio s1 = new CuentaServicio();
        Scanner leer = new Scanner(System.in);
        
        s1.CrearCuenta();
        int opcion;
        int CantDinero;   

        do {
            System.out.println("");
            
            System.out.println("elija una opcion");
            System.out.println("1 ingresar dinero");
            System.out.println("2 retirar dinero");
            System.out.println("3 extraccion rapida");
            System.out.println("4 consultar saldo");
            System.out.println("5 consultar datos");
            System.out.println("6 salir");
            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("cuanto dinero desea ingresar");
                    CantDinero = leer.nextInt();
                    s1.Ingresar(CantDinero);
                break;
                case 2:
                    System.out.println("cuanto dinero desea retirar");
                    CantDinero = leer.nextInt();
                    s1.Retirar(CantDinero);
                break;
                case 3:
                    System.out.println("cuanto dinero desea retirar");
                    CantDinero = leer.nextInt();
                    s1.extraccionRapida(CantDinero);
                break;
                case 4:
                    s1.consultarSaldo();
                break;
                case 5:
                    s1.consultarDatos();
                break;
            } 
        } while (opcion !=6);           
    }
}
