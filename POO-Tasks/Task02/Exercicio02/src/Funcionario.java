public class Funcionario {
    String nome, sobrenome;
    int horasTrabalhadas;
    double valorPorHora;

    void nomeCompleto() {
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);
    }

    void calculoSalario() {
        double salario = horasTrabalhadas * valorPorHora;
        System.out.println("R$ " + salario);
    }

    void incrementarHoras(int addHoras){
        horasTrabalhadas += addHoras;
    }



}
