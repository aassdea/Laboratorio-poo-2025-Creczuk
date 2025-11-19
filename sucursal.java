package tpRepaso2;

import java.util.ArrayList;

public class sucursal {
    private String nombre;
    private double alquilerMensual;
    private ArrayList<calzado> calzados = new ArrayList<>();

    public sucursal(String nombre, double alquilerMensual) {
        this.nombre = nombre;
        this.alquilerMensual = alquilerMensual;
    }

    public void agregarCalzado(calzado c) {
        calzados.add(c);
    }

    public ArrayList<calzado> getCalzados() {
        return calzados;
    }

    public double calcularCapital() {
        double total = 0;
        for (calzado c : calzados) {
            total += c.getPrecioVenta();
        }
        return total - alquilerMensual;
    }

    public boolean esRefinada() {
        for (calzado c : calzados) {
            if (c.getPrecioBase() < 15000) {
                return false;
            }
        }
        return true;
    }
}