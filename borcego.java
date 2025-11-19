package tpRepaso2;

class borcego extends calzado {
    public borcego(int id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }

    @Override
    public double getPrecioVenta() {
        return precioBase * 1.2;
    }
}