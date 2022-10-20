package ExamenPractico;

import java.text.DecimalFormat;
public abstract class Empleado {

    //Atributos
    private String RFC;
    private String apellidos;
    private String nombres;

    //Constructores
    public Empleado(String dni, String apellidos, String nombres) {
        this.RFC = RFC;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    //Encapsulamiento de datos

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRFC() {
        return RFC;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    //Metodos adicionales
    public String MostrarInfo() {
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nNombres \t\t: " + getNombres() +
                "\nApellidos |t|t: " + getApellidos() +
                "\nRFC \t\t: " + getRFC() +
                "\nIngresos |t|t: " + df.format(ingresos()) +
                "\nBonificaciones\t\t: " + df.format(bonificaciones()) +
                "\nDescuentos\t\t: " + df.format(descuentos()) +
                "\nSueldo Neto: " + df.format(sueldoneto());
    }

    public double sueldoneto() {
        return ingresos() + bonificaciones() - descuentos();
    }

    //Metodos abstractos
    public abstract double ingresos();

    public abstract double bonificaciones();

    public abstract double descuentos();
}
