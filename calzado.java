package tpRepaso2;

abstract class calzado {
 protected int id;
 protected int talle;
 protected double precioBase;

 public calzado(int id, int talle, double precioBase) {
     this.id = id;
     this.talle = talle;
     this.precioBase = precioBase;
 }

 public abstract double getPrecioVenta();

 public double getPrecioBase() { return precioBase; }
 public int getTalle() { return talle; }

 @Override
 public String toString() {
     return this.getClass().getSimpleName() + 
            " [ID=" + id + ", talle=" + talle + 
            ", base=" + precioBase + ", venta=" + getPrecioVenta() + "]";
 }
}
