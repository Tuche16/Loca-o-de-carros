package view;

import controller.LojaController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Pedro
 */
public class InterfacePrincipal extends javax.swing.JFrame {
    LojaController lojaController = new LojaController(); //objeto para manipulação das lojas
    File file; //caminho do arquivo txt
    int cont,m; //auxiliadores de leitura
    
    public InterfacePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf = new javax.swing.JFileChooser();
        painelGeral = new javax.swing.JLayeredPane();
        painelEntrada = new javax.swing.JPanel();
        painelComGuias = new javax.swing.JTabbedPane();
        painelArquivo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btBrowser = new javax.swing.JButton();
        btVerificar = new javax.swing.JButton();
        lbArquivo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        painelSaida = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbLoja = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbCarro = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo de melhor locação");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        painelArquivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setText("Selecione o arquivo TXT");

        btBrowser.setText("...");
        btBrowser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBrowserActionPerformed(evt);
            }
        });

        btVerificar.setText("Verificar");
        btVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Arquivo carregado:");

        javax.swing.GroupLayout painelArquivoLayout = new javax.swing.GroupLayout(painelArquivo);
        painelArquivo.setLayout(painelArquivoLayout);
        painelArquivoLayout.setHorizontalGroup(
            painelArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelArquivoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btVerificar))
                    .addGroup(painelArquivoLayout.createSequentialGroup()
                        .addGroup(painelArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelArquivoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painelArquivoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        painelArquivoLayout.setVerticalGroup(
            painelArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBrowser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVerificar)
                .addGap(48, 48, 48))
        );

        painelComGuias.addTab("Arquivo TXT", painelArquivo);

        javax.swing.GroupLayout painelEntradaLayout = new javax.swing.GroupLayout(painelEntrada);
        painelEntrada.setLayout(painelEntradaLayout);
        painelEntradaLayout.setHorizontalGroup(
            painelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelComGuias)
                .addContainerGap())
        );
        painelEntradaLayout.setVerticalGroup(
            painelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelComGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 196, Short.MAX_VALUE)
        );

        painelSaida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Loja:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Carro selecionado:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Valor total:");

        javax.swing.GroupLayout painelSaidaLayout = new javax.swing.GroupLayout(painelSaida);
        painelSaida.setLayout(painelSaidaLayout);
        painelSaidaLayout.setHorizontalGroup(
            painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(lbLoja, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(lbCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        painelSaidaLayout.setVerticalGroup(
            painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaidaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel2.setText("Resultado:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        painelGeral.setLayer(painelEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelGeral.setLayer(painelSaida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelGeral.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelGeral.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelGeralLayout = new javax.swing.GroupLayout(painelGeral);
        painelGeral.setLayout(painelGeralLayout);
        painelGeralLayout.setHorizontalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGeralLayout.createSequentialGroup()
                .addComponent(painelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        painelGeralLayout.setVerticalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGeralLayout.createSequentialGroup()
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGeralLayout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelGeralLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(painelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelGeralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelGeral)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //método responsável por carregar o arquivo TXT no sistema pelo botão clicado
    private void btBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBrowserActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text"); //filtra somente arquivos txt
        jf.setFileFilter(filter); //atribui filtro
        int returnVal = jf.showOpenDialog(this); //abre janela para buscar arquivo
        
        if (returnVal == JFileChooser.APPROVE_OPTION) { //arquivo selecionado
            file = jf.getSelectedFile(); //atribui o caminho para utilizar arquivo
            this.lbArquivo.setText(file.getName()); //atribui nome do arquivo a Label da interface
        }
    }//GEN-LAST:event_btBrowserActionPerformed
    
    //método responsável por retornar o texto presente no arquivo
    private String leituraArquivo(){
        BufferedReader br; //leitor do arquivo
        StringBuilder sb = new StringBuilder(); //constroi strings pela leitura do arquivo
        try {
            br = new BufferedReader(new FileReader(file)); //recebe caminho do arquivo
            String leitura = br.readLine(); //leitura de cada linha do arquivo (neste caso somente uma)
            sb.append(leitura); //salva texto
        } 
        catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado!");
        } 
        catch (IOException e) {
            System.err.println("Erro de entrada de dados!");
        }
        finally{
            return sb.toString(); //retorna texto
        }
        
    }
    
    //método responsável por separar e retornar o tipo de carro e a quantidade de pessoas do texto do arquivo TXT
    private String[] leituraTipoCarroPassageiro(String texto){
        String tipoCarro=""; //inicializa o atributo que conterá o tipo de carro
        String quantidadePessoas=""; //inicializa o atributo que conterá a quantidade de pessoas
        m=0; //inicializa auxiliar de leitura
        cont=0; //inicializa auxiliar de leitura, 0 = leitura do tipo de carro, 1 = leitura da quantidade de pessoas
        
        //laço responsável por ler cada caracter do texto do arquivo TXT
        for(int i=0;i<texto.length();i++){
            if(texto.charAt(i)!=':'&&cont==0){ //enquanto não encontrar ':'
                tipoCarro+=texto.charAt(i); //atributo recebe os caracteres do tipo de carro
            }

            if(texto.charAt(i)!=':'&&cont==1){ //enquanto não encontrar ':'
                quantidadePessoas+=texto.charAt(i); //atributo recebe os caracteres da quantidade de pessoas
            }
                
            if(texto.charAt(i)==':'&&cont==1){ //se encontrar o caracter ':' e cont = 1
                m=i+1; //armazena próximo caracter a ser lido na leitura das datas
                break; //interrompe o laço, leitura finalizada
            }
                
            if(texto.charAt(i)==':'){ //se encontrar o caracter ':'
                cont++; //termina a leitura do tipo de carro
            }   
        }
        
        return new String[]{tipoCarro,quantidadePessoas}; //retorna vetor de string com o tipo de carro e a quantidade de pessoas
    }
    
    //método responsável por separar e retornar as datas do texto do arquivo TXT
    private String[] leituraData(String texto){ 
        //verifica e armazena a quantidade de datas pela quantidade de ','
        int numDatas=(int)texto.chars().filter(ch -> ch == ',').count(); 
        String intervaloLocacao[] = new String[numDatas+1]; //determina a quantidade de datas no vetor das datas
        
        //laço responsável por preencher cada vetor das datas
        for(int n=0; n <= numDatas; n++){
            intervaloLocacao[n]=""; //inicializa o texto de uma data
            
            //laço responsável por ler cada caracter do texto do arquivo TXT a partir da posição da última leitura
            for(int i=m; i < texto.length(); i++){
                if(texto.charAt(i)!=','){ //enquanto não encontrar ',' no texto
                    intervaloLocacao[n]+=texto.charAt(i); //atributo recebe os caracteres da data
                }
                else{ //se encontrar ',' no texto
                    m=i+2; //pula duas posições no texto a partir da atual
                    break; //interrompe laço e termina a leitura de UMA data
                }
            }
        }
        return intervaloLocacao; //retorna vetor de string que contém as datas de locação
    }
    
    //método responsável por chamar os métodos de leitura e cálculo dos valores de locação a partir do clique do botão 'Verificar'
    private void btVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarActionPerformed

            String texto = this.leituraArquivo(); //texto do arquivo TXT
            String resultadoLeitura1[]=this.leituraTipoCarroPassageiro(texto); //separa o tipo de carro e quantidade de passageiros
            String resultadoleitura2[]=this.leituraData(texto); //separa as datas de locação
            
            /*recebe os resultados da melhor loja após os cálculos dos valores de locação para cada loja de acordo com o tipo de 
            carro, quantidade de pessoas e datas*/
            String resultado[]=this.lojaController.compararLojas(resultadoLeitura1[0], Integer.parseInt(resultadoLeitura1[1]), resultadoleitura2);
            
            this.lbLoja.setText(resultado[0]); //atribui o nome da loja com melhor resultado a uma Label da interface
            this.lbCarro.setText(resultado[1]); //atribui o modelo do carro da loja com melhor resultado a uma Label da interface
            this.lbTotal.setText("R$ "+resultado[2]); //atribui o valor total da locação a uma Label da interface
            System.out.println(resultado[1]+":"+resultado[0]); //printa o '<CARROS_DISPONIVEIS:LOCADORA>'

    }//GEN-LAST:event_btVerificarActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBrowser;
    private javax.swing.JButton btVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFileChooser jf;
    private javax.swing.JLabel lbArquivo;
    private javax.swing.JLabel lbCarro;
    private javax.swing.JLabel lbLoja;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel painelArquivo;
    private javax.swing.JTabbedPane painelComGuias;
    private javax.swing.JPanel painelEntrada;
    private javax.swing.JLayeredPane painelGeral;
    private javax.swing.JPanel painelSaida;
    // End of variables declaration//GEN-END:variables

}
