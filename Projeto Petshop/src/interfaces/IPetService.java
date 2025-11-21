package interfaces;
import model.Pet;

import java.util.List;

public interface IPetService {

    //criar
    void cadastrarPet(Pet p);

    //ler
    List<Pet> listarPets();

    //atualizar
    void atualizarPet(String nomeAntigo, String nomeNovo);

    //deletar
    void deletarPet(int id);
}
