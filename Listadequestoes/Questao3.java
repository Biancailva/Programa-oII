//Implemente um programa que armazene em uma matriz 10x3 as informações de 10 alunos:
//coluna 0 = matrícula, coluna 1 = idade, coluna 2 = nota. Crie funções para: (a) buscar aluno
//por matrícula, (b) calcular a média geral das notas, (c) exibir o aluno com maior nota. O
//programa deve simular operações de consulta a esse banco de dados simplificado.
public class Questao3 {
    public static void main(String[] args) {
        int alunos[][] = new int[10][3];
        //matricula, idade, nota
        //adicionar alunos
        alunos[0][0] = 1; alunos[0][1] = 20; alunos[0][2] = 8;
        alunos[1][0] = 2; alunos[1][1] = 21; alunos[1][2] = 7;
        alunos[2][0] = 3; alunos[2][1] = 22; alunos[2][2] = 9;
        alunos[3][0] = 4; alunos[3][1] = 23; alunos[3][2] = 6;
        alunos[4][0] = 5; alunos[4][1] = 24; alunos[4][2] = 10;
        alunos[5][0] = 6; alunos[5][1] = 25; alunos[5][2] = 5;
        alunos[6][0] = 7; alunos[6][1] = 26; alunos[6][2] = 4;
        alunos[7][0] = 8; alunos[7][1] = 27; alunos[7][2] = 3;
        alunos[8][0] = 9; alunos[8][1] = 28; alunos[8][2] = 2;
        alunos[9][0] = 10; alunos[9][1] = 29; alunos[9][2] = 1;
        //buscar aluno por matricula
        int matriculaBusca = 5;
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i][0] == matriculaBusca){
                System.out.println("Aluno encontrado: Matricula: " + alunos[i][0] + " Idade: " + alunos[i][1] + " Nota: " + alunos[i][2]);
            }
        }
        //calcular media geral das notas
        int somaNotas = 0;
        for(int i = 0; i < alunos.length; i++){
            somaNotas += alunos[i][2];
        }
        double mediaGeral = (double) somaNotas / alunos.length;
        System.out.println("Média geral das notas: " + mediaGeral);
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
}//organizar o codigo em funcoes e fazer modularizacao nelas
