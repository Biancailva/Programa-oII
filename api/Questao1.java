package api;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Beatriz");

        //pega o nome pelo indice q vai se iniciar a contagem em 0
        String nomeIndice = nomes.get(1);
        System.out.println(nomeIndice);


       

        System.out.println("Lista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

