import java.util.Scanner;
public class App {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o tipo da conta: ");
        String conta = sc.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();
        sc.close();

        System.out.println("***********************");
        System.out.println("\n");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Nome: "+ nome);
        System.out.println("Tipo conta: "+ conta);
        System.out.println("Saldo inicial: "+ saldo);
        System.out.println("***********************");

        
    }
}
