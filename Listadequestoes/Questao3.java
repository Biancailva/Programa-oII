//Implemente um programa que armazene em uma matriz 10x3 as informações de 10 alunos:
//coluna 0 = matrícula, coluna 1 = idade, coluna 2 = nota. Crie funções para: (a) buscar aluno
//por matrícula, (b) calcular a média geral das notas, (c) exibir o aluno com maior nota. O
//programa deve simular operações de consulta a esse banco de dados simplificado.
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        int alunos[][] = new int[10][3];
        //matricula, idade, nota
        //adicionar alunos
       Scanner scan = new Scanner(System.in);
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno " + (i + 1));
            System.out.println("Digite a matrícula: ");
            alunos[i][0] = scan.nextInt();
            System.out.println("Digite a idade: ");
            alunos[i][1] = scan.nextInt();
            System.out.println("Digite a nota: ");
            alunos[i][2] = scan.nextInt();
            for(int j = 0; j < alunos[i].length; j++){
                System.out.print(alunos[i][j] + " ");
            }
            System.out.println();
        }
        BuscarAluno(alunos);
        CalcularMediaGeral(alunos);
        AlunoMaiorNota(alunos);
        

    }
        public static void BuscarAluno(int [][] alunos){
        //buscar aluno por matricula
        int matriculaBusca = 5;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i][0] == matriculaBusca){
                System.out.println("Aluno encontrado: Matricula: " + alunos[i][0] + " Idade: " + alunos[i][1] + " Nota: " + alunos[i][2]);
            }
        }
    }
    public static void CalcularMediaGeral(int [][] alunos){
        //calcular media geral das notas
        int somaNotas = 0;
        for(int i = 0; i < alunos.length; i++){
            somaNotas += alunos[i][2];
        }
        double mediaGeral = (double) somaNotas / alunos.length;
        System.out.println("Média geral das notas: " + mediaGeral);
    }
    public static void AlunoMaiorNota(int [][] alunos){
        //exibir aluno com maior nota
        int maiorNota = Integer.MIN_VALUE;
        int matriculaMaiorNota = 0;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i][2] > maiorNota){
                maiorNota = alunos[i][2];
                matriculaMaiorNota = alunos[i][0];
            }
        }
        System.out.println("Aluno com maior nota: Matricula: " + matriculaMaiorNota + " Nota: " + maiorNota);

    }
}

