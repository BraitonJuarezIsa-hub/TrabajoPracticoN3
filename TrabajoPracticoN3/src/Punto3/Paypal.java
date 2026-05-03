package Punto3;

class PayPal extends PasarelaPago {
    public PayPal() {
        super("PayPal");
    }

    @Override
    public boolean validarConexion() {
        IO.println("[Validacion] Verificando correo y contraseña del usuario...");
        return true;
    }

    @Override
    public void procesarPago(double monto) {
        mostrarCabecera();
        if (validarConexion());
        IO.println("Pago de $" + monto + " aprobado por PayPal.");
    }
}