import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        // produto (key) --> quantidade (value)
        Map<String, Integer> mapaProdutos = new HashMap<>();
        mapaProdutos.put("placa de video", 5);
        mapaProdutos.put("processador", 10);
        mapaProdutos.put("memoria RAM", 3);
        mapaProdutos.put("HD SSD", 5);


        Scanner input = new Scanner(System.in);
        System.out.println("Digite um produto para pesquisar no estoque: ");
        String termoDeBusca = input.nextLine();

        if (mapaProdutos.containsKey(termoDeBusca)) {
            System.out.println("Produto encontrado: " + termoDeBusca + " qtd: " + mapaProdutos.get(termoDeBusca));
        }
        else {
            System.out.println("Produto não encontrado!");
        }

    }
}
