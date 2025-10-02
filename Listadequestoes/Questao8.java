//Leia uma matriz NxN e implemente funções para: (a) rotacionar a matriz 90° no sentido
//horário, (b) rotacionar a matriz 90° no sentido anti-horário, (c) rotacionar 180°. Exiba a
//matriz original e o resultado de cada rotação.
public class Questao8 {
    public static void main(String[] args) {
        int n = 3; //tamanho da matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    }
        public static int[][] rotacionar90Horario(int[][] matriz) {
        int n = matriz.length;
        int[][] rotacionada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[j][n - 1 - i] = matriz[i][j];
            }
        }
        return rotacionada;
    }
    public static int[][] rotacionar90AntiHorario(int[][] matriz) {
        int n = matriz.length;
        int[][] rotacionada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[n - 1 - j][i] = matriz[i][j];
            }
        }
        return rotacionada;
    }
    public static int[][] rotacionar180(int[][] matriz) {
        int n = matriz.length;
        int[][] rotacionada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[n - 1 - i][n - 1 - j] = matriz[i][j];
            }
        }
        return rotacionada;
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
        //exibir resultados
        public static void ExibirResultados(int[][] matriz) {
        System.out.println("Matriz Original:");
        exibirMatriz(matriz);
        System.out.println("Matriz Rotacionada 90° Horário:");
        exibirMatriz(rotacionar90Horario(matriz));
        System.out.println("Matriz Rotacionada 90° Anti-Horário:");
        exibirMatriz(rotacionar90AntiHorario(matriz));
        System.out.println("Matriz Rotacionada 180°:");
        exibirMatriz(rotacionar180(matriz));
    }
    
}
