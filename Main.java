package tpVehiculo;

public class Main {
    public static void main(String[] args) {

        
        Auto auto = new Auto("Toyota", "Corolla", 180, 4, "Nafta");
        Moto moto = new Moto("Honda", "Titan", 120, 150, true);
        Camion camion = new Camion("Volvo", "FH", 120, 8.0, 3);

        
        Vehiculo[] lista = { auto, moto, camion };
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        for (Vehiculo v : lista) {
            v.mover();
        }

        
        System.out.println("\n=== CONDICIONALES ===");

        if (moto.puedeLlevarAcompaniante()) {
            System.out.println("La moto puede llevar acompañante.");
        } else {
            System.out.println("La moto NO puede llevar acompañante.");
        }

        double pesoCamion = camion.calcularPesoTotal();
        double pesoAtransportar = 20.0; //
        
        System.out.println("Peso máximo permitido del camión: " + pesoCamion + " toneladas.");

        if (pesoAtransportar <= pesoCamion) {
            System.out.println("El camión puede transportar " + pesoAtransportar + " toneladas.");
        } else {
            System.out.println("El camión NO puede transportar ese peso.");
        }

        
        System.out.println("\nAutonomía del auto: " +
                auto.calcularAutonomia(40, 10) + " km");
    }
}