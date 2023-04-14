public enum Tasas {
    AHORRO(1.2),
    CORRIENTE(1.35),
    PLAZO_FIJO(1.35);

    public double getVal() {
        return val;
    }

    private final double val;

    Tasas(double val) {
        this.val = val;
    }
}