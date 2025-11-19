package model;

public class Pet {
    private String nome;
    private int idade;
    private String especie;
    private String vacina;
    private String hsaude;
    private Cliente dono;  //vai ser minha chave FK como a professora explicar

    public Pet() {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.hsaude = hsaude;
        this.vacina = vacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getHsaude() {
        return hsaude;
    }

    public void setHsaude(String hsaude) {
        this.hsaude = hsaude;
    }

    public Cliente getDono() { // se eu desse getdono em um print iria mostrar o nome do dono
        return dono;
    }
    public void setDono(Cliente dono) { //aqui ele define o nome do dono
        this.dono = dono;
    }
}