package tpRepaso2;

class tacoLuisXV extends taco {
    private boolean importado;

    public tacoLuisXV(int id, int talle, double precioBase, boolean importado) {
        super(id, talle, precioBase);
        this.importado = importado;
    }

    @Override
    public double getPrecioVenta() {
        double precio = super.getPrecioVenta();
        if (importado) {
            precio *= 1.5;
        }
        return precio;
    }
}