package service;

import interfaces.ITosadorService;
import model.Tosador;
import model.Pet;
import java.util.ArrayList;
import java.util.List;

public class TosadorService implements ITosadorService {
    private final List<Tosador> bancoDeTosadores = new ArrayList<>();

    // Cadastrar (Create)
    @Override
    public void cadastrarTosador(Tosador tosador) {
        bancoDeTosadores.add(tosador);
        System.out.println("Tosador "+ tosador.getNome() + " cadastrado com sucesso!");
    }

    //listar (read)
    @Override
    public List<Tosador> listarTosadores() {
        return bancoDeTosadores;
    }

    //atualizar (Update)
    @Override
    public void atualizarTosador(String nomeAntigo, String nomeNovo) {
        for (Tosador t : bancoDeTosadores) {
            if (t.getNome().equalsIgnoreCase(nomeAntigo)) {
                t.setNome(nomeNovo);
                System.out.println("Tosador atualizado para: " + nomeNovo);
            }
        }
        System.out.println("Tosador não encontrado para atualizar.");
    }

    //deletar (delete)
    @Override
    public void deletarTosador(String nome) {
        boolean removeu = bancoDeTosadores.removeIf(t -> t.getNome().equalsIgnoreCase(nome));

        if (removeu) {
            System.out.println("Tosador " + nome + " removido com sucesso!");
        } else {
            System.out.println("Tosador não encontrado para remoção.");
        }
    }

    @Override
    public void realizarTosa(Pet p) {
        System.out.println("Tosador está realizando a tosa no pet: " + p.getNome());

    }
}
