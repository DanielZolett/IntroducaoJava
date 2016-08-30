/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import armazenamento.meioArmazenamento;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 5943280
 */
public class Equipamento {
    private String nome,patrimonio;
    private Date dataAquisicao,dataTerminoGarantia;
    private float valor;
    private ArrayList<Munutencao> ListaManutencao;
    
    public Equipamento(){
        this. ListaManutencao = new ArrayList();
    }
    
    public ArrayList<Munutencao> getListaManutencao(){
        return this.ListaManutencao;
    }
    
    public static ArrayList<Equipamento> obterLista(){
        return meioArmazenamento.MEIO_ARMAZENAMENTO_EQUIPAMENTOS;
    }
    
    public void salvar(){
        meioArmazenamento.MEIO_ARMAZENAMENTO_EQUIPAMENTOS.add(this);
    }
    
    public static Equipamento obterPeloNumero (String numeroPatrimonio){
        for (Equipamento objDaVez : Equipamento.obterLista()){
            if (objDaVez.getPatrimonio().equals(numeroPatrimonio)){
                return objDaVez;
            }
        }
        return null;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the patrimonio
     */
    public String getPatrimonio() {
        return patrimonio;
    }

    /**
     * @param patrimonio the patrimonio to set
     */
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    /**
     * @return the dataAquisicao
     */
    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    /**
     * @param dataAquisicao the dataAquisicao to set
     */
    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    /**
     * @return the dataTerminoGarantia
     */
    public Date getDataTerminoGarantia() {
        return dataTerminoGarantia;
    }

    /**
     * @param dataTerminoGarantia the dataTerminoGarantia to set
     */
    public void setDataTerminoGarantia(Date dataTerminoGarantia) {
        this.dataTerminoGarantia = dataTerminoGarantia;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
