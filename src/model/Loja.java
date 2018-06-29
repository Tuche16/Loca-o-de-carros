/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pedro
 */
public class Loja {
    private String nome;
    private int taxa[][] = new int[2][2]; //primeiro [] representa tipo de cliente, segundo [] representa dias da semana
    private String carro;
    private int limitePessoas;
    
    public Loja(String nome, int taxa[][], String carro, int limitePessoas){
        this.setNome(nome);
        this.setTaxa(taxa);
        this.setCarro(carro);
        this.setLimitePessoas(limitePessoas);
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
     * @return the taxa
     */
    public int[][] getTaxa() {
        return taxa;
    }

    /**
     * @param taxa the taxa to set
     */
    public void setTaxa(int[][] taxa) {
        this.taxa = taxa;
    }

    /**
     * @return the carro
     */
    public String getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(String carro) {
        this.carro = carro;
    }
    
    /**
     * @return the limitePessoas
     */
    public int getLimitePessoas() {
        return limitePessoas;
    }

    /**
     * @param limitePessoas the limitePessoas to set
     */
    public void setLimitePessoas(int limitePessoas) {
        this.limitePessoas = limitePessoas;
    }
    
    public int valorLocacao(String tipoCarro, int quantidadePessoas, String intervaloLocacao[]){
        int valor=0,tipoCarroNum;
        int quantidadeDias=intervaloLocacao.length;
        if(quantidadePessoas<=this.getLimitePessoas()){
            
            if(tipoCarro.equals("Normal")){
                tipoCarroNum=0;
            }
            else{
                tipoCarroNum=1;
            }
            
            for(int i=0;i<quantidadeDias;i++){
                if(intervaloLocacao[i].substring(11, 14).equals("sab")||intervaloLocacao[i].substring(11, 14).equals("dom")){
                    valor+=this.getTaxa()[tipoCarroNum][1];
                }
                else{
                    valor+=this.getTaxa()[tipoCarroNum][0];
                }
            }
        }
        
        return valor;
    }
    
}
