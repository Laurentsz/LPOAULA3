/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author RaaiL
 */
public class Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FuncionarioApp funcionarioUm = new FuncionarioApp ();
        funcionarioUm.setSalario(222);
        funcionarioUm.setIdade(22);
        funcionarioUm.setNome("Pedrin");
        funcionarioUm.statusFerias();
        funcionarioUm.iniciar();
        
        FuncionarioApp funcionarioDois = new FuncionarioApp ();
        funcionarioDois.setSalario(2542);
        funcionarioDois.setIdade(52);
        funcionarioDois.setNome("Rodrigo");
        funcionarioDois.statusFerias();
        funcionarioDois.iniciar2();
        
        FuncionarioApp funcionarioTres = new FuncionarioApp ();
        funcionarioTres.setSalario(2542);
        funcionarioTres.setIdade(52);
        funcionarioTres.setNome("Rogério");
        funcionarioTres.statusFerias();
        funcionarioTres.iniciar3();
    }

}
        
        
        

