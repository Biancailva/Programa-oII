//Leia uma matriz 9x9 preenchida com números de 1 a 9. Crie funções para verificar se o
//tabuleiro é válido, considerando as seguintes regras: (a) cada linha deve conter todos os
//números de 1 a 9 sem repetição, (b) cada coluna deve conter todos os números de 1 a 9 sem
//repetição, (c) cada submatriz 3x3 deve conter todos os números de 1 a 9 sem repetição. Ao
//final, informe se o Sudoku fornecido é válido ou inválido.
import java.util.Scanner;
public class  Questao5 {
    public static void main(String[] args) {
        int sudoku[][] = new int[9][9];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < sudoku.length; i++){
            System.out.println("Linha " + (i + 1));
            for(int j = 0; j < sudoku[i].length; j++){
                System.out.println("Digite o número da coluna " + (j + 1) + ": ");
                sudoku[i][j] = scan.nextInt();
            }
        }
        VerificarSudoku(sudoku, true, true, true);
        
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
