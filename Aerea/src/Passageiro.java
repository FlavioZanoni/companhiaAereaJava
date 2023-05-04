public class Passageiro extends Pessoa {
    private int codigo;
    private String passaporte;

    public Passageiro() {
    }

    public Passageiro(int codigo, String passaporte) {
        this.codigo = codigo;
        this.passaporte = passaporte;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
