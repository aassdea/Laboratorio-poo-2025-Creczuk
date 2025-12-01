package modelo_evaluacion;

public class planpremium extends plan {

    public planpremium(String codigo, intensidad intensidad, double costoBase) {
        super(codigo, intensidad, costoBase);
    }

    @Override
    public double calcularCostoFinal() {
        return getCostoBase() * 1.40;
    }

    @Override
    public boolean estaEnPromocion() {
        return super.estaEnPromocion() || getIntensidad() == intensidad.ALTA;
    }
}