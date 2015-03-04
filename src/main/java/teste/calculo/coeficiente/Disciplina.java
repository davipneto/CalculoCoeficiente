/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.calculo.coeficiente;

/**
 *
 * @author davip_000
 */
public class Disciplina {
    
    private String descricao;
    private int peso;
    private double nota;
    
    public Disciplina(String descricao){
        this.descricao = descricao;
    }
    
    public Disciplina(String descricao, int peso, double nota){
        this.descricao = descricao;
        this.peso = peso;
        this.nota = nota;
    }

    public int getPeso() {
        return peso;
    }

    public double getNota() {
        return nota;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
