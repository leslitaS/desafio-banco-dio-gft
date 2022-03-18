import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cliente cli = new Cliente();

        System.out.println("Nome do Titular: ");
        Scanner scan = new Scanner(System.in);
        cli.setNome(scan.next());


        Conta cc = new ContaCorrente(cli);
        Conta poupanca = new ContaPoupanca(cli);
        Conta cInvestimento = new ContaInvestimento(cli);


        System.out.println("Valor a depositar na conta: ");
        Scanner conta = new Scanner(System.in);

        cc.depositar(Double.parseDouble(conta.next()));
        System.out.println("Valor a depositar na conta poupança: ");
        cc.transferir((Double.parseDouble(conta.next())),poupanca);

        System.out.println("Valor do investimento inicial: (Mínimo R$ 50,00)");
        System.out.println("Valor a investir na Bolsa de valores: ");
        cInvestimento.investir((Double.parseDouble(conta.next())));


        System.out.println("cc:");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cInvestimento.imprimirExtrato();
    }
}
