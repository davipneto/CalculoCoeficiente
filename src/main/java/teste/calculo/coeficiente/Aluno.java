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
public class Aluno {
    
    private String nome;
    private long codigo;
    private List<Disciplina> disciplinas;
    
    public Aluno(String nome, long codigo){
        this.nome = nome;
        this.codigo = codigo;
        disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void inserirDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
    public double getCoeficiente(){
        double nota, soma = 0;
        int peso, pesos = 0;
        for(Disciplina d: disciplinas){
            nota = d.getNota();
            peso = d.getPeso();
            pesos += peso;
            soma += nota*peso;
        }
        return 0.1*soma/pesos;
    }
    
    @Override
    public String toString(){
        return codigo + " - " + nome;
    }
}
