
package Ejercicio_2.Objetos;

/**
 *
 * @author Damian
 */
public class Circunferencia {
    
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia" + "\n" +
               "radio=" + radio + "\n" +
               "area=" + area + "\n" +
               "perimetro=" + perimetro ;
    }  
}
