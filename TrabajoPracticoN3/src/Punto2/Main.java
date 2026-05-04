package Punto2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Suscripcion> listaSuscripciones = new ArrayList<>();

        listaSuscripciones.add(new PlanBasico("nicoaramburu@gmail.com", 01, 1500.0));
        listaSuscripciones.add(new PlanFamiliar("familiafalconciro@gmail.com", 02, 3600.0, 3));
        listaSuscripciones.add(new PlanPremium("arnedojorge@gmail.com", 03, 2500.0));

        double ingresosTotales = 0;

        System.out.println("Reporte de Facturacion Mensual:");

        for (Suscripcion s : listaSuscripciones){
            double costo = s.calcularCostoMensual();
            s.mostrarDatos();

            System.out.println("Costo Mensual: $" + costo);
            ingresosTotales += costo;
        }

        System.out.println("----------------------------------------");
        System.out.println("Ingresos Totales: $" + ingresosTotales);
        System.out.println("----------------------------------------");;
    }
}
