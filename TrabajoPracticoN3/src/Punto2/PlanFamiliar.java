package Punto2;

class PlanFamiliar extends Suscripcion {
    private int perfilesAdicionales;
    private final double recargoPerfil = 200.0;

    public PlanFamiliar(String email, int nroCliente, double costoBase, int perfiles) {
        super(email, nroCliente, costoBase);
        this.perfilesAdicionales = perfiles;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + (perfilesAdicionales * recargoPerfil);
    }
}