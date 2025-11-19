import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UrnaEletronica {

    // key = id eleitor; value = numero candidato que votou
    public static Map<Integer, Integer> mapaEleitor = new HashMap<>();
    // key = numero candidato; value = mapa nome/qtd voto
    public static Map<Integer, Map<String, Integer>> mapaCandidato = new HashMap<>();
    
    public static boolean votacaoEncerrada = false;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("1 - Cadastrar candidatos");
            System.out.println("2 - Iniciar Votação");
            System.out.println("3 - Encerrar Votação");
            System.out.println("4 - Resultado Eleição");
            System.out.println("5 - Auditar Votos");
            System.out.println("0 - Sair");
            System.out.println("------------------------------------");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastrarCandidatos(input);
                    break;
                case 2:
                    iniciarVotacao(input);
                    break;
                case 3:
                    encerrarVotacao();
                    break;
                case 4:
                    resultadoEleicao();
                    break;
                case 5:
                    auditarVotos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void cadastrarCandidatos(Scanner input) {
        if (votacaoEncerrada) {
            System.out.println("Não é possível cadastrar candidatos após o encerramento da votação.");
            return;
        }
        
        boolean cadastrarMaisCandidatos = false;
        do {
            System.out.print("Digite o nome do Candidato: ");
            String nomeCandidato = input.next();
            System.out.print("Digite o número do Candidato: ");
            Integer numeroCandidato = input.nextInt();

            Map<String, Integer> mapaDadosCandidato = new HashMap<>();
            mapaDadosCandidato.put(nomeCandidato, 0);

            if (mapaCandidato.containsKey(numeroCandidato)) {
                System.out.println("Não foi possível cadastrar. Número já utilizado por outro candidato.");
            } else {
                mapaCandidato.put(numeroCandidato, mapaDadosCandidato);
                System.out.println("Candidato cadastrado com sucesso!");
            }

            System.out.print("Deseja cadastrar outro candidato? (S/N): ");
            String opcao = input.next();

            cadastrarMaisCandidatos = opcao.equalsIgnoreCase("S");
            
        } while (cadastrarMaisCandidatos);
    }

    public static void iniciarVotacao(Scanner input) {
        if (votacaoEncerrada) {
            System.out.println("A votação já foi encerrada.");
            return;
        }
        
        if (mapaCandidato.isEmpty()) {
            System.out.println("Não há candidatos cadastrados. Cadastre candidatos primeiro.");
            return;
        }

        System.out.println("\n=== INICIANDO VOTAÇÃO ===");
        
        boolean continuarVotando = true;
        while (continuarVotando && !votacaoEncerrada) {
            System.out.print("Digite o ID do eleitor: ");
            int idEleitor = input.nextInt();

            if (mapaEleitor.containsKey(idEleitor)) {
                System.out.println("Este eleitor já votou!");
                continue;
            }

            System.out.println("Candidatos disponíveis:");
            percorrerMapaCandidatos();

            System.out.print("Digite o número do candidato: ");
            int numeroCandidato = input.nextInt();

            if (!mapaCandidato.containsKey(numeroCandidato)) {
                System.out.println("Candidato não encontrado!");
                continue;
            }

            // Registra o voto do eleitor
            mapaEleitor.put(idEleitor, numeroCandidato);

            // Atualiza a contagem de votos do candidato
            Map<String, Integer> dadosCandidato = mapaCandidato.get(numeroCandidato);
            for (Map.Entry<String, Integer> entry : dadosCandidato.entrySet()) {
                String nome = entry.getKey();
                int votosAtuais = entry.getValue();
                dadosCandidato.put(nome, votosAtuais + 1);
            }

            System.out.println("Voto computado com sucesso!");

            System.out.print("Deseja continuar votação? (S/N): ");
            String opcao = input.next();
            continuarVotando = opcao.equalsIgnoreCase("S");
        }
    }

    public static void encerrarVotacao() {
        votacaoEncerrada = true;
        System.out.println("Votação encerrada com sucesso!");
    }

    public static void resultadoEleicao() {
        if (!votacaoEncerrada) {
            System.out.println("A votação ainda não foi encerrada.");
            return;
        }

        System.out.println("\n=== RESULTADO DA ELEIÇÃO ===");
        
        if (mapaCandidato.isEmpty()) {
            System.out.println("Não há candidatos cadastrados.");
            return;
        }

        int totalVotos = mapaEleitor.size();
        System.out.println("Total de votos computados: " + totalVotos);

        Map.Entry<Integer, Map<String, Integer>> vencedor = null;
        
        for (Map.Entry<Integer, Map<String, Integer>> entry : mapaCandidato.entrySet()) {
            int numeroCandidato = entry.getKey();
            Map<String, Integer> dadosCandidato = entry.getValue();
            
            for (Map.Entry<String, Integer> dados : dadosCandidato.entrySet()) {
                String nome = dados.getKey();
                int votos = dados.getValue();
                double percentual = totalVotos > 0 ? (votos * 100.0) / totalVotos : 0;
                
                System.out.printf("Candidato: %s | Número: %d | Votos: %d | Percentual: %.2f%%\n", 
                                nome, numeroCandidato, votos, percentual);
                
                // Verifica se é o vencedor
                if (vencedor == null || votos > vencedor.getValue().values().iterator().next()) {
                    vencedor = entry;
                }
            }
        }

        if (vencedor != null) {
            for (Map.Entry<String, Integer> dados : vencedor.getValue().entrySet()) {
                System.out.printf("\n🎉 VENCEDOR: %s com %d votos! 🎉\n", 
                                dados.getKey(), dados.getValue());
            }
        }
    }

    public static void auditarVotos() {
        System.out.println("\n=== AUDITORIA DE VOTOS ===");
        System.out.println("Total de eleitor que votaram: " + mapaEleitor.size());
        
        System.out.println("\nDetalhamento por eleitor:");
        for (Map.Entry<Integer, Integer> entry : mapaEleitor.entrySet()) {
            int idEleitor = entry.getKey();
            int numeroCandidato = entry.getValue();
            String nomeCandidato = "Candidato não encontrado";
            
            // Busca o nome do candidato
            Map<String, Integer> dadosCandidato = mapaCandidato.get(numeroCandidato);
            if (dadosCandidato != null) {
                nomeCandidato = dadosCandidato.keySet().iterator().next();
            }
            
            System.out.printf("Eleitor ID: %d | Votou em: %s (Nº %d)\n", 
                            idEleitor, nomeCandidato, numeroCandidato);
        }

        System.out.println("\nContagem por candidato:");
        for (Map.Entry<Integer, Map<String, Integer>> entry : mapaCandidato.entrySet()) {
            int numeroCandidato = entry.getKey();
            Map<String, Integer> dadosCandidato = entry.getValue();
            
            for (Map.Entry<String, Integer> dados : dadosCandidato.entrySet()) {
                System.out.printf("Candidato: %s | Número: %d | Votos: %d\n", 
                                dados.getKey(), numeroCandidato, dados.getValue());
            }
        }
    }

    public static void percorrerMapaCandidatos() {
        if (mapaCandidato.isEmpty()) {
            System.out.println("Nenhum candidato cadastrado.");
            return;
        }

        for (Map.Entry<Integer, Map<String, Integer>> entry : mapaCandidato.entrySet()) {
            int numeroCandidato = entry.getKey();
            Map<String, Integer> dadosCandidato = entry.getValue();
            
            for (Map.Entry<String, Integer> dados : dadosCandidato.entrySet()) {
                System.out.printf("Nome: %s | Número: %d\n", dados.getKey(), numeroCandidato);
            }
        }
    }
}
