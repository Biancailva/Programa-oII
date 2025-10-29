package api;

import java.util.ArrayList;
import java.util.List;

public class Questao2 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Beatriz");

        // Removendo um nome específico
        nomes.remove("Carlos");

        // Verificando se um nome está presente
        boolean existeMaria = nomes.contains("Maria");
        boolean existeCarlos = nomes.contains("Carlos");

        System.out.println("Lista após remoção: " + nomes);
        System.out.println("Maria está na lista? " + existeMaria);
        System.out.println("Carlos está na lista? " + existeCarlos);
    }
}

