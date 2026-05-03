package Punto3;

import java.util.ArrayList;

public class Main {
    void main() {
        ArrayList<PasarelaPago> historialPagos = new ArrayList<>();

        historialPagos.add (new TarjetaCredito());
        historialPagos.add (new PayPal());
        historialPagos.add  (new CriptoMoneda());

        IO.println("=== Procesamiento Unificado de Pagos ===");

        for (PasarelaPago pago : historialPagos) {
            pago.procesarPago(250.0);
        }
    }
}
