import java.util.List;

public class CuentaAhorro extends Cuenta implements IOperaciones{
    public CuentaAhorro(String nombre, String apellido, String fechaNacimiento, String estatusLaboral, String cedula, ClasificadorRiesgo clasificacionRiesgo, List<Cuenta> cuentas, String id, int movMant, int movInteres, List<Movimientos> historialMovimientos, double balance, TipoCuenta tipoCuenta) {
        super(nombre, apellido, fechaNacimiento, estatusLaboral, cedula, clasificacionRiesgo, cuentas, id, movMant, movInteres, historialMovimientos, balance, tipoCuenta);
    }


}
