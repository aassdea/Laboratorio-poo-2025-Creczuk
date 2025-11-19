package tpVehiculo;

public class Camion extends Vehiculo {

    private double capacidadCarga; 
    private int cantidadEjes;

    public Camion(String marca, String modelo, int velocidadMaxima,
                  double capacidadCarga, int cantidadEjes) {

        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
    }

    public double getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    public int getCantidadEjes() { return cantidadEjes; }
    public void setCantidadEjes(int cantidadEjes) { this.cantidadEjes = cantidadEjes; }

    public double calcularPesoTotal() {
        return capacidadCarga * cantidadEjes;
    }

    @Override
    public void mover() {
        System.out.println("El camión avanza pesado por la ruta transportando carga.");
    }
}