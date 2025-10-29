package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Questao3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Adicionando 10 números aleatórios
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100));
        }

        System.out.println("Lista original: " + numeros);

        // Ordem crescente
        Collections.sort(numeros);
        System.out.println("Ordem crescente: " + numeros);

        // Ordem decrescente
        Collections.reverse(numeros);
        System.out.println("Ordem decrescente: " + numeros);
    }
}
