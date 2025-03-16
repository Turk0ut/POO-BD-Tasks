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

        Funcionario novoFuncionario = new Funcionario();
        
        novoFuncionario.nome = "Luis";
        novoFuncionario.sobrenome = "Silva";
        novoFuncionario.horasTrabalhadas = 10;
        novoFuncionario.valorPorHora = 25.50;

        novoFuncionario.nomeCompleto();
        novoFuncionario.calculoSalario();

        System.out.println("\n----- Novo Salário -----\n");

        novoFuncionario.incrementarHoras(8);
        novoFuncionario.calculoSalario();

        /**
         * Códigos de Finalização
         */

        System.out.println("\n\n  ----------- PROCESS COMPLETED -----------  ");
        sc.close();

    }
}