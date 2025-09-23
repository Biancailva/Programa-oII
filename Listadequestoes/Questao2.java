//Implemente uma matriz 3x3 que simule o tabuleiro do jogo da velha. Dois jogadores
//alternam suas jogadas (X e O). Após cada jogada, verifique se houve vencedor ou se o jogo
//terminou em empate. O programa deve imprimir o tabuleiro a cada rodada e exibir uma
//mensagem final indicando o resultado.
public class Questao2 {
    public static void main(String[] args) {
        int tabuleiro[][] = new int[3][3];
        //X = 1
        //O = 2
        //vazio = 0
        //imprimir tabuleiro
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[i].length; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        //jogadas
        tabuleiro[0][0] = 1;
        tabuleiro[0][1] = 2;
        tabuleiro[0][2] = 1;
        tabuleiro[1][0] = 2;
        tabuleiro[1][1] = 1;
        tabuleiro[1][2] = 2;
        tabuleiro[2][0] = 1;
        tabuleiro[2][1] = 2;
        tabuleiro[2][2] = 1;
        //imprimir tabuleiro
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[i].length; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        //verificar vencedor
        int vencedor = 0;
        //verificar linhas
        for(int i = 0; i < tabuleiro.length; i++){
            if(tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]){
                vencedor = tabuleiro[i][0];
            }
        }
        //verificar colunas
        for(int i = 0; i < tabuleiro.length; i++){
            if(tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]){
                vencedor = tabuleiro[0][i];
            }
        }
        //verificar diagonais
        if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]){
            vencedor = tabuleiro[0][0];
        }
        if(tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]){
            vencedor = tabuleiro[0][2];
        }
        //imprimir vencedor
        if(vencedor == 1){
            System.out.println("X venceu!");
        }else if(vencedor == 2){
            System.out.println("O venceu!");
        }else{
            System.out.println("Empate!");
        }


    }
}//modularizar e organizar o codigo em funcoes