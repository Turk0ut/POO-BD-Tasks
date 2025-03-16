package Pessoa;

public class Pessoa {
    String name, job;
    int age;

    /**
    * Funções sem retorno(void)
    */

    public void info(){
        System.out.println("[+] Nome: " + this.name);
        System.out.println("[+] Idade: " + this.age);
        System.out.println("[+] Trabalho: " + this.job + "\n");
    }

    public void growAge(){
        this.age++;
    }

    /**
    * Funções com retorno
    */

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getJob(){
        return job;
    }

    /**
    * Função para alterar atributos
    */

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setJob(String job){
        this.job = job;
    }


}