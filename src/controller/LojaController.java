package controller;
import model.Loja;
/**
 *
 * @author Pedro
 */
public final class LojaController {
    
    private final Loja[] loja=new Loja[3];
    
    public LojaController(){
        loja[0]=new Loja("SouthCar",new int[][]{{210,200},{150,90}},"COMPACTO",4); //inicializa a loja 1, definindo todos atributos do objeto
        loja[1]=new Loja("WestCar",new int[][]{{530,200},{150,90}},"FERRARI",2); //inicializa a loja 2, definindo todos atributos do objeto
        loja[2]=new Loja("NorthCar",new int[][]{{630,600},{580,590}},"NAVIGATOR",7); //inicializa a loja 2, definindo todos atributos do objeto
    }
    
    
    
    public String[] compararLojas(String tipoCarro, int quantidadePessoas, String intervaloLocacao[]){
        int resultadoLoja[]=new int[3]; //valor encontrado para cada loja
        int indMenorAtual=0; //indice do menor valor encontrado a cada comparação
        
        for(int i=0;i<3;i++){ // laço responsável por chamar método que calcula os valores de uma locação requisitada
            resultadoLoja[i]=loja[i].valorLocacao(tipoCarro, quantidadePessoas, intervaloLocacao); // recebe o valor calculado de cada loja
        }
        
        //bloco de comparações dos valores de locação obtidos pelo for acima
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
        //fim do bloco de comparações, o índice com o menor valor != 0 é o índice da loja recomendada
        
        
        if(!this.loja[indMenorAtual].isDisponivel()){ //verifica se a loja escolhida não possuí carros disponíveis
            //retorna não há carros disponíveis
            return new String[]{"Não há carros disponíveis","Não há carros disponíveis","Não há carros disponíveis"}; 
        }
        else{ //quando há carros disponíveis
            this.loja[indMenorAtual].setDisponivel(false); //muda o atributo que define se há carros disponíveis na loja
        
            //retorna o nome da loja, carro da loja e o valor total da locação(não requisitado no problema)
            return new String[]{loja[indMenorAtual].getNome(),loja[indMenorAtual].getCarro(),String.valueOf(resultadoLoja[indMenorAtual])};
        } 
    }
}
