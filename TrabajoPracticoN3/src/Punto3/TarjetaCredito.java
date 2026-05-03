package Punto3;

class TarjetaCredito extends PasarelaPago {
    public TarjetaCredito() {
        super("Red Bancaria Visa/Mastercard");
    }

    @Override
    public boolean validarConexion() {
        IO.println("Verificando Terminal Bancaria...");
        return true;
    }

    @Override
    public void procesarPago(double monto) {
        mostrarCabecera();
        if (validarConexion());
        IO.println("Cobro de $" + monto + " registrado en la cuenta");
    }
}
