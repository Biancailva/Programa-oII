//Uma loja vende 5 produtos em 4 semanas. As vendas devem ser armazenadas em uma
//matriz 5x4, onde cada linha representa um produto e cada coluna uma semana. Crie funções
//para calcular: (a) total de vendas por produto, (b) total de vendas por semana, (c) o produto
//mais vendido no período. O programa deve exibir relatórios que auxiliem a gestão da loja.
import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        int vendas[][] = new int[5][4];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < vendas.length; i++){
            System.out.println("Produto " + (i + 1));
            for(int j = 0; j < vendas[i].length; j++){
                System.out.println("Digite as vendas da semana " + (j + 1) + ": ");
                vendas[i][j] = scan.nextInt();
            }
        }
        CalcularVendas(vendas);
        TotalVendasSemana(vendas);
        ProdutoMaisVendido(vendas);
     
        
    }
    public static void CalcularVendas(int [][] vendas){
        //total de vendas por produto
        for(int i = 0; i < vendas.length; i++){
            int totalProduto = 0;
            for(int j = 0; j < vendas[i].length; j++){
                totalProduto += vendas[i][j];
            }
            System.out.println("Total de vendas do produto " + (i + 1) + ": " + totalProduto);
        }
    }
    public static void TotalVendasSemana(int [][] vendas){
        //total de vendas por semana
        for(int j = 0; j < vendas[0].length; j++){
            int totalSemana = 0;
            for(int i = 0; i < vendas.length; i++){
                totalSemana += vendas[i][j];
            }
            System.out.println("Total de vendas da semana " + (j + 1) + ": " + totalSemana);
        }
    }
    public static void ProdutoMaisVendido(int [][] vendas){
        //produto mais vendido no periodo
        int produtoMaisVendido = 0;
        int maiorVenda = Integer.MIN_VALUE;
        for(int i = 0; i < vendas.length; i++){
            int totalProduto = 0;
            for(int j = 0; j < vendas[i].length; j++){
                totalProduto += vendas[i][j];
            }
            if(totalProduto > maiorVenda){
                maiorVenda = totalProduto;
                produtoMaisVendido = i;
            }
        }
        System.out.println("Produto mais vendido no período: Produto " + (produtoMaisVendido + 1) + " com " + maiorVenda + " vendas.");

    }
}
