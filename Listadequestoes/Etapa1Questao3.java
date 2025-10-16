//fazer uma matriz 5x5 - ok
//exibir a matriz mostrando os acentos, todos inicializados com 'L' - ok
//permitir digitar apenas os acentos livres 'L', reservados 'R' - ok
//permitir preencher a matriz com 'L' ou 'R' - ok
//permitir excluir uma escolha - ok
//exibir o numero de acentos vazios - ok
import java.util.Scanner;
public class Etapa1Questao3 {
    public static void main(String[] args) {
        char cinema [][] = new char[5][5];
        Scanner input = new Scanner(System.in);


        InicializarSala(cinema);
        ExibirAcentos(cinema);
        AcentosVazios(cinema);
        Reservar(input, cinema);
        cancelarReserva(input, cinema);


    }
    //chamada das funcoes
    
    public static void InicializarSala(char cinema[][]) {
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema.length; j++) {
                cinema[i][j] = 'L';
            }
        }
    }
    
   
   public static void ExibirAcentos(char [][] cinema) {
        System.out.println("Mapa da sala de cinema:");
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema.length; j++) {
                System.out.print("[ " + cinema[i][j] + " ]");
            }
            System.out.println();
        }
    }

    public static void Reservar(Scanner input, char cinema[][]){
        System.out.println("Digite o número da fileira (0 a 5):");
            int linha = input.nextInt();
            System.out.println("Digite o número do assento (0 a 5):");
            int coluna = input.nextInt();

            if (linha >= 0 && linha < cinema.length && coluna >= 0 && coluna < cinema.length) {
                if (cinema[linha][coluna] == 'L') {
                    cinema[linha][coluna] = 'R';
                    System.out.println("Assento reservado com sucesso!");
                    ExibirAcentos(cinema);
                } else {
                    System.out.println("Assento já está reservado.");
                    ExibirAcentos(cinema);
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }

        }
        
        public static void AcentosVazios(char cinema[][]){
            int disponiveis = 0;
            for (int i = 0; i < cinema.length; i++) {
                for (int j = 0; j < cinema.length; j++) {
                    if (cinema[i][j] == 'L') {
                        disponiveis++;
                    }
                }
            }
            if (disponiveis > 0) {
                System.out.println("Assentos disponíveis: " + disponiveis);
            }
            else {
                System.out.println("Sala cheia. Não existe nenhum assento disponível!");
            }
        }
        public static void cancelarReserva(Scanner scanner, char cinema[][]) {
        System.out.println("Digite o número da fileira (0 a 4):");
        int linha = scanner.nextInt();
        System.out.println("Digite o número do assento (0 a 4):");
        int coluna = scanner.nextInt();

        if (linha >= 0 && linha < cinema.length && coluna >= 0 && coluna < cinema.length) {
            if (cinema[linha][coluna] == 'R') {
                cinema[linha][coluna] = 'L';
                System.out.println("Reserva cancelada com sucesso!");
                ExibirAcentos(cinema);
            }
        } else {
            System.out.println("Posição inválida. Tente novamente.");
        }
    }
    }

      
         

