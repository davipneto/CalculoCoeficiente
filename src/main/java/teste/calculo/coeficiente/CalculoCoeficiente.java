/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.calculo.coeficiente;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author davip_000
 */
public class CalculoCoeficiente {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        ProcessaAluno p1 = new ProcessaAluno("exemplo1.txt");
        Alunos alunos = p1.getAlunos();
    
        /*Alunos alunos = new Alunos();
        alunos.registraAlunos();*/
        System.out.println("1 - Consultar Aluno\n2 - Registrar Aluno\n0 - Sair");
        Scanner s = new Scanner(System.in),string = new Scanner(System.in);
        int opcao = s.nextInt();
        do{
            if(opcao==1){
                System.out.println("Digite o código do Aluno desejado: ");
                Aluno aluno;
                long codigo = s.nextLong();
                aluno = alunos.retornaAluno(codigo);
                if(aluno == null)
                    System.out.println("Aluno não encontrado");
                else
                    System.out.println(aluno + "\nCoeficiente: " + aluno.getCoeficiente());
            }
            else if(opcao == 2){
                System.out.println("------REGISTRO DE NOVO ALUNO------");
                System.out.println("Aluno: ");
                String nome = string.nextLine();
                System.out.println("Código: ");
                long codigo = s.nextLong();
                alunos.insereAluno(new Aluno(nome,codigo));
                System.out.println("Deseja cadastrar as disciplinas? (y/n)");
                char opcaodisciplina = s.next().charAt(0);
                if(opcaodisciplina == 'y'){
                    do{
                        System.out.println("Descrição: ");
                        String descricao = string.nextLine();
                        System.out.println("Peso: ");
                        int peso = s.nextInt();
                        System.out.println("Nota: ");
                        double nota = s.nextDouble();
                        alunos.getAlunos().get(alunos.getAlunos().size()-1).inserirDisciplina(new Disciplina(descricao,peso,nota));
                        System.out.println("Deseja cadastrar mais disciplinas? (y/n)");
                        opcaodisciplina = s.next().charAt(0);
                    }while(opcaodisciplina == 'y');
                }
            }
            System.out.println("1 - Consultar Aluno\n2 - Registrar Aluno\n0 - Sair");
            opcao = s.nextInt();
        }while(opcao!=0);
    }
}
    
