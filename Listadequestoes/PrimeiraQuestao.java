//Leia as notas de 30 alunos. Implemente funções para calcular a média da turma, contar - ok
//quantos alunos estão acima da média e exibir a maior e a menor nota. O programa deve
//mostrar ao final todas essas estatísticas, permitindo uma análise do desempenho da turma.
import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int alunos[][] = new int[30][3];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < alunos[i].length; j++) {
                System.out.println("Digite a nota " + (j + 1) + ": ");
                alunos[i][j] = scan.nextInt();
            }
        }
        AlunosAcimaMedia(alunos);
        MaiorNota(alunos);
        MediaTurma(alunos);
        ImprimirResutados(alunos);

        //resultados
        //


    }

    public static void AlunosAcimaMedia(int[][] alunos) {
        //mostrar quantos alunos estão acima da média
        int somaNotas = 0;
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; alunos[i].length > j; j++) {
                somaNotas += alunos[i][j];
            }
        }
    }

    public static void MaiorNota(int[][] alunos) {
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos[i].length; j++) {
                if (alunos[i][j] > maiorNota) {
                    maiorNota = alunos[i][j];
                }
                if (alunos[i][j] < menorNota) {
                    menorNota = alunos[i][j];
                }
            }
        }

    }


    public static void MediaTurma(double[][] alunos) {
        double mediaTurma = (double) somaNotas / (alunos.length * alunos[0].length);
        int alunosAcimaMedia = 0;
        for (int i = 0; i < alunos.length; i++) {
            double somaAluno = 0;
            for (int j = 0; j < alunos[i].length; j++) {
                somaAluno += alunos[i][j];
            }
            double mediaAluno = somaAluno / alunos[i].length;
            if (mediaAluno > mediaTurma) {
                alunosAcimaMedia++;
            }
        }
    }

    public static void ImprimirResutados(int [][] alunos) {
        System.out.println("A maior nota da turma é: " + maiorNota);
        System.out.println("A menor nota da turma é: " + menorNota);
        System.out.println("A média da turma é: " + mediaTurma);
        System.out.println("O número de alunos acima da média é: " + alunosAcimaMedia);

        //resultados
        for (int i = 0; i < alunos.length; i++) {
            int somaAluno = 0;
            for (int j = 0; j < alunos[i].length; j++) {
                somaAluno += alunos[i][j];
            }
            System.out.println("A soma das notas do aluno " + (i + 1) + " é: " + somaAluno);
            System.out.println("A média das notas do aluno " + (i + 1) + " é: " + (somaAluno / alunos[i].length));
        }

    }
}



