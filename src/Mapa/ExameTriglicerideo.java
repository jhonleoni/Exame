package Mapa;

import javax.swing.JOptionPane;

public class ExameTriglicerideo extends Exames {

    private String vlrTriglicerideoString;
    private int vlrTriglicerideo;
    private final int anoAtual;
    private String idade;
    private int idadeInt;

    public ExameTriglicerideo(int anoAtual) {
        super(); // Chama o construtor da classe pai (Exames)
        this.anoAtual = anoAtual;
    }

    
    
    
    @Override
    public void cadastrarExame(){
        this.setNomePaciente(JOptionPane.showInputDialog(null, "Olá! Como você se chama?"));
        this.setTipoSanguinio(JOptionPane.showInputDialog(null, "Qual seu tipo sanguínio?"));
        
        String anoNascimentoString =JOptionPane.showInputDialog(null, "Qual seu ano de nascimento?");
        int anoNas = Integer.parseInt(anoNascimentoString);
        this.setAnoNascimento(anoNas);
        
        int idadeCalculada = anoAtual - anoNas;
        this.idade = String.valueOf(idadeCalculada);
        
        vlrTriglicerideoString = JOptionPane.showInputDialog(null, "Digite a quantidade de triglicerideo");
        
    }
    
    @Override
    public String classificarResultado(){
        int idadeInt = Integer.parseInt(this.idade);
                
        this.vlrTriglicerideo = Integer.parseInt(this.vlrTriglicerideoString);
        if(this.idadeInt <= 9 && this.vlrTriglicerideo < 75){
            return "Triglicerideo normal";
        }else if(this.idadeInt >= 10 && this.idadeInt <= 19 && this.vlrTriglicerideo < 90){
            return "Triglicerideo normal";
        }else if(this.idadeInt > 20 && this.vlrTriglicerideo < 150){
            return "Triglicerideo normal";
        }else {
            return "Triglicerideo ruim";
        }
    }
        
    /**
     *
     */
    public void mostrarResultado(){
       JOptionPane.showMessageDialog(null, 
               "paciente: "+ getNomePaciente()+
               "\nTipo sanguinio: "+ getTipoSanguinio()+
               "\nAno de nascimento: "+ getAnoNascimento()+
               "\nIdade: "+this.idade+" anos"+
               "\nNível de Triglicerideo: "+vlrTriglicerideo+
               "\nResultado: \n"+classificarResultado());     
       }
       
       
       public String getVlrTriglicerideoString(){
        return vlrTriglicerideoString;
       }
       public void setVlrTriglicerideoString(String vlrTriglicerideoString){
         this.vlrTriglicerideoString = vlrTriglicerideoString;
       }
       private void setTipoSanguinio(String tipoSanguinio) {
       this.tipoSanguinio = tipoSanguinio; 
       }

      private void setAnoNascimento(int anoNas) {
        this.anoNascimento = anoNas; 
          }
      private String getTipoSanguinio() {
         return this.tipoSanguinio; 
     }

      private int getAnoNascimento() {
      return this.anoNascimento; 
    }

       
}
