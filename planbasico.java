package modelo_evaluacion;

public class planbasico extends plan {

    public planbasico(String codigo, intensidad intensidad, double costoBase) {
        super(codigo, intensidad, costoBase);
    }

    @Override
    public double calcularCostoFinal() {
        return getCostoBase();
    }
}