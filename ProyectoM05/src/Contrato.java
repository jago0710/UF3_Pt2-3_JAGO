import java.time.LocalDate;
import java.util.ArrayList;

public class Contrato {

    private int codigoContrato;
    private LocalDate inicioContrato;
    private LocalDate finContrato;

    public int getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public LocalDate getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(LocalDate inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public LocalDate getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(LocalDate finContrato) {
        this.finContrato = finContrato;
    }

    public Contrato(int codigoContrato, LocalDate inicioContrato, LocalDate finContrato){
        this.codigoContrato = codigoContrato;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }


    @Override
    public String toString() {
        return "Contrato (" +
                "codigoContrato = " + codigoContrato +
                ", inicioContrato = " + inicioContrato +
                ", finContrato = " + finContrato +
                ")" + '\n';
    }
}
