//Dado um vetor de inteiros com tamanho 20, crie funções para: (a) eliminar os valores
//duplicados, mantendo apenas a primeira ocorrência, (b) gerar um novo vetor apenas com os
//valores distintos, (c) exibir o vetor original e o comprimido. Esse exercício trabalha lógica
//de busca e manipulação de vetores sem usar estruturas prontas como Set.
import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        int vetor [] = new int[20];
        //usuario ira digitar os valores do vetor
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores do vetor: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor da posição " + (i + 1) + ": ");
            vetor[i] = scan.nextInt();
        }
        mainExecution(vetor);

    }

    public static int[] eliminarDuplicados(int[] vetor) {
        int n = vetor.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean encontrado = false;
            for (int k = 0; k < j; k++) {
                if (vetor[i] == temp[k]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                temp[j++] = vetor[i];
            }
        }
        int[] resultado = new int[j];
        System.arraycopy(temp, 0, resultado, 0, j);
        return resultado;
    }
    public static int[] gerarVetorDistintos(int[] vetor) {
        int n = vetor.length;
        boolean[] existe = new boolean[100]; // assumindo que os valores estão entre 0 e 99
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!existe[vetor[i]]) {
                existe[vetor[i]] = true;
                count++;
            }
        }
        int[] distintos = new int[count];
        int index = 0;
        for (int i = 0; i < 100; i++) {
            if (existe[i]) {
                distintos[index++] = i;
            }
        }
        return distintos;
    }
    public static void exibirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void mainExecution(int[] vetor) {
       
        System.out.println("Vetor Original:");
        exibirVetor(vetor);
        
        int[] vetorSemDuplicados = eliminarDuplicados(vetor);
        System.out.println("Vetor sem Duplicados (mantendo a primeira ocorrência):");
        exibirVetor(vetorSemDuplicados);
        
        int[] vetorDistintos = gerarVetorDistintos(vetor);
        System.out.println("Vetor com Valores Distintos:");
        exibirVetor(vetorDistintos);
    }
}
