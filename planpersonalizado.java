package modelo_evaluacion;

public class planpersonalizado extends plan {

    private boolean incluyeNutricion;

    public planpersonalizado(String codigo, intensidad intensidad, double costoBase, boolean incluyeNutricion) {
        super(codigo, intensidad, costoBase);
        this.incluyeNutricion = incluyeNutricion;
    }

    @Override
    public double calcularCostoFinal() {
        double total = getCostoBase() * 1.60;
        if (incluyeNutricion) total += getCostoBase() * 0.20;
        return total;
    }

    public boolean isIncluyeNutricion() {
        return incluyeNutricion;
    }
}