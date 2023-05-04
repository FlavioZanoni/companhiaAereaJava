import java.util.Date;

public class Horario {
    private int codigo;
    private Date dataPartida;
    private Date dataChegada;
    private String classeVoo;

    public Horario() {
    }

    public Horario(int codigo, Date dataPartida, Date dataChegada, String classeVoo) {
        this.codigo = codigo;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.classeVoo = classeVoo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getClasseVoo() {
        return classeVoo;
    }

    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }
}
