public class Bilhete {
    private int numero;
    private String assento;
    private Passageiro passageiro;
    private Horario horario;
    private String situacao;

    public Bilhete() {
    }

    public Bilhete(int numero, String assento, Passageiro passageiro, Horario horario, String situacao) {
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
