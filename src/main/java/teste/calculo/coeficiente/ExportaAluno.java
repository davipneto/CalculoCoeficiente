/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.calculo.coeficiente;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author davip_000
 */
public class ExportaAluno {
    
    private BufferedWriter writer;
    
    public BufferedWriter getWriter(){
        return writer;
    }
    
    public ExportaAluno(String path) throws IOException{
        writer = new BufferedWriter(new FileWriter(new File(path)));
    }
    
    private void exportaAluno(Aluno aluno) throws IOException{
        writer.write(aluno.getNome());
        writer.newLine();
        writer.write(String.valueOf(aluno.getCodigo()));
        writer.newLine();
        for(int i=0;i<aluno.getDisciplinas().size();i++){
            writer.write(aluno.getDisciplinas().get(i).toString());
            writer.newLine();
        }
    }
    
    public void exportaAlunos(Alunos alunos) throws IOException{
        for(int i=0;i<alunos.getAlunos().size();i++){
            exportaAluno(alunos.getAlunos().get(i));
            writer.newLine();
        }
        writer.write("FIM");
        writer.close();
    }
    
}
