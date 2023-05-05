import java.util.Scanner;

public class Bilhete {
    private int numero;
    private String assento;
    private Passageiro passageiro;
    private Horario horario;
    private SituacaoBilhete situacao;

    public Bilhete() {
    }

    public Bilhete(int numero, String assento, Passageiro passageiro, Horario horario, SituacaoBilhete situacao) {
        this.numero = numero;
        this.assento = assento;
        this.passageiro = passageiro;
        this.horario = horario;
        this.situacao = situacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public SituacaoBilhete getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoBilhete situacao) {
        this.situacao = situacao;
    }

    public void reservar(Passageiro passageiro) {

    }

    public void comprar() {

    }

    public void cancelarReserva() {

    }

    public void checkin(Bagagem bagagem) {

    }
}
