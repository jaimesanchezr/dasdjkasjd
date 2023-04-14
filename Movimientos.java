import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movimientos {
    private LocalDateTime fecha;
    private String tipoMovimiento;
    private String descripcion;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Movimientos(LocalDateTime fecha, String tipoMovimiento, String descripcion) {
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
        this.descripcion = descripcion;
    }
}