package tpRepaso2;

import java.util.ArrayList;

public class empresa {
    private ArrayList<sucursal> sucursales = new ArrayList<>();

    public void agregarSucursal(sucursal s) {
        sucursales.add(s);
    }

    public double capitalTotal() {
        double total = 0;
        for (sucursal s : sucursales) {
            total += s.calcularCapital();
        }
        return total;
    }

    public ArrayList<calzado> calzadosEnLiquidacion() {
        ArrayList<calzado> lista = new ArrayList<>();
        for (sucursal s : sucursales) {
            for (calzado c : s.getCalzados()) {
                if (c.getPrecioBase() < 15000 || 
                   (c instanceof borcego && c.getTalle() >= 40)) {
                    lista.add(c);
                }
            }
        }
        return lista;
    }

    public int localesRefinados() {
        int count = 0;
        for (sucursal s : sucursales) {
            if (s.esRefinada()) {
                count++;
            }
        }
        return count;
    }
}