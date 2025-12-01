package modelo_evaluacion;

public class main {
    public static void Main(String[] args) {

        planbasico bas1 = new planbasico("B1", intensidad.BAJA, 15000);
        planpremium prem1 = new planpremium("P1", intensidad.ALTA, 25000);
        planpersonalizado per1 = new planpersonalizado("PE1", intensidad.MEDIA, 30000, true);

        gimnasio gym1 = new gimnasio("PowerFit", 20000);
        gym1.agregarPlan(bas1);
        gym1.agregarPlan(prem1);
        gym1.agregarPlan(per1);

        System.out.println("--------------");
        System.out.println("Gimnasio: " + gym1.getNombre());
        System.out.println("Suma costos: $" + gym1.sumaCostoPlanes());
        System.out.println("Capital neto: $" + gym1.capitalNeto());
        System.out.println("Es elite? " + (gym1.esElite() ? "SI" : "NO"));
        System.out.println("--------------");
    }
}