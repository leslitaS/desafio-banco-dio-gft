public class ContaInvestimento extends Conta{


    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("=== Extrato Investimento Bolsa de Valores ===");
        super.imprimirInfosComuns();

    }
}
