/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;
import java.util.Scanner;
/**
 *
 * @author lucasbezerra
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a1 = new Aluno();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        a1.nome = teclado.nextLine();
        
        System.out.print("Nota do aluno: ");
        a1.setNota(teclado.nextFloat());
        
        System.out.print("Numero de faltas: ");
        a1.setFaltas(teclado.nextInt());
        
        System.out.println(a1.gerarHist());
        
        
    }
    
}
