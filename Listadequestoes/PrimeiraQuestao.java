
//Leia as notas de 30 alunos. Implemente funções para calcular a média da turma, contar - ok
//quantos alunos estão acima da média e exibir a maior e a menor nota. O programa deve
//mostrar ao final todas essas estatísticas, permitindo uma análise do desempenho da turma.
import java.util.Scanner;
public class PrimeiraQuestao {
    public static void main(String[] args) {
        int notas[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("Digite a nota %d do aluno %d: ", j + 1, i + 1);
                notas[i][j] = input.nextInt();//isso é para digitar

            }
        }
        estatisticasTurma(notas);


    }
    //calcular a média da turma
    public static double calcularMediaTurma(int[][] notas) {
        double soma = 0;
        int totalNotas = 0;//variavel criada para armazenar valor
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
                totalNotas++;
            }
        }
        return soma / totalNotas;
    }//alunos acima da media e exibir maior e menor nota
    public static void estatisticasTurma(int[][] notas) {
        double mediaTurma = calcularMediaTurma(notas);
        int countAcimaMedia = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > mediaTurma) {
                    countAcimaMedia++;
                }
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                }
            }
        }

        System.out.printf("Média da turma: %.2f\n", mediaTurma);
        System.out.println("Quantidade de alunos acima da média: " + countAcimaMedia);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }
}
