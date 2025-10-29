package api;

import java.util.HashMap;
import java.util.Map;

public class Questao7 {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Notebook", 15);
        estoque.put("Mouse", 50);
        estoque.put("Teclado", 30);
        estoque.put("Monitor", 20);
        estoque.put("Headset", 25);

        System.out.println("Estoque de produtos:");
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
    }
}
