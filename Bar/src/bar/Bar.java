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
public class Bar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto cerveja = new Produto("Budweiser"); 
        
        cerveja.compra(15, 3.5f);
        cerveja.venda(20);
        
        System.out.println(""+cerveja.mostrarProdutoEmEstoque());
        
    }
    
}
