public class ContaCorrente {

    double saldo = 0;

    void definirSaldoInicial(double saldoInicial) {
        saldo = saldoInicial;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valorSaque){
        if (valorSaque > saldo){
            System.out.println("\nTu quer sacar mais do que tu tem, macho? Vá trabalhar mais.\n");
        } else {
            saldo -= valorSaque;
        }
    }





}
