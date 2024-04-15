import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("AE7897", "ZARA", "Comercio");
        System.out.println(empresa1);

        ArrayList<Contrato> contratos = new ArrayList<Contrato>();

        Persona empleado1 = new Persona("5151546H", "Joel");
        Contrato contrato1 = new Contrato(1234567, LocalDate.now(), LocalDate.of(2025, 10, 7));
        empleado1.afegirContractes(contrato1);
        Contrato contrato2 = new Contrato(777777, LocalDate.now(), LocalDate.of(2026, 10, 7));
        empleado1.afegirContractes(contrato2);
        System.out.println(empleado1);





        //Calcula la diferencia en AÑOS (YEARS) entre dos fechas, si no pasa el año nos nuestra CERO,
        //Aunque haya pasado meses entre ellos. Para el caso entre meses sería MONTH.between.
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2025, 02, 02)));
    }
}