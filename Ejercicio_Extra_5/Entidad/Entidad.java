
package Ejercicio_Extra_5.Entidad;

/**
 *
 * @author Damian
 */
public class Entidad {
    
    private String mes[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiempre","octubre","noviembre","diciembre"};
    private String mesSecreto = mes[7];

    public Entidad() {
    }

    public String[] getMes() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
}
