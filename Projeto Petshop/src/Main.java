import java.util.Scanner;
import controller.PetController;
import controller.TosadorController;
import model.Cliente;
import model.Pet;
import model.Tosador;

public class Main {
    public static void main(String[] args) {

        //criação das variaveis

        Scanner sc = new Scanner(System.in); //parece o input do python
        PetController controller = new PetController();
        Pet p = new Pet();
        Cliente c = new Cliente();

        //fim da criação das variaveis

        //inicio cadastro do pet
        System.out.println("--- SISTEMA JAVAA PET ---");

        System.out.println("Qual o nome do pet?");
        p.setNome(sc.nextLine());
        System.out.println("Qual a idade do Pet?");
        p.setIdade(sc.nextInt());

        c.setNome("João");
        p.setDono(c);

        controller.cadastrarPet(p); //cadastra meu bicnho e imprime

        System.out.println("--- LISTA DE PETS CADASTRADOS ---");
        for (Pet  petCadastrado : controller.listar()) {
            System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nDono: " + p.getDono().getNome());
        }
        System.out.println("\n--- Corte rapido Tramontina---");

        TosadorController Tosando = new TosadorController();

        Tosador t1 = new Tosador();
        t1.setNome("Eduardo mãos de tesouras");

        Tosando.cadastrar(t1);

        Tosando.realizarTosa(p);
        //fim do cadastro do pet


    }
}