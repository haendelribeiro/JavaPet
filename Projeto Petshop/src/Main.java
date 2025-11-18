import java.util.Scanner;
import model.Pet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Pet p = new Pet();

        //CADASTRO DO PET
        System.out.println("Qual o nome do Pet?");
        p.setNome (sc.next() );
        System.out.println("Qual a Idade do Pet?");
        p.setIdade (sc.nextInt());
        System.out.println("Qual a espécie do Pet?");
        p.setEspecie (sc.next() );
        System.out.println("Qual o historico de saude do pet? informe caso haja");
        p.setHsaude (sc.next() );
        System.out.println("Informe as vacinas tomadas, caso não haja, informe ao sistema");
        p.setVacina (sc.next() );

        //teste pet
        System.out.println(p.getNome());
    }
}