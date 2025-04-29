import java.util.Scanner;

public class APS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        do {
            System.out.println("\n--- Escolha de 0 a 5: ----");
            System.out.println("0 - Mídia e construção de papéis de gênero");
            System.out.println("1 - Representatividade feminina na política, ciência e tecnologia");
            System.out.println("2 - Sororidade e empoderamento feminino");
            System.out.println("3 - Violência de gênero e suas formas (física, psicológica, simbólica, etc.)");
            System.out.println("4 - Mulheres na luta por direitos civis e trabalhistas");
            System.out.println("5 - Quiz");
            System.out.println("6 - Sair");
            System.out.print("\nQual tema você gostaria de aprender? ");

            opcao = sc.next().charAt(0);
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case '0':
                    System.out.println("\n--- Mídia e construção de papéis de gênero ---");
                    System.out.println("A mídia tem papel central na formação de identidades de gênero, podendo tanto reforçar estereótipos quanto promover mudanças sociais.");
                    System.out.println("Comercializações, novelas, filmes e redes sociais influenciam a forma como homens e mulheres são percebidos.");
                    System.out.println("Estereótipos como 'mulher frágil' e 'homem provedor' são exemplos de construções midiáticas.");
                    System.out.println("Saiba mais: https://psico-smart.com/pt/blogs/blog-a-representacao-de-genero-na-midia-e-seu-impacto-nas-percepcoes-sociais-146232");
                    System.out.println("\nDigite ENTER para voltar ao menu...");
                    sc.nextLine();
                    break;

                case '1':
                    System.out.println("\n--- Representatividade feminina na política, ciência e tecnologia ---");
                    System.out.println("A participação das mulheres nesses espaços é fundamental para construir sociedades mais justas e democráticas.");
                    System.out.println("Historicamente, mulheres foram excluídas desses setores, mas hoje movimentos buscam reverter essa desigualdade.");
                    System.out.println("Exemplos de destaque: Angela Merkel (política), Marie Curie (ciência), Ada Lovelace (tecnologia).");
                    System.out.println("Saiba mais: https://www.brasildefato.com.br/2022/03/08/8m-a-importancia-da-representatividade-feminina-na-politica-e-na-ciencia");
                    System.out.println("\nDigite ENTER para voltar ao menu...");
                    sc.nextLine();
                    break;

                case '2':
                    System.out.println("\n--- Sororidade e empoderamento feminino ---");
                    System.out.println("Sororidade é o apoio e solidariedade entre mulheres na luta contra as opressões de gênero.");
                    System.out.println("Empoderar significa dar poder às mulheres para que possam conquistar autonomia, respeito e igualdade de direitos.");
                    System.out.println("Esses conceitos fortalecem o combate ao machismo e às desigualdades sociais.");
                    System.out.println("Saiba mais: https://www.politize.com.br/sororidade-o-que-e/");
                    System.out.println("\nDigite ENTER para voltar ao menu...");
                    sc.nextLine();
                    break;

                case '3':
                    System.out.println("\n--- Violência de gênero e suas formas ---");
                    System.out.println("A violência de gênero pode ser:");
                    System.out.println("- Física: agressões corporais.");
                    System.out.println("- Psicológica: humilhações, ameaças, manipulações.");
                    System.out.println("- Simbólica: imposições culturais que desvalorizam mulheres.");
                    System.out.println("Combater essas violências é essencial para a construção de uma sociedade mais igualitária.");
                    System.out.println("Saiba mais: https://www.onumulheres.org.br/violencia-contra-as-mulheres/");
                    System.out.println("\nDigite ENTER para voltar ao menu...");
                    sc.nextLine();
                    break;

                case '4':
                    System.out.println("\n--- Mulheres na luta por direitos civis e trabalhistas ---");
                    System.out.println("Mulheres lideraram movimentos por direito ao voto, igualdade salarial, licença maternidade e melhores condições de trabalho.");
                    System.out.println("Personagens históricas: Rosa Parks (direitos civis nos EUA), Clara Zetkin (direitos trabalhistas na Alemanha).");
                    System.out.println("Essas lutas continuam inspirando gerações atuais.");
                    System.out.println("Saiba mais: https://www.unesco.org/pt/days/womens-rights");
                    System.out.println("\nDigite ENTER para voltar ao menu...");
                    sc.nextLine();
                    break;

                case '5':
                    System.out.println("\n--- Quiz Interativo ---");
                    System.out.println("Qual lei protege as mulheres contra violência doméstica?");
                    System.out.println("a) Lei Anti-Abuso Doméstico.");
                    System.out.println("b) Habeas Data.");
                    System.out.println("c) Lei Maria da Penha.");

                    System.out.print("Digite sua resposta (a, b ou c): ");
                    String resposta = sc.nextLine();

                    if (resposta.equalsIgnoreCase("c")) {
                        System.out.println("✅ Resposta correta! A Lei Maria da Penha (2006) é um marco no combate à violência doméstica no Brasil.");
                    } else {
                        System.out.println("❌ Resposta incorreta. A resposta certa é a letra (c) - Lei Maria da Penha.");
                    }
                    System.out.println("\nPressione 'Enter' Para Voltar ao Menu inicial.");
                    sc.nextLine();
                    break;

                case '6':
                    System.out.println("\nPrograma encerrado. Obrigado por aprender conosco!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != '6');

        sc.close();
    }
}
