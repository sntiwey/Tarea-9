import java.awt.*;

public class Automovil extends Vehiculo{

    protected String duenio;
    protected String placas;
    protected int llantas;
    protected int  puertas;

    public Automovil() {
    }

    public Automovil(String duenio, String placas, int llantas, int puertas) {
        this.duenio = duenio;
        this.placas = placas;
        this.llantas = llantas;
        this.puertas = puertas;
    }

    public Automovil(int anio, String marca, int velocidadMax, Color color, String modelo, String duenio, String placas, int llantas, int puertas) {
        super(anio, marca, velocidadMax, color, modelo);
        this.duenio = duenio;
        this.placas = placas;
        this.llantas = llantas;
        this.puertas = puertas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "duenio='" + duenio + '\'' +
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
    public void especificar(){
        System.out.println("El dueño de esta auto es " + duenio + " y tiene las placas de carro marca y modelo " + placas + " " + marca +  " " + modelo);
    }
    public void rodar(){
        System.out.println("Este vehiculo de marca " + marca + " tiene " + puertas + " puertas y " + llantas + " llantas...");
    }
}
