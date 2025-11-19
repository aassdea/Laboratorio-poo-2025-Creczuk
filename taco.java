package tpRepaso2;

class taco extends calzado {
    public taco(int id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }

    @Override
    public double getPrecioVenta() {
        return precioBase * 1.3;
    }
}