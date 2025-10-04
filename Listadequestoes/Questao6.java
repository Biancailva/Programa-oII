//Leia uma matriz NxN (definida pelo usuário). Implemente funções para: (a) verificar se a
//matriz é simétrica em relação à diagonal principal, (b) verificar se a matriz é simétrica em
//relação à diagonal secundária, (c) criar e exibir a matriz espelhada (inversão da ordem das
//linhas). O programa deve informar claramente os resultados para cada caso.
import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        int linha = 0;
        int coluna = 0;
       int [][] matriz = new int[linha][coluna];
         Scanner scan = new Scanner(System.in);
            System.out.println("Digite o número de linhas e colunas da matriz (N x N): ");
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Linha " + (i + 1));
                for (int j = 0; j < n; j++) {
                    System.out.println("Digite o número da coluna " + (j + 1) + ": ");
                    matriz[i][j] = scan.nextInt();
                }
            }
            ExibirResultados(matriz);

    }
        public static boolean verificarSimetriaDiagonalPrincipal(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean verificarSimetriaDiagonalSecundaria(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (matriz[i][j] != matriz[n - j - 1][n - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] criarMatrizEspelhada(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizEspelhada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizEspelhada[i][j] = matriz[n - i - 1][j];
            }
        }
        return matrizEspelhada;
    }
    public static void exibirMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
        //verificacoes
        public static void ExibirResultados(int[][] matriz) {
        if (verificarSimetriaDiagonalPrincipal(matriz)) {
            System.out.println("A matriz é simétrica em relação à diagonal principal.");
        } else {
            System.out.println("A matriz não é simétrica em relação à diagonal principal.");
        }
        if (verificarSimetriaDiagonalSecundaria(matriz)) {
            System.out.println("A matriz é simétrica em relação à diagonal secundária.");
        } else {
            System.out.println("A matriz não é simétrica em relação à diagonal secundária.");
        }
        int[][] matrizEspelhada = criarMatrizEspelhada(matriz);
        System.out.println("Matriz espelhada:");
        exibirMatriz(matrizEspelhada);

        
    }
}
