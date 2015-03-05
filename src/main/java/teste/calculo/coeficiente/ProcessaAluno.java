/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.calculo.coeficiente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davip_000
 */
public class ProcessaAluno {
    private BufferedReader reader;
    
    public ProcessaAluno(File arquivo) throws FileNotFoundException{
        reader = new BufferedReader(new FileReader(arquivo));
    }
    
    public ProcessaAluno(String caminho) throws FileNotFoundException{
        this(new File(caminho));
    }
    
    private String getNextLine() throws IOException{
        return reader.readLine();
    }
    
    private String processaAluno() throws IOException{
        String aluno = "", leitura = getNextLine();
        if(leitura.contains("FIM"))
            return null;
        while(!leitura.isEmpty()){
            aluno += (leitura+"\n");
            leitura = getNextLine();
        }
        return aluno;
    }
    
    private Aluno getAluno() throws IOException{
        String aluno = processaAluno();
        if(aluno == null)
            return null;
        BufferedReader braluno = new BufferedReader(new StringReader(aluno));
        String nome = braluno.readLine();
        long codigo = Long.parseLong(braluno.readLine());
        Aluno a = new Aluno(nome,codigo);
        String leitura = braluno.readLine();
        while(leitura != null){
            StringReader sraluno = new StringReader(leitura);
            int i;
            for(i=0; sraluno.read() != '-'; i++){}
            String descricao = leitura.substring(0, i);
            int inicio = i+1;
            int peso = Integer.valueOf(leitura.substring(inicio, inicio+1));
            String resto = leitura.substring(inicio + 2);
            double nota = Double.valueOf(resto);
            a.inserirDisciplina(new Disciplina(descricao,peso,nota));
            leitura = braluno.readLine();
        }
        return a;
    }
    
    public Alunos getAlunos() throws IOException{
        List<Aluno> alunos = new ArrayList<>();
        Aluno a = getAluno();
        while(a != null){
            alunos.add(a);
            a = getAluno();
        }
        return new Alunos(alunos);
    }
    
}
