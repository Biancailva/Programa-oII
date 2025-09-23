//Uma loja vende 5 produtos em 4 semanas. As vendas devem ser armazenadas em uma
//matriz 5x4, onde cada linha representa um produto e cada coluna uma semana. Crie funções
//para calcular: (a) total de vendas por produto, (b) total de vendas por semana, (c) o produto
//mais vendido no período. O programa deve exibir relatórios que auxiliem a gestão da loja.
public class Questao4 {
    public static void main(String[] args) {
        int vendas[][] = new int[5][4];
        //produto 1
        vendas[0][0] = 10; vendas[0][1] = 20; vendas[0][2] = 30; vendas[0][3] = 40;
        //produto 2
        vendas[1][0] = 15; vendas[1][1] = 25; vendas[1][2] = 35; vendas[1][3] = 45;
        //produto 3
        vendas[2][0] = 20; vendas[2][1] = 30; vendas[2][2] = 40; vendas[2][3] = 50;
        //produto 4
        vendas[3][0] = 25; vendas[3][1] = 35; vendas[3][2] = 45; vendas[3][3] = 55;
        //produto 5
        vendas[4][0] = 30; vendas[4][1] = 40; vendas[4][2] = 50; vendas[4][3] = 60;
        //total de vendas por produto
        for(int i = 0; i < vendas.length; i++){
            int totalProduto = 0;
            for(int j = 0; j < vendas[i].length; j++){
                totalProduto += vendas[i][j];
            }
            System.out.println("Total de vendas do produto " + (i + 1) + ": " + totalProduto);
        }
        //total de vendas por semana
        for(int j = 0; j < vendas[0].length; j++){
            int totalSemana = 0;
            for(int i = 0; i < vendas.length; i++){
                totalSemana += vendas[i][j];
            }
            System.out.println("Total de vendas da semana " + (j + 1) + ": " + totalSemana);
        }
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
}//fazer modularizacao em funcoes
