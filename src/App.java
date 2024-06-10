import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       System.out.println("======== CADASTRO =======");
       Scanner leitor = new Scanner(System.in);

       char operacao = leitor.nextLine().charAt(0);

       do {
        switch (operacao) {
            case 'C':
                System.out.println("Criando um novo registro");
                break;
           
            default:
                break;
           } 
       } while (operacao != 'S');

       
    }
}
