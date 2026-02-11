import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o tipo da conta: ");
        String conta = sc.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        Operacoes.pularLinha();

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente: ");
        Operacoes.pularLinha();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("***********************");
        Operacoes.pularLinha();
        
        System.out.println("Operacoes: ");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair\n");
        
        boolean rodando = true;
        while (rodando){
            System.out.print("Digite a opcao desejada: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    Operacoes.consultaSaldo(saldo);                                        
                    break;
                case 2:
                    System.out.print("Digite o valor a ser recebido: ");
                    double valorRecebido = sc.nextDouble();
                    saldo = Operacoes.recebeTransferencia(saldo, valorRecebido);                                        
                    break;
                case 3:
                    System.out.print("Digite o valor a ser transferido: ");
                    double valorTransferido = sc.nextDouble();
                    saldo = Operacoes.fazTransferencia(saldo, valorTransferido);                                        
                    break;
                case 4:
                    Operacoes.sair();
                    rodando = false;
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente!");
            }
        }
        sc.close();
    }
}
