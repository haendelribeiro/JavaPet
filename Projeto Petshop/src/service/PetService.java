package service;
import interfaces.IPetService;
import model.Pet;

import java.util.ArrayList;
import java.util.List;


public class PetService implements  IPetService {
    private final List<Pet> BancoDePets = new ArrayList<>();
    private int ids = 1;

    @Override
    public void cadastrarPet(Pet p) {
        if (p.getNome() == null || p.getNome().isEmpty()) {
        System.out.println("Erro! O Pet precisa ter um nome!!!");
        return;
    }

    BancoDePets.add(p);
    System.out.println("Pet: " + p.getNome() + " Cadastrado com sucesso!!!");

    }

    @Override
    public List<Pet> listarPets() {
        return BancoDePets; // retorna a lista
    }

    @Override
    public void atualizarPet(String nomeAntigo, String nomeNovo) {
        for (Pet p : BancoDePets) {
            if (p.getNome().equalsIgnoreCase(nomeAntigo)) {
                p.setNome(nomeNovo);
                System.out.println(("Nome do pet alterado de " + nomeAntigo + " para " + nomeNovo));
                return;
            }
        }
        System.out.println("Erro! pet não encontrado!");
    }

    @Override
    public void deletarPet(String nome) {
        boolean removeu = BancoDePets.removeIf(p -> p.getNome().equalsIgnoreCase(nome));

        if (removeu) {
            System.out.print("Pet" + nome " removido com sucesso!");
        } else {
            System.out.print("Pet não encontrado para remoção.");
        }
    }
}
