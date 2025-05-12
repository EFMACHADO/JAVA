import java.time.LocalDate;

public class Jogador {

    // INFO PESSOAL
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private String nacionalidade;

    // INFO FISICA
    private int altura;
    private int peso;

    // INFO CLUBE
    private String posicao;
    private String escalao;
    private int numeroCamisola;

    // INFO ECEONOMICA
    private String valorMercado;
    private String clausulaRescisao;
    private LocalDate fimContrato;

    public static void main(String[] args) {
        
    }

    public Jogador(String nome, String apelido, LocalDate dataNascimento, String nacionalidade, int altura, int peso,
            String posicao, String escalao, int numeroCamisola, String valorMercado, String clausulaRescisao,
            LocalDate fimContrato) {
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.escalao = escalao;
        this.numeroCamisola = numeroCamisola;
        this.valorMercado = valorMercado;
        this.clausulaRescisao = clausulaRescisao;
        this.fimContrato = fimContrato;
    }

    public Jogador() {
        this.nome = "";
        this.apelido = "";
        this.dataNascimento = LocalDate.of(1, 1, 1);
        this.nacionalidade = "";
        this.altura = 0;
        this.peso = 0;
        this.posicao = "";
        this.escalao = "";
        this.numeroCamisola = 0;
        this.valorMercado = "";
        this.clausulaRescisao = "";
        this.fimContrato = LocalDate.of(1, 1, 1);
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento
                + ", nacionalidade=" + nacionalidade + ", altura=" + altura + ", peso=" + peso + ", posicao=" + posicao
                + ", escalao=" + escalao + ", numeroCamisola=" + numeroCamisola + ", valorMercado=" + valorMercado
                + ", clausulaRescisao=" + clausulaRescisao + ", fimContrato=" + fimContrato + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getEscalao() {
        return escalao;
    }

    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    public int getNumeroCamisola() {
        return numeroCamisola;
    }

    public void setNumeroCamisola(int numeroCamisola) {
        this.numeroCamisola = numeroCamisola;
    }

    public String getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(String valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getClausulaRescisao() {
        return clausulaRescisao;
    }

    public void setClausulaRescisao(String clausulaRescisao) {
        this.clausulaRescisao = clausulaRescisao;
    }

    public LocalDate getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(LocalDate fimContrato) {
        this.fimContrato = fimContrato;
    }
}