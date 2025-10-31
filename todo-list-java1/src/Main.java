import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean executando = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("ToDo list");

        while (executando) {

            System.out.println("==== Menu ====");
            System.out.println("1. Cadastrar tarefa");
            System.out.println("2. Listar tarefas pendentes");
            System.out.println("3. Buscar tarefa por título");
            System.out.println("4. Marcar tarefa como concluída");
            System.out.println("5. Remover uma tarefa");
            System.out.println("0. Sair");
            System.out.print("Digite uma opção: ");

            int opcao = sc.nextInt();
            System.out.println("A opção escolhida foi " + opcao);
            sc.nextLine();

            executando = switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o titulo");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o descricao");
                    String descricao = sc.nextLine();
                    System.out.println("Digite a data de entrega (yyyy-mm-dd)");
                    LocalDate dataEntrega = LocalDate.parse(sc.nextLine());
                    System.out.println("Cadastrar tarefa");

                    Tarefa novatarefa = new Tarefa(titulo, descricao, dataEntrega);
                    System.out.println(novatarefa);
                    yield true;
                }
                case 2 -> {
                    System.out.println("Listar tarefas pendentes");
                    yield true;
                }
                case 3 -> {
                    System.out.println("Buscar tarefa por título");
                    yield true;
                }
                case 4 -> {
                    System.out.println("Marcar tarefa como concluída");
                    yield true;
                }
                case 5 -> {
                    System.out.println("Remover uma tarefa");
                    yield true;
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    yield false;
                }
                default -> {
                    System.out.println("Opção inválida");
                    yield true;
                }
            };
        }
    }
}
