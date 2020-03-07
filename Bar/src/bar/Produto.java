/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

/**
 *
 * @author lucasbezerra
 */
public class Produto {
    
    private String nome;
    private int quantidade;
    private float precoVenda;
    private float precoCusto;
    
    public Produto(){
        quantidade = 0;
    }
    public Produto(String nome){
        this.nome = nome;
        quantidade = 0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    private void setPrecoVenda(float precoVenda){
        this.precoVenda = precoVenda;
    }
    private void setPrecoCusto(float precoCusto){
        this.precoCusto = precoCusto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public float getPrecoVenda(){
        return precoVenda;
    }
    public float getPrecoCusto(){
        return precoCusto;
    }
    
    public void compra(int quantidade, float precoCusto){
        this.setQuantidade(this.quantidade+=quantidade);
        
        if(this.precoCusto!= precoCusto){
            
            this.setPrecoCusto(precoCusto);            
            this.setPrecoVenda(precoCusto+(precoCusto/2));
        }
    }
    public void venda(int quantidade){
        if(quantidade < this.quantidade){
            this.setQuantidade(this.quantidade-=quantidade);
        }
        
    }
    
    public String mostrarProdutoEmEstoque(){
        return "\n"+this.getNome()+"\nQuantidade em estoque: "+this.getQuantidade()+"\n Preço de venda: "+this.getPrecoVenda()+"\n Preco de custo: "+this.getPrecoCusto()+"\n Gasto total com o estoque: "+(this.getQuantidade()*this.getPrecoCusto());
    }
}
