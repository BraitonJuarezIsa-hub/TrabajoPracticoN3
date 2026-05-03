package Punto3;

class CriptoMoneda extends PasarelaPago {
    public CriptoMoneda() {
        super("Blockchain (BTC/ETH)");
    }

    @Override
    public boolean validarConexion() {
        IO.println("[Validacion] Sincronizando con el nodo y verificando hash...");
        return true;
    }

    @Override
    public void procesarPago(double monto) {
        mostrarCabecera();
        if (validarConexion());
        IO.println("Transaccion de $" + monto + " confirmada en la Blockchain.");
    }
}
