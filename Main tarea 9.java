import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Vehiculo

        Vehiculo vei = new Vehiculo(2023, "Mercedes", 280, Color.WHITE , "AMG Claaaaaaaaase G63 lo que un dia soñe, todo ya me lo compre...");
        System.out.println(vei);
        vei.arrancar();
        vei.carretera();
        vei.apagar();
        System.out.println("");

        //Automovil

        Automovil auto = new Automovil(2020, "Audi", 300, Color.black, "R8", "Camila", "113SCS", 4, 4);
        System.out.println(auto);
        auto.especificar();
        auto.rodar();
        System.out.println("");

        //Taxi

        Taxi taxxi = new Taxi(1997, "VolgsWagen", 150, Color.pink, "Tsuru", "Canelo", "AQI098", 4, 4, 8, "Gustavo", "UBER", "Si");
        System.out.println(taxxi);
        taxxi.trabajar();
        taxxi.aplicacion();
    }
}