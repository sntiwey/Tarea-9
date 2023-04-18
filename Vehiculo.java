import java.awt.*;

    public class Vehiculo {
    protected int anio;
    protected String marca;
    protected int velocidadMax;
    protected Color color;
    protected String modelo;

        public Vehiculo() {
        }

        public Vehiculo(int anio, String marca, int velocidadMax, Color color, String modelo) {
            this.anio = anio;
            this.marca = marca;
            this.velocidadMax = velocidadMax;
            this.color = color;
            this.modelo = modelo;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getVelocidadMax() {
            return velocidadMax;
        }

        public void setVelocidadMax(int velocidadMax) {
            this.velocidadMax = velocidadMax;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "Vehiculo{" +
                    "anio=" + anio +
                    ", marca='" + marca + '\'' +
                    ", velocidadMax=" + velocidadMax +
                    ", color=" + color +
                    ", modelo='" + modelo + '\'' +
                    '}';
        }
        public void arrancar(){
            System.out.println("Este carro merca " + marca + " de color " + color + " esta arracando y su limite es de " + velocidadMax);
        }
        public  void carretera(){
            System.out.println("El carro de color " + color + " esta en su velocidad maxima que es: " + velocidadMax);
        }
        public void apagar(){
            System.out.println("El carro de moledo " + modelo + " de velicidad maxima " + velocidadMax + " se esta apagando...");
        }
    }
