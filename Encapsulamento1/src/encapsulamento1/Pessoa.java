/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento1;

/**
 *
 * @author lucasbezerra
 */
public class Pessoa {
    private int codigo;
    public String nome;
    protected String cpf;
        String endereco;
    
    private void setCodigo(int codigon){
        this.codigo = codigon;
    }
    public void setNome(String nomen){
        this.nome = nomen;
    }
    protected void setCpf(String cpf){
        this.cpf = cpf;
    }
    void setEndereco(String end){
        this.endereco = end;
    }
    private int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    protected String getCpf(){
            return this.cpf;
    }
    String getEnd(){
        return this.endereco;
    }
    
        
    
}
