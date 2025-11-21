package controller;

import interfaces.ITosadorService;
import model.Pet;
import model.Tosador;
import service.TosadorService;

import java.util.List;

public class TosadorController {
    private ITosadorService service = new ITosadorService();

    public void cadastrar(Tosador t) {
        service.cadastrarTosador(t);
    }

    public List<Tosador> listarTodos() {
        return service.listarTosadores();
    }

    public void atualizar(String antigo, String novo) {
        service.atualizarTosador(antigo, novo);
    }

    public void deletar(String nome) {
        service.deletarTosador(nome);
    }

    public void realizarTosa (Pet p) {
        service.realizarTosa(p);
    }
}
