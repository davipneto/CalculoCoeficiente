/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.calculo.coeficiente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davip_000
 */
public class Alunos {
    
    private List<Aluno> alunos;
    
    public Alunos(){
        alunos = new ArrayList<>();
    }
    
    public Alunos(List<Aluno> alunos){
        this.alunos = alunos;
    }
    
    public void insereAluno(Aluno a){
        alunos.add(a);
    }
    
    /*public void registraAlunos(){
        Aluno bruna = new Aluno("Bruna", 1608398);
        insereAluno(bruna);
        bruna.inserirDisciplina(new Disciplina("Tecnologia e Sociedade",2,9.2));
        bruna.inserirDisciplina(new Disciplina("Física 1",5,8.2));
        bruna.inserirDisciplina(new Disciplina("Lógica para Computação",4,8));
        bruna.inserirDisciplina(new Disciplina("Fundamentos de Programação 1",6,6.7));
        bruna.inserirDisciplina(new Disciplina("Cálculo Diferencial e Integral 1",6,8.8));
        bruna.inserirDisciplina(new Disciplina("Geometria Analítica e Álgebra Linear",6,8.6));
    }*/

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    /*public Aluno retornaAluno(String nome){
        for(Aluno al: alunos){
            if(al.getNome().equals(nome)){
                return al;
                }
            }
        return null;    
    }*/
    
    public Aluno retornaAluno(long codigo){
        for(Aluno al: alunos){
            if(al.getCodigo() == codigo){
                return al;
            }
        }
        return null;
    }
    
}
