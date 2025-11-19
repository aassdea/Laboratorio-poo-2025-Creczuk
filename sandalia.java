package tpRepaso2;

class sandalia extends calzado {
    public sandalia(int id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }

    @Override
    public double getPrecioVenta() {
        return precioBase;
    }
}