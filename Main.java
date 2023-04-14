import java.time.LocalDate;
import java.time.Period;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jaime", "Sanchez", "2009-02-14","Laborando", "8-954-1324", ClasificadorRiesgo.BAJA, null);
        String fecha_nac = cliente.getFechaNacimiento();
        LocalDate fecha_nac_conv = LocalDate.parse(fecha_nac);

        if(verificaEdad(fecha_nac_conv) < 18){
            System.out.println("Lo sentimos, usted no puede abrir una cuenta en Banco Flop");
            System.exit(0);
        }

    }

    public static int verificaEdad(LocalDate fecha_nac_conv){
        LocalDate ahora = LocalDate.now();
        return Period.between(fecha_nac_conv, ahora).getYears();
    }

}