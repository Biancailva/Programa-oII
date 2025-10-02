//Leia uma matriz 9x9 preenchida com números de 1 a 9. Crie funções para verificar se o
//tabuleiro é válido, considerando as seguintes regras: (a) cada linha deve conter todos os
//números de 1 a 9 sem repetição, (b) cada coluna deve conter todos os números de 1 a 9 sem
//repetição, (c) cada submatriz 3x3 deve conter todos os números de 1 a 9 sem repetição. Ao
//final, informe se o Sudoku fornecido é válido ou inválido.
public class  Questao5 {
    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
    }
        public static boolean verificarLinhas(int[][] sudoku) {
            for (int i = 0; i < 9; i++) {
                boolean[] numeros = new boolean[9];
                for (int j = 0; j < 9; j++) {
                    int num = sudoku[i][j];
                    if (num < 1 || num > 9 || numeros[num - 1]) {
                        return false;
                    }
                    numeros[num - 1] = true;
                }
            }
            return true;
        }
        public static boolean verificarColunas(int[][] sudoku) {
            for (int j = 0; j < 9; j++) {
                boolean[] numeros = new boolean[9];
                for (int i = 0; i < 9; i++) {
                    int num = sudoku[i][j];
                    if (num < 1 || num > 9 || numeros[num - 1]) {
                        return false;
                    }
                    numeros[num - 1] = true;
                }
            }
            return true;
        }
        public static boolean verificarSubmatrizes(int[][] sudoku) {
            for (int boxRow = 0; boxRow < 3; boxRow++) {
                for (int boxCol = 0; boxCol < 3; boxCol++) {
                    boolean[] numeros = new boolean[9];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            int num = sudoku[boxRow * 3 + i][boxCol * 3 + j];
                            if (num < 1 || num > 9 || numeros[num - 1]) {
                                return false;
                            }
                            numeros[num - 1] = true;
                        }
                    }
                }
            }
            return true;
        }

        public static void VerificarSudoku(int[][] sudoku, boolean verificarLinhas, boolean verificarColunas, boolean  verificarSubmatrizes) {
        if (verificarLinhas(sudoku) && verificarColunas(sudoku) && verificarSubmatrizes(sudoku)) {
            System.out.println("O Sudoku é válido.");
        } else {
            System.out.println("O Sudoku é inválido.");
        }
    }
    
}
