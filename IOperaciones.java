import java.util.Date;

public interface IOperaciones <T extends Cuenta>{
    //Los métodos de retirar, depositar y transferencia entre cuentas, deben de devolver true o false, si la operación se realizó o no.
    boolean retirar(T Cuenta, double monto) throws SinFondosException;
    boolean depositar(T Cuenta, double monto) throws ValorNegativoException;
    double consultarSaldo();
    boolean transferir(T cuentaDestino, T cuentaOrigen, double monto);
    boolean calcularTasaMant(T cuenta);
    boolean calcularInteres (T cuenta);

    class ValorNegativoException extends Exception {
    }

    class SinFondosException extends Exception {
    }
    //List<Movimiento> obtenerHistorialMovimientosPorFecha(Date fecha);
    //List<Movimiento> obtenerHistorialMovimientosPorDescripcion(String descripcion);
}