/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import java.util.Scanner;

/**
 *
 * @author RaaiL
 */
public class FuncionarioApp {

    private String nome;
    private float salario;
    private int idade;
    private boolean statusFerias;
    private Scanner scan = new Scanner(System.in);
    private int opcao;

    public void exibeMenu() {
        System.out.println("Escolha uma das opções:");
        System.out.println("O funcionário está de férias?:");
        System.out.println("1 - O usuário está de férias");
        System.out.println("2 - Ele não está de férias");
        System.out.println("3 - Próximo funcionário\n");

    }

    public void escolheOpcao(int opcao) {
        if (opcao == 1) {
            statusFerias = true;
            System.out.println("O funcionário está de férias" + this.statusFerias);
            System.out.println("O nome do funcionário é: " + this.nome);
            System.out.println("A idade dele é : " + this.idade + " anos ");
            System.out.println("O salário dele é : R$ " + this.salario);
            System.out.println("Tecle 3 para o próximo funcionário\n");
            
        } else if (opcao == 2) {
            statusFerias = false;
            System.out.println("O funcionário não está de férias," + this.statusFerias);
            System.out.println("O nome do funcionário é: " + this.nome);
            System.out.println("A idade dele é : " + this.idade + " anos ");
            System.out.println("O salário dele é : R$ " + this.salario);
            System.out.println("Tecle 3 para o próximo funcionário\n");
            
        } else if (opcao == 3) {
            System.out.println("Próximo funcionário");

        } else {
            System.out.println("Opção inválida");
        }
    }

    public void escolheOpcao2(int opcao) {
        if (opcao == 1) {
            statusFerias = true;
            System.out.println("O funcionário está de férias" + this.statusFerias);
            System.out.println("O nome do funcionário é: " + this.nome);
            System.out.println("A idade dele é : " + this.idade + " anos ");
            System.out.println("O salário dele é : R$ " + this.salario);
            System.out.println("Tecle 3 para o próximo funcionário\n");
            
        } else if (opcao == 2) {
            statusFerias = false;
            System.out.println("O funcionário não está de férias," + this.statusFerias);
            System.out.println("O nome do funcionário é: " + this.nome);
            System.out.println("A idade dele é : " + this.idade + " anos ");
            System.out.println("O salário dele é : R$ " + this.salario);
            System.out.println("Tecle 3 para o próximo funcionário\n");

        } else if (opcao == 3) {
            System.out.println("Próximo funcionário");

        } else {
            System.out.println("Opção inválida");
        }
    }

    public void escolheOpcao3(int opcao) {
        if (opcao == 1) {
            statusFerias = true;
            System.out.println("O funcionário está de férias" + this.statusFerias);
            System.out.println("O nome do funcionário é: " + this.nome);
            System.out.println("A idade dele é : " + this.idade + " anos ");
            System.out.println("O salário dele é : R$ " + this.salario);
            System.exit(0);

        } else if (opcao == 2) {
            statusFerias = false;
            System.out.println("O funcionário não está de férias," + this.statusFerias);
            System.out.println("O nome do funcionário é: " + this.nome);
            System.out.println("A idade dele é : " + this.idade + " anos ");
            System.out.println("O salário dele é : R$ " + this.salario);
            System.exit(0);

        } else {
            System.out.println("Opção inválida");
        }
    }

    public void iniciar() {
        int opcao = -1;
        do {
            this.exibeMenu();
            opcao = this.scan.nextInt();
            this.escolheOpcao(opcao);

        } while (opcao != 3);
    }

    public void iniciar2() {
        int opcao = -1;
        do {
            this.exibeMenu();
            opcao = this.scan.nextInt();
            this.escolheOpcao2(opcao);

        } while (opcao != 3);
    }

    public void iniciar3() {
        int opcao = -1;
        do {
            this.exibeMenu();
            opcao = this.scan.nextInt();
            this.escolheOpcao3(opcao);

        } while (opcao != 3);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean statusFerias() {
        return statusFerias;
    }

}
