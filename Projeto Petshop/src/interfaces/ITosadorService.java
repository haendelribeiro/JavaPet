package interfaces;
import model.Pet;
import model.Tosador;

import java.util.List;


public interface ITosadorService {
    //CRUD do tosador
    void cadastrarTosador(Tosador tosador);
    List<Tosador> listarTosadores();
    void atualizarTosador(String nomeAntigo, String nomeNovo);
    void deletarTosador(String nomeAntigo);

    void realizarTosa(Pet p);
}
