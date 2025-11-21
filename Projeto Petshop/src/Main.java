import java.util.Scanner;
import controller.PetController;
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

        System.out.println("--- SISTEMA JAVAA PET ---");

        System.out.println("Qual o nome do pet?");
        p.setNome(sc.nextLine());
        System.out.println("Qual a idade do Pet?");
        p.setIdade(sc.nextInt());

        c.setNome("João");
        p.setDono(c);

        controller.cadastrarPet(p);
        System.out.println("--- LISTA DE PETS CADASTRADOS ---");
        for (Pet  petCadastrado : controller.listar()) {
            System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nDono: " + p.getDono().getNome());
        }


    }
}