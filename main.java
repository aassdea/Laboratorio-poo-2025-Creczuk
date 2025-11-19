package tpRepaso2;

public class main {
    public static void main(String[] args) {
        empresa empresa = new empresa();

        sucursal s1 = new sucursal("Centro", 50000);
        s1.agregarCalzado(new borcego(1, 42, 14000));
        s1.agregarCalzado(new sandalia(2, 37, 18000));
        s1.agregarCalzado(new tacoLuisXV(3, 38, 25000, true));

        sucursal s2 = new sucursal("Palermo", 70000);
        s2.agregarCalzado(new taco(4, 39, 16000));
        s2.agregarCalzado(new borcego(5, 39, 20000));
        s2.agregarCalzado(new tacoLuisXV(6, 36, 30000, false));

        empresa.agregarSucursal(s1);
        empresa.agregarSucursal(s2);

        System.out.println("Capital total: $" + empresa.capitalTotal());
        System.out.println("Locales refinados: " + empresa.localesRefinados());
        System.out.println("Calzados en liquidación: " + empresa.calzadosEnLiquidacion().size());
    }
}