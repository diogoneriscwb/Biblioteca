import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== MENU DA BIBLIOTECA ===");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Listar Livros Disponíveis");
            System.out.println("3 - Buscar Livro por Título");
            System.out.println("4 - Calcular Valor Total");
            System.out.println("5 - Emprestar Livro");
            System.out.println("6 - Devolver Livro");
            System.out.println("7 - Aplicar Desconto");
            System.out.println("8 - Ver Idade do Livro");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
            } catch (InputMismatchException e) {
                System.out.println("❌ Entrada inválida. Digite um número inteiro.");
                scanner.nextLine();
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer

                    Livro novoLivro = new Livro(titulo, autor, ano, preco);
                    minhaBiblioteca.adicionarLivro(novoLivro);
                }

                case 2 -> minhaBiblioteca.listarLivrosDisponiveis();

                case 3 -> {
                    System.out.print("Digite o título do livro: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = minhaBiblioteca.buscarLivroPorTitulo(tituloBusca);
                    if (livroEncontrado != null) {
                        System.out.println("📘 Livro encontrado:");
                        System.out.println("- Título: " + livroEncontrado.getTitulo());
                        System.out.println("- Autor: " + livroEncontrado.getAutor());
                        System.out.println("- Ano: " + livroEncontrado.getAnoPublicacao());
                        System.out.println("- Preço: R$ " + livroEncontrado.getPreco());
                        System.out.println("- Disponível: " + (livroEncontrado.isDisponivel() ? "Sim" : "Não"));
                    } else {
                        System.out.println("❌ Livro não encontrado.");
                    }
                }

                case 4 -> {
                    double total = minhaBiblioteca.calcularValorTotal();
                    System.out.printf("💰 Valor total dos livros: R$ %.2f\n", total);
                }

                case 5 -> {
                    System.out.print("Título do livro para empréstimo: ");
                    String titulo = scanner.nextLine();
                    Livro livro = minhaBiblioteca.buscarLivroPorTitulo(titulo);
                    if (livro != null) {
                        livro.emprestar();
                    } else {
                        System.out.println("❌ Livro não encontrado.");
                    }
                }

                case 6 -> {
                    System.out.print("Título do livro para devolução: ");
                    String titulo = scanner.nextLine();
                    Livro livro = minhaBiblioteca.buscarLivroPorTitulo(titulo);
                    if (livro != null) {
                        livro.devolver();
                    } else {
                        System.out.println("❌ Livro não encontrado.");
                    }
                }

                case 7 -> {
                    System.out.print("Título do livro para aplicar desconto: ");
                    String titulo = scanner.nextLine();
                    Livro livro = minhaBiblioteca.buscarLivroPorTitulo(titulo);
                    if (livro != null) {
                        System.out.print("Percentual de desconto (0–100): ");
                        double percentual = scanner.nextDouble();
                        scanner.nextLine();
                        livro.aplicarDesconto(percentual);
                    } else {
                        System.out.println("❌ Livro não encontrado.");
                    }
                }

                case 8 -> {
                    System.out.print("Título do livro para verificar idade: ");
                    String titulo = scanner.nextLine();
                    Livro livro = minhaBiblioteca.buscarLivroPorTitulo(titulo);
                    if (livro != null) {
                        System.out.print("Ano atual: ");
                        int anoAtual = scanner.nextInt();
                        scanner.nextLine();
                        int idade = livro.obterIdade(anoAtual);
                        System.out.println("📖 O livro tem " + idade + " anos.");
                    } else {
                        System.out.println("❌ Livro não encontrado.");
                    }
                }

                case 0 -> System.out.println("📚 Encerrando o programa. Até mais!");

                default -> System.out.println("⚠️ Opção inválida. Tente novamente.");
            }
        }
    }
}