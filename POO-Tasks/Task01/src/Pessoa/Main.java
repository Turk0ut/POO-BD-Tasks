package Pessoa;

public class Main {
    public static void main(String[] args) {

        /**
        * Duas pessoas distintas
        */

        Pessoa people1 = new Pessoa();
        people1.name = "Tiago";
        people1.age = 27;
        people1.job = "Barbeiro";

        Pessoa people2 = new Pessoa();
        people2.name = "John";
        people2.age = 22;
        people2.job = "Faz programa";

        /**
         * Imprimindo atributos
         */

        System.out.println("------------ Atributos ----------\n");
        System.out.println("Pessoa 1");
        people1.info();
        System.out.println("---------------------------------\n");

        System.out.println("Pessoa 2");
        people2.info();
        System.out.println("---------------------------------\n");

        /**
         * Alterando atributos
         */

        System.out.println("----- Atributos Atualizados -----\n");
        System.out.println("---------------------------------\n");

        people1.name = "Mamaco";
        people1.age = 16;
        people1.job = "Guarda de zoológico";

        people2.name = "Volim Habah";
        people2.age = 35;
        people2.job = "Enrrabador profissional";

        /**
         * Imprimindo novos atributos
         */

        System.out.println("Pessoa 1");
        people1.info();
        System.out.println("---------------------------------\n");

        System.out.println("Pessoa 2");
        people2.info();
        System.out.println("---------------------------------\n");
    }

}