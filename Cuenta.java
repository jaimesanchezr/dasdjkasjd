import java.time.LocalDateTime;
import java.util.List;

public class Cuenta extends Cliente implements IOperaciones {
    private String id;
    private static int cantCuentas = 0;
    private int movMant = 0;
    private int movInteres = 0;
    private List<Movimientos> historialMovimientos;

    public Cuenta(String nombre, String apellido, String fechaNacimiento, String estatusLaboral, String cedula, ClasificadorRiesgo clasificacionRiesgo, List<Cuenta> cuentas, String id, int movMant, int movInteres, List<Movimientos> historialMovimientos, double balance, TipoCuenta tipoCuenta) {
        super(nombre, apellido, fechaNacimiento, estatusLaboral, cedula, clasificacionRiesgo, cuentas);
        this.id = id;
        this.movMant = movMant;
        this.movInteres = movInteres;
        this.historialMovimientos = historialMovimientos;
        this.balance = balance;
        this.tipoCuenta = tipoCuenta;
    }

    public int getMovMant() {
        return movMant;
    }

    public void setMovMant(int movMant) {
        this.movMant = movMant;
    }

    public int getMovInteres() {
        return movInteres;
    }

    public void setMovInteres(int movInteres) {
        this.movInteres = movInteres;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    private double balance;

    public Cuenta() {
    }

    public Cuenta(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    private TipoCuenta tipoCuenta;


    @Override
    public boolean retirar(Cuenta cuenta, double monto) throws SinFondosException{
        try{
            if(this.balance < monto){
                historialMovimientos.add(new Movimientos(LocalDateTime.now(), "Retiro", "Sin fondos"));
                throw new SinFondosException();
            }
        }
        catch (SinFondosException e){
            System.out.println("Usted no tiene fondos en la cuenta");
            return false;
        }
        this.balance -=monto;
        movMant++;
        movInteres++;
        historialMovimientos.add(new Movimientos(LocalDateTime.now(), "Retiro", "Aprobado"));
        return true;
    }

    //Deposito
    @Override
    public boolean depositar(Cuenta cuenta, double monto) throws ValorNegativoException{
        try{
            if(monto<0){
                historialMovimientos.add(new Movimientos(LocalDateTime.now(), "Deposito", "Monto inválido"));
                throw new ValorNegativoException();
            }
        }
        catch(ValorNegativoException e){
            System.out.println("No puede ingresar valores negativos");
            return false;
        }

        this.balance +=monto;
        movMant++;
        movInteres++;
        historialMovimientos.add(new Movimientos(LocalDateTime.now(), "Deposito", "Aprobado"));
        return true;
    }

    @Override
    public double consultarSaldo() {
        return 0;
    }

    @Override
    public boolean transferir(Cuenta cuentaDestino, Cuenta cuentaOrigen, double monto) {
        return false;
    }

    @Override
    public boolean calcularTasaMant(Cuenta cuenta) {
        if(cuenta.getMovMant() == 6){
        double r = 0;
        r = getBalance() * Tasas.AHORRO.getVal();
        setBalance(getBalance() - r);
        //Reinicia la variable
        cuenta.setMovMant(0);
        return true;
    }
    else{
        return false;

    }
    }

    @Override
    public boolean calcularInteres(Cuenta cuenta) {
        return false;
    }
}