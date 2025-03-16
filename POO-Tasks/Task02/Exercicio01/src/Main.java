/**
 * @Author Tiago Alves
 * @Version 0.01
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Códigos de Inicialização
         */

        System.out.println("  ----------- STARTING PROGRAM -----------  \n");
        //Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /**
         * #################### Início do Código ####################
         */

        ContaCorrente novaConta = new ContaCorrente();

        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo Inicial: " + novaConta.saldo);

        novaConta.sacar(500);
        novaConta.depositar(50);
        System.out.println("Saldo atual: " + novaConta.saldo);

        novaConta.sacar(600);

        System.out.println("Saldo atual: " + novaConta.saldo);

        /**
         * Códigos de Finalização
         */

        System.out.println("\n\n  ----------- PROCESS COMPLETED -----------  ");
        sc.close();

    }
}