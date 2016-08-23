/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.Scanner;

/**
 *
 * @author 5943280
 */
public class Menu {
    
    public static void exibirMenu(){
        System.out.println("geri geri Menu geri geri ");
        System.out.println("Seleção de obção ");
        System.out.println("1) Cadastro de quipamento ");
        System.out.println("2) Lista de equipamentos ");
        System.out.println("O que voce quer ");
        
        Scanner entrada = new Scanner (System.in);
        
        try{
            int opcao = entrada.nextInt();
            System.out.println(" o usuario digitou: " + opcao);
        }catch(Exception e){
            System.out.println("cha de se burro muleke " + e.getClass());
        }
        
        
    
    }
    
}
