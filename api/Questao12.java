import java.util.*;

public class Questao12 {
    public static void main(String[] args) {
        // aluno (key) --> notas (value)
        Map<String, List<Double>> mapaAlunoNota = new HashMap<>();

        List<Double> notasDoJoao = new ArrayList();
        notasDoJoao.add(7.0);
        notasDoJoao.add(8.0);
        notasDoJoao.add(7.0);
        mapaAlunoNota.put("joao", notasDoJoao);

        mapaAlunoNota.put("maria", Arrays.asList(8.0, 9.0, 10.0));

        System.out.println("Tamanho do mapa: " + mapaAlunoNota.size());

        for (String key : mapaAlunoNota.keySet()) {
            System.out.println("Aluno: " + key);
            double soma = 0.0;

            for (Double nota : mapaAlunoNota.get(key)) {
                soma += nota;
            }
            System.out.println("Média: " + soma / mapaAlunoNota.get(key).size());
        }

    }
}
