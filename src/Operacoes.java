public class Operacoes {

    public static void consultaSaldo(double saldo) {
        System.out.println("Saldo: " + saldo);        
    }

    public static double recebeTransferencia(double saldo, double valorRecebido) {
        if (valorRecebido > 0){
            saldo += valorRecebido;
             System.out.println("Transferência de R$" + valorRecebido + " recebida com sucesso!");
        }
        else{
            System.out.println("Valor de transferência inválido.");
        }
        return saldo;
        
    }

    public static double fazTransferencia(double saldo, double valorTransferido) {
        if (valorTransferido > saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo-=valorTransferido;
        }
        return saldo;

    }

    public static void sair() {
        System.out.println("Saindo...");
        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void pularLinha(){
        System.out.println("\n");
    }

}
