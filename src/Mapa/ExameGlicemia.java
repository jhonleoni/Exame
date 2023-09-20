
package Mapa;

import javax.swing.JOptionPane;

public class ExameGlicemia extends Exames {

    private String vlrGlicoseString;
    private int vlrGlicose;
    private final int anoAtual = 2023;
    private String idade;

    
    @Override
    
    public void cadastrarExame(){
        
        this.setNomePaciente(JOptionPane.showInputDialog(null, "Olá! Como você se chama?"));
        this.setTipoSanguinio(JOptionPane.showInputDialog(null, "Qual seu tipo sanguínio?"));
        
        String anoNascimentoString =JOptionPane.showInputDialog(null, "Qual seu ano de nascimento?");
        int anoNas = Integer.parseInt(anoNascimentoString);
        this.setAnoNascimento(anoNas);
        
        int idadeCalculada = anoAtual - anoNas;
        this.idade = String.valueOf(idadeCalculada);
        
        vlrGlicoseString = JOptionPane.showInputDialog(null, "Digite a quantidade de glicose por mg/L");
       
    }
    
    /**
     *
     * @return
     */
    @Override
    public String classificarResultado(){
        
        vlrGlicose = Integer.parseInt(this.vlrGlicoseString);
        if(vlrGlicose < 100){
            return "Positivo para Normoglicemia";
        }else if(vlrGlicose >= 100 && vlrGlicose <= 126){
            return "Positivo para Pré diabetes";
        }else if(vlrGlicose > 126){
            return "Positivo para diabetes";
        }

        return null;
    }
    public void mostrarResultado(){
       JOptionPane.showMessageDialog(null, 
               "paciente: "+ getNomePaciente()+
               "\nTipo sanguinio: "+ getTipoSanguinio()+
               "\nAno de nascimento: "+ getAnoNascimento()+
               "\nIdade: "+this.idade+" anos"+
               "\nNível de Glicose: "+vlrGlicose+
               "\nResultado: \n"+classificarResultado());     
       }
    
    public int getVlrGlicose(){
        return vlrGlicose;
    }
    public void setVlrGlicose(int vlrGlicose){
        this.vlrGlicose = vlrGlicose;
    }
    public String getVlrGlicoseString(){
        return vlrGlicoseString;
    }
    public void setVlrGlicoseString(String vlrGlicoseString){
        this.vlrGlicoseString = vlrGlicoseString;
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
