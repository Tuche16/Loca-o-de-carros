package model;

/**
 *
 * @author Pedro
 */
public final class Loja {

    private String nome; //nome da loja
    private int taxa[][] = new int[2][2]; //primeiro [] representa tipo de cliente, segundo [] representa dias da semana
    private String carro; //modelo do carro
    private boolean disponivel=true; //disponibilidade do carro
    private int limitePessoas; //limite de pessoas no carro
    
    //inicializa os atributos ao instânciar cada objeto da loja
    public Loja(String nome, int taxa[][], String carro, int limitePessoas){ 
        this.setNome(nome);
        this.setTaxa(taxa);
        this.setCarro(carro);
        this.setLimitePessoas(limitePessoas);
    }
    
    //inicio do bloco de getters e setters de cada atributo da classe
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[][] getTaxa() {
        return taxa;
    }

    public void setTaxa(int[][] taxa) {
        this.taxa = taxa;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
    
    public int getLimitePessoas() {
        return limitePessoas;
    }

    public void setLimitePessoas(int limitePessoas) {
        this.limitePessoas = limitePessoas;
    }
    //fim do bloco de getters e setters
    
    //método responsável por calcular o valor de locação dependendo dos valores passados por parâmetro
    public int valorLocacao(String tipoCarro, int quantidadePessoas, String intervaloLocacao[]){
        
        int valor=0,tipoCarroNum=0; //inicializa os valores
        int quantidadeDias=intervaloLocacao.length; //pega a quantidade de dias de locação pelo vetor que contém as datas
        
        //se a quantidade de pessoas for menor que o limite e há carro disponível, o valor da locação é calculado
        if(quantidadePessoas<=this.getLimitePessoas()&&this.isDisponivel()){ 
            if(!tipoCarro.equals("Normal")){ //verifica o tipo de carro, normal ou premmium, mudando o atributo para 1 caso premmium
                tipoCarroNum=1;
            }
            
            for(int i=0;i<quantidadeDias;i++){ //laço responsável por calcular cada dia de locação
                
                //se o dia da locação for final de semana
                if(intervaloLocacao[i].substring(11, 14).equals("sab")||intervaloLocacao[i].substring(11, 14).equals("dom")){
                    valor+=this.getTaxa()[tipoCarroNum][1]; //acumula o valor da locação a cada iteração
                }
                else{ //senão
                    valor+=this.getTaxa()[tipoCarroNum][0]; //acumula o valor da locação a cada iteração
                }
            }
        }      
        return valor; //retorna 0 se ultrapassar o limite de pessoas ou não houver carro disponível, senão retorna o valor calculado
    }
    
}
