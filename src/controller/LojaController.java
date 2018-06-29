/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Loja;
/**
 *
 * @author Pedro
 */
public final class LojaController {
    
    private final Loja[] loja=new Loja[3];
    
    public LojaController(){
        loja[0]=new Loja("SouthCar",new int[][]{{210,200},{150,90}},"COMPACTO",4);
        loja[1]=new Loja("WestCar",new int[][]{{530,200},{150,90}},"FERRARI",2);
        loja[2]=new Loja("NorthCar",new int[][]{{630,600},{580,590}},"NAVIGATOR",7);
    }
    
    public String[] compararLojas(String tipoCarro, int quantidadePessoas, String intervaloLocacao[]){

        int resultadoLoja[]=new int[3]; //valor encontrado para a loja
        int indMenorAtual=0; //indice do menor valor encontrado a cada comparação
        
        for(int i=0;i<3;i++){
            resultadoLoja[i]=loja[i].valorLocacao(tipoCarro, quantidadePessoas, intervaloLocacao);
        }
        
        if(resultadoLoja[0]>0&&resultadoLoja[1]>0&&resultadoLoja[0]<resultadoLoja[1]||resultadoLoja[1]==0){
            indMenorAtual=0;
        }
        else if(resultadoLoja[0]==0){
            indMenorAtual=1;
        }
        
        if(resultadoLoja[0]>0&&resultadoLoja[1]>0&&resultadoLoja[1]<resultadoLoja[0]||resultadoLoja[0]==0){
            indMenorAtual=1;
        }
        else if(resultadoLoja[1]==0){
            indMenorAtual=0;
        }
        
        if(resultadoLoja[indMenorAtual]>0&&resultadoLoja[2]>0&&resultadoLoja[2]<resultadoLoja[indMenorAtual]||resultadoLoja[indMenorAtual]==0){
            indMenorAtual=2;
        }
                
        return new String[]{loja[indMenorAtual].getNome(),loja[indMenorAtual].getCarro(),String.valueOf(resultadoLoja[indMenorAtual])};
    }
}
