import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       System.out.println("======== CADASTRO =======");
       Adicionar adicionar = new Adicionar();
       Scanner leitor = new Scanner(System.in);

       int opcao;

       do {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar Pessoa");
        System.out.println("2. Listar Pessoas");
        System.out.println("3. Alterar Pessoa");
        System.out.println("4. Excluir Pessoa");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = leitor.nextInt();
        leitor.nextLine(); // Consumir o newline deixado pelo nextInt

        switch (opcao) {
            case 1:
                adicionar.adicionarPessoa();
                break;
            case 2:
                adicionar.listarPessoas();
                break;
            case 3:
                adicionar.alterarPessoa();
                break;
            case 4:
                adicionar.excluirPessoa();
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 5);

    leitor.close();
}
}
       
    

