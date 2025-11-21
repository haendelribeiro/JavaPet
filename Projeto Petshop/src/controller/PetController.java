package controller;
import model.Pet;
import service.PetService;
import java.util.List;

public class PetController {
    private PetService petService = new PetService();

    public void cadastrarPet(Pet p) {
        petService.cadastrarPet(p);
    }

    public List<Pet> listar() {
        return petService.listarPets();
    }
}
