/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 5943280
 */
public class EquipamentoVisao {
    public static void exibirFormLariCadastroEquipamento(){
        System.out.println("===== TERLA DE EQUIPAMENTO =====");
        Scanner entrada = new Scanner (System.in);
        
        String nome,patrimonio;
        Date dataAquisicao,dataTerminoGarantia;
        float valor;
        
        System.out.println("Informe nome: ");
        nome = entrada.nextLine();
        System.out.println("Irfome o numero do patrimonio");
        patrimonio = entrada.nextLine();
        System.out.println("Informe a data de aquisiçõa");
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        do{
            try{
                dataAquisicao = formatadorData.parse(entrada.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Seu borro data errada");
            }
        }while(true);
        System.out.println("Informe data de termino da garantia");
        do{
            try{
                dataTerminoGarantia = formatadorData.parse(entrada.nextLine());
                if(dataTerminoGarantia.after(dataAquisicao)){
                    break;
                }else{
                    System.out.println("Data da garantia tem que ser maior");
                }
            }catch(Exception e){
                System.out.println("Seu borro data errada");
            }
        }while(true);
        System.out.println("Informew valor");
        do{
            try{
                valor = Float.parseFloat(entrada.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Seu borro valor errada");
            }
        }while(true);
    }
}
