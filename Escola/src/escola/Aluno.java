/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author lucasbezerra
 */
public class Aluno {
    public String nome;
    private int numFaltas;
    private float notaFinal;
    private char status;
    
    public Aluno(String nome){
    status = 'C';
    this.nome = nome;    
}
    public Aluno(String nome, int numFaltas, float nota){
    status = 'C';
    this.nome = nome;
    this.setFaltas(numFaltas);
    this.setNota(nota);
}
    public Aluno(){
        this("");
    }
    
    public void setNota(float nota){
        this.notaFinal = nota;
        
        if(nota<60){
            this.setStatus('R');
        } else {
            this.setStatus('A');
        }
    }
    
    public float getNota(){
        return this.notaFinal;
    }
    
    private void setStatus(char resultado){
        this.status = resultado;
    }
    public String getStatus(){
        if(this.status == 'A'){
            return "APROVADO";
        } else if(status == 'R'){
            return "REPROVADO";
        } else {
            return "CURSANDO";
        }
    }
    public void setFaltas(int numFaltas){
        this.numFaltas = numFaltas;
        if(numFaltas > 12){
            this.setStatus('R');
        }
    }
    public int getFaltas(){
        return this.numFaltas;
    }
    public String gerarHist(){
        return "\nAluno: "+nome+"\nStatus: "+this.getStatus()+"\nNumero de faltas: "+this.getFaltas()+"\nNota Final: "+this.getNota();
    }
}
