package Punto1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(){
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Furgoneta("Renault","Trafic",90.0,1100.0));
        flota.add(new Furgoneta("Peugeot","Expert",130.0,1400.0));
        flota.add(new Motocicleta("Honda","Wave",45.0,110));
        flota.add(new Motocicleta("kTM","390 Duke",90,399));

        System.out.println("");
        System.out.println("REPORTE DE FLOTA");
        System.out.println("");
        System.out.println();

        for (Vehiculo vehiculos: flota){
            vehiculos.mostrarInfo();
            System.out.println();
        }
        System.out.println("Central de Vehiculos: "+ flota.size());
    }
}
