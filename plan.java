package modelo_evaluacion;

public abstract class plan {
    private String codigo;
    private intensidad intensidad;
    private double costoBase;

    public plan(String codigo, intensidad intensidad, double costoBase) {
        this.codigo = codigo;
        this.intensidad = intensidad;
        this.costoBase = costoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public intensidad getIntensidad() {
        return intensidad;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public abstract double calcularCostoFinal();

    public boolean estaEnPromocion() {
        return costoBase < 20000;
    }
}