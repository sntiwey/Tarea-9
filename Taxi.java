import java.awt.*;

public class Taxi extends Automovil{
    private int taximetro;
    private String conductor;
    private String app;
    private String permiso;

    public Taxi() {
    }

    public Taxi(int taximetro, String conductor, String app, String permiso) {
        this.taximetro = taximetro;
        this.conductor = conductor;
        this.app = app;
        this.permiso = permiso;
    }

    public Taxi(String duenio, String placas, int llantas, int puertas, int taximetro, String conductor, String app, String permiso) {
        super(duenio, placas, llantas, puertas);
        this.taximetro = taximetro;
        this.conductor = conductor;
        this.app = app;
        this.permiso = permiso;
    }

    public Taxi(int anio, String marca, int velocidadMax, Color color, String modelo, String duenio, String placas, int llantas, int puertas, int taximetro, String conductor, String app, String permiso) {
        super(anio, marca, velocidadMax, color, modelo, duenio, placas, llantas, puertas);
        this.taximetro = taximetro;
        this.conductor = conductor;
        this.app = app;
        this.permiso = permiso;
    }

    public int getTaximetro() {
        return taximetro;
    }

    public void setTaximetro(int taximetro) {
        this.taximetro = taximetro;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "taximetro=" + taximetro +
                ", conductor='" + conductor + '\'' +
                ", app='" + app + '\'' +
                ", permiso='" + permiso + '\'' +
                ", duenio='" + duenio + '\'' +
                ", placas='" + placas + '\'' +
                ", llantas=" + llantas +
                ", puertas=" + puertas +
                ", anio=" + anio +
                ", marca='" + marca + '\'' +
                ", velocidadMax=" + velocidadMax +
                ", color=" + color +
                ", modelo='" + modelo + '\'' +
                '}';
    }
    public void trabajar(){
        System.out.println("El conductor llamado " + conductor + " tiene el taximetro ordinario " + taximetro + " con placas" + placas);
    }
    public void aplicacion(){
        System.out.println("El conductor llamado " + conductor + " se paso a la aplicacion " + app + " y sigue con sus placas" + placas);
    }
}
