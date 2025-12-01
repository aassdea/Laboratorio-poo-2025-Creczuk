package modelo_evaluacion;

import java.util.ArrayList;

public class gimnasio {

    private String nombre;
    private double costoMantenimiento;
    private ArrayList<plan> planes;

    public gimnasio(String nombre, double costoMantenimiento) {
        this.nombre = nombre;
        this.costoMantenimiento = costoMantenimiento;
        this.planes = new ArrayList<>();
    }

    public void agregarPlan(plan p) {
        planes.add(p);
    }

    public double sumaCostoPlanes() {
        double suma = 0;
        for (plan p : planes) {
            suma += p.calcularCostoFinal();
        }
        return suma;
    }

    public double capitalNeto() {
        return sumaCostoPlanes() - costoMantenimiento;
    }

    public boolean esElite() {
        for (plan p : planes) {
            if (p.estaEnPromocion()) return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }
}