package model;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    // Construtor vazio
    public Cliente() {
    }

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido.");
        if (cpf == null || cpf.isBlank()) throw new IllegalArgumentException("CPF inválido.");
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // getters / setters
    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido.");
        this.nome = nome;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) throw new IllegalArgumentException("CPF inválido.");
        this.cpf = cpf;
    }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}