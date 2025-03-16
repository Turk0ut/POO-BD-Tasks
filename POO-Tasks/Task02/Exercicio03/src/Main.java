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

        System.out.print("Digite uma string: ");
        String string = sc.nextLine();

        System.out.println("A quantidade de caracteres é: " + string.length());
        System.out.println("String com tudo maiúsculo: " + string.toUpperCase());
        System.out.println("Começa com UNI: " + string.startsWith("UNI"));
        System.out.println("Termina com RIO: " + string.endsWith("RIO"));


        /**
         * Códigos de Finalização
         */

        System.out.println("\n\n  ----------- PROCESS COMPLETED -----------  ");
        sc.close();

    }
}