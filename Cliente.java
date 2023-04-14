import java.util.List;
import java.util.ArrayList;


public class Cliente {

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstatusLaboral() {
        return estatusLaboral;
    }

    public void setEstatusLaboral(String estatusLaboral) {
        this.estatusLaboral = estatusLaboral;
    }

    public String getCedula() {
        return cedula;
    }

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String estatusLaboral;
    private String cedula;
    private ClasificadorRiesgo clasificacionRiesgo;

    public Cliente(String nombre, String apellido, String fechaNacimiento, String estatusLaboral, String cedula, ClasificadorRiesgo clasificacionRiesgo, List<Cuenta> cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estatusLaboral = estatusLaboral;
        this.cedula = cedula;
        this.clasificacionRiesgo = clasificacionRiesgo;
        this.cuentas = cuentas;
    }

    private List<Cuenta> cuentas;

}