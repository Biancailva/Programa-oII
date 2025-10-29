package api;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Dividindo a frase em palavras
        String[] palavras = frase.split("\\s+");

        // Armazenando palavras únicas em um Set
        Set<String> palavrasUnicas = new HashSet<>();
        for (String palavra : palavras) {
            palavrasUnicas.add(palavra.toLowerCase().replaceAll("[^a-zA-Z]", ""));
        }

        System.out.println("Palavras únicas na frase:");
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }

        scanner.close();
    }
}

