package Punto2;

class PlanPremium extends Suscripcion {
    private final double cargo4K = 500.0;

    public PlanPremium(String email, int nroCliente, double costoBase) {
        super(email, nroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + cargo4K;
    }
}