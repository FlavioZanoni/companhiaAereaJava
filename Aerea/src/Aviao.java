public class Aviao {
    private int codigo;
    private double carga;
    private int quantidadeEconomica;
    private int quantidadeExecutiva;
    private int quantidadePrimeira;

    public Aviao() {
    }

    public Aviao(int codigo, double carga, int quantidadeEconomica, int quantidadeExecutiva, int quantidadePrimeira) {
        this.codigo = codigo;
        this.carga = carga;
        this.quantidadeEconomica = quantidadeEconomica;
        this.quantidadeExecutiva = quantidadeExecutiva;
        this.quantidadePrimeira = quantidadePrimeira;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public int getQuantidadeEconomica() {
        return quantidadeEconomica;
    }

    public void setQuantidadeEconomica(int quantidadeEconomica) {
        this.quantidadeEconomica = quantidadeEconomica;
    }

    public int getQuantidadeExecutiva() {
        return quantidadeExecutiva;
    }

    public void setQuantidadeExecutiva(int quantidadeExecutiva) {
        this.quantidadeExecutiva = quantidadeExecutiva;
    }

    public int getQuantidadePrimeira() {
        return quantidadePrimeira;
    }

    public void setQuantidadePrimeira(int quantidadePrimeira) {
        this.quantidadePrimeira = quantidadePrimeira;
    }
}
