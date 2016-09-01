/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.EquipamentoControle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import modelo.Equipamento;

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
        EquipamentoControle.receberDaadosCadastroEquipamento(nome, patrimonio, dataAquisicao, dataTerminoGarantia, valor);
        Menu.exibirMenu();
    }
    public static void exibirListagemEquipamento(){
        System.out.println("Tela de listagem");
        System.out.println("NOME \t Data Aquisição \t Numero de matunções");
        ArrayList<Equipamento> lista = EquipamentoControle.obterListaEquipamentos();
        for (int i =0;i<lista.size();i++){
            System.out.println(lista.get(i).getNome()+" \t " + lista.get(i).getDataAquisicao() + "\t" + lista.get(i).getListaManutencao().size());
        }
        System.out.println("OQUE deseja");
        System.out.println("0) Voltar ao menu");
        System.out.println("Numero patrimonio ) Cadastrar manutenção paar equipamento");
        
        Scanner entrada = new Scanner (System.in);
        String valorDigitado = entrada.nextLine();
        if (entrada.equals("0")){
            Menu.exibirMenu();
        }else{
            Equipamento encontrado = EquipamentoControle.obterEquipamentoPeloNumeroDoPatrimonio(valorDigitado);
            if (encontrado == null){
                System.out.println("ERRO: Não encontrado");
                Menu.exibirMenu();
            }else{
                MunutencaoVisao.exibirFormularioCadastroManutencao(valorDigitado);                                                  
            }
        }
        
        
    }
}
