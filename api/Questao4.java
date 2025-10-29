package api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Questao4 {
    public static void main(String[] args) {
        List<Integer> numerosComRepeticao = new ArrayList<>();
        numerosComRepeticao.add(1);
        numerosComRepeticao.add(2);
        numerosComRepeticao.add(3);
        numerosComRepeticao.add(2);
        numerosComRepeticao.add(4);
        numerosComRepeticao.add(1);
        numerosComRepeticao.add(5);

        System.out.println("Lista com duplicatas: " + numerosComRepeticao);

        // Convertendo para Set para eliminar duplicatas
        Set<Integer> numerosUnicos = new HashSet<>(numerosComRepeticao);
        System.out.println("Set sem duplicatas: " + numerosUnicos);
    }
}
