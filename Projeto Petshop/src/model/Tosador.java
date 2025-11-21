package model;

public class Tosador{
    public void realizarTosa(Pet animal) {
        System.out.println("--------------------");

        System.out.println("INICIANDO O PROCEDIMENTO DE TOSA . . . .");
        System.out.println("Tosando o Pet: " + animal.getNome());
        System.out.println("Especie: " + animal.getEspecie());
        System.out.println("--------------------");
    }


}
