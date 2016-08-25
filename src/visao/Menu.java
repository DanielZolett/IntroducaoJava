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
        System.out.println("@@@@@@@ Menu @@@@@@@");
        System.out.println("^^^^^^ Iluminate ^^^^^^");
        System.out.println("Seleção de obção ");
        System.out.println("1) Cadastro de quipamento ");
        System.out.println("2) Lista de equipamentos ");
        System.out.println("O que voce quer ");
        
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;
        
        do{
            try{
                opcao = Integer.parseInt(entrada.nextLine());
                System.out.println("O usuario digitou: " + opcao);                
            }catch(Exception e){
                System.out.println("Não deu certo. Informe outro ");
            }
        }while(opcao != 1 && opcao != 2);
        if (opcao == 1){
            EquipamentoVisao.exibirFormLariCadastroEquipamento();
        }      
    
    }
    
}
