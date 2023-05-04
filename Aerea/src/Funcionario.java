public class Funcionario extends Pessoa {
    private int codigo;
    private String contaCorrente;

    public Funcionario() {
    }

    public Funcionario(int codigo, String contaCorrente) {
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
