import java.util.ArrayList;
import java.util.Scanner;

public class Adicionar {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarPessoa() {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir o newline deixado pelo nextInt
        Pessoa pessoa = new Pessoa(nome, idade);
        listaPessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    public void listarPessoas() {
        if (listaPessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println("Lista de Pessoas:");
            for (Pessoa pessoa : listaPessoas) {
                System.out.println(pessoa);
            }
        }
    }
    public void alterarPessoa() {
        System.out.print("Digite o nome da pessoa a ser alterada: ");
        String nome = scanner.nextLine();
        Pessoa pessoaEncontrada = null;

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                pessoaEncontrada = pessoa;
                break;
            }
        }

        if (pessoaEncontrada == null) {
            System.out.println("Pessoa não encontrada.");
        } else {
            System.out.print("Digite o novo nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Digite a nova idade: ");
            int novaIdade = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline deixado pelo nextInt
            pessoaEncontrada.setNome(novoNome);
            pessoaEncontrada.setIdade(novaIdade);
            System.out.println("Dados da pessoa alterados com sucesso!");
        }
    }
    public void excluirPessoa() {
        System.out.print("Digite o nome da pessoa a ser excluída: ");
        String nome = scanner.nextLine();
        Pessoa pessoaEncontrada = null;

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                pessoaEncontrada = pessoa;
                break;
            }
        }

        if (pessoaEncontrada == null) {
            System.out.println("Pessoa não encontrada.");
        } else {
            listaPessoas.remove(pessoaEncontrada);
            System.out.println("Pessoa excluída com sucesso!");
        }
    }

    }
    

