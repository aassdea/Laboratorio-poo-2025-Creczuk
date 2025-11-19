package tpVehiculo;

public class Auto extends Vehiculo {

    private int cantidadPuertas;
    private String tipoCombustible;

    public Auto(String marca, String modelo, int velocidadMaxima,
                int cantidadPuertas, String tipoCombustible) {

        super(marca, modelo, velocidadMaxima);
        this.cantidadPuertas = cantidadPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    
    public int getCantidadPuertas() { return cantidadPuertas; }
    public void setCantidadPuertas(int cantidadPuertas) { this.cantidadPuertas = cantidadPuertas; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    
    public double calcularAutonomia(double litrosCombustible, double consumoPorKm) {
        return litrosCombustible * consumoPorKm;
    }

    
    @Override
    public void mover() {
        System.out.println("El auto se mueve por la carretera con estabilidad.");
    }
}