public interface IConta {

    //protected static final int AGENCIA_PADRAO = 1 ;


    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void investir(double valor);

    void imprimirExtrato();
}
