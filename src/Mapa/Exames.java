
package Mapa;


public abstract class Exames {

    private String nomePaciente;
    String tipoSanguinio;
    int anoNascimento;
    
    public void cadastrarExame() {
        
    }
    
    public String classificarResultado(){
        
        return null;
    }
    
    public String getNomePaciente(){
        return nomePaciente;
    }
    
    public void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }
    
    
}
