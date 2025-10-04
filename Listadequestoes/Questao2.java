import java.util.Scanner;

public class Questao2 {

    public static final char VALOR_X = 'X'; //se usa char para definir valores padroes
    public static final char VALOR_O = 'O';
    public static final char VALOR_VAZIO = ' ';

    public static void main(String[] args) {
        //criar o tabuleiro - OK
        //efetuar jogada - laço de repetiçao
        //imprimir tabuleiro - laço de repetiçao - OK
        //verificar se houve vencedor/empate - laço de repetiçao
        //mensagem final mostrando resultado

        Scanner input = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];// aqui vai se iniciar o tabuleiro
        inicializarTabuleiro(tabuleiro);
        imprimirTabuleiro(tabuleiro);
        char jogador = VALOR_X;

        do {
            System.out.println("Jogador " + jogador + " informe a posição da sua jogada.");
            System.out.println("Linha [1 - 3]: ");
            int linhaJogada = input.nextInt();
            linhaJogada--; // se usa o sinal de menos para que se o jogador digitar 1 caia na coluna 0
            System.out.println("Coluna [1 - 3]: ");
            int colunaJogada = input.nextInt();
            colunaJogada--;

            boolean isJogadaBemSucedida = efetuarJogada(tabuleiro, linhaJogada, colunaJogada, jogador);
            if (isJogadaBemSucedida) {
                jogador = (jogador == VALOR_X) ? VALOR_O : VALOR_X;// trocando de jogador a cada partida
            }
            System.out.println();
            imprimirTabuleiro(tabuleiro);
        } while (!isPartidaFinalizou(tabuleiro));

    }

    public static boolean isPartidaFinalizou(char[][] tabuleiro) {
        //verifica se houve vencedor
        for (int i = 0; i < tabuleiro.length; i++) {
            //verifica linhas
            if (tabuleiro[i][0] != VALOR_VAZIO && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                System.out.println("O jogador " + tabuleiro[i][0] + " venceu!");
                return true;
            }
            //verifica colunas
            if (tabuleiro[0][i] != VALOR_VAZIO && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                System.out.println("O jogador " + tabuleiro[0][i] + " venceu!");
                return true;
            }
        }
        //verifica diagonais
        if (tabuleiro[0][0] != VALOR_VAZIO && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            System.out.println("O jogador " + tabuleiro[0][0] + " venceu!");
            return true;
        }
        if (tabuleiro[0][2] != VALOR_VAZIO && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            System.out.println("O jogador " + tabuleiro[0][2] + " venceu!");
            return true;
        }
        //verifica se houve empate
        boolean isTabuleiroCheio = true;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == VALOR_VAZIO) {
                    isTabuleiroCheio = false;
                    break;
                }
            }
        }
        if (isTabuleiroCheio) {
            System.out.println("Empate!");
            return true;
        }
        
        return false;
    }

    public static boolean efetuarJogada(char[][] tabuleiro, int linha, int coluna, char jogador) {
        //valida se as coordenadas estão dentro do limite [1 - 3]
        boolean isLinhaInvalida = linha < 0 || linha > 2;
        boolean isColunaInvalida = coluna < 0 || coluna > 2;
        if (isLinhaInvalida || isColunaInvalida) {
            System.out.println("Jogada inválida! Os valores das coordenadas não estão no limite esperado [1 - 3].");
            return false;
        }

        //valida se a posiçao é válida (se está livre)
        if (tabuleiro[linha][coluna] != VALOR_VAZIO) {
            System.out.println("Jogada inválida! Posição já está marcada.");
            return false;
        }
        tabuleiro[linha][coluna] = jogador;
        return true;
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = VALOR_VAZIO;
            }
        }
    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("[" + tabuleiro[i][j] + "]");
            }
            System.out.println();
        }
    }

}
