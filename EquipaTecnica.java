import java.time.LocalDate;

public class EquipaTecnica {

    // INFO PESSOAL
    private String nome;
    private LocalDate dataNascimento;

    // INFO CLUBE
    private String cargo;

    public static void main(String[] args) {
 
    }

    public EquipaTecnica(String nome, LocalDate dataNascimento, String cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
    }

    public EquipaTecnica() {
        this.nome = "";
        this.dataNascimento = LocalDate.of(1, 1, 1);;
        this.cargo = "";
    }

    public EquipaTecnica(String nome) {
        this.nome = "";
    }

    public EquipaTecnica(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "EquipaTecnica [nome=" + nome + ", dataNascimento=" + dataNascimento
                + ", cargo=" + cargo + "]";
    }
}