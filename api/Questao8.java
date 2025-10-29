package api;

import java.util.HashMap;
import java.util.Map;

public class Questao8 {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Notebook", 15);
        estoque.put("Mouse", 50);
        estoque.put("Teclado", 30);
        estoque.put("Monitor", 20);
        estoque.put("Headset", 25);

        System.out.println("Estoque original: " + estoque);

        // Atualizando quantidade de um produto
        estoque.put("Mouse", 45); // Atualiza o valor existente

        // Adicionando novo produto
        estoque.put("Webcam", 10);

        // Removendo um produto
        estoque.remove("Headset");

        System.out.println("Estoque atualizado: " + estoque);
    }
}
