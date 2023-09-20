
package Mapa;

import javax.swing.JOptionPane;

public class ExameColesterol extends Exames {

    private String vlrLdlString;
    private int vlrLdlInt;
    private String vlrHdlString;
    private int vlrHdlInt;
    private String riscoPacienteString;
    private int idade;
    private int anoAtual;
    private String op;
    
    public ExameColesterol(int anoAtual){
        this.anoAtual = 2023;
        this.anoAtual = anoAtual;
    }
    
    @Override
    public void cadastrarExame(){
        this.setNomePaciente(JOptionPane.showInputDialog(null, "Olá! Como você se chama?"));
        this.setTipoSanguinio(JOptionPane.showInputDialog(null, "Qual seu tipo sanguínio?"));
        
        String anoNascimentoString =JOptionPane.showInputDialog(null, "Qual seu ano de nascimento?");
        int anoNas = Integer.parseInt(anoNascimentoString);
        this.setAnoNascimento(anoNas);
        
        idade = anoAtual - anoNas;
        vlrLdlString = JOptionPane.showInputDialog(null, "Digite o valor de LDL por mg/L");
        this.vlrLdlInt = Integer.parseInt(vlrLdlString);
        vlrHdlString = JOptionPane.showInputDialog(null, "Digite o valor de HDL por mg/L");
        this.vlrHdlInt = Integer.parseInt(vlrHdlString);
        this.op = JOptionPane.showInputDialog(null, "Digite o risco. (médio = m, bom = b, alto = a)");
    }
    
   public String classificarResultadoLdl(){
       
       switch (op.toUpperCase()){
           case "A": {
               if(vlrLdlInt < 50){
                   return "LDL bom";
               }else {
                   return "LDL ruim";
               }
            }
               case "M": {
                   if(vlrLdlInt < 70){
                       return "LDL bom";
                   }else {
                       return "LDL ruim";
                   }
            }
               case "B": {
                   if(vlrLdlInt < 100){
                       return "LDL bom";
                   }else {
                       return "LDL ruim";
                   }
            }
               default: {
                   return "Inválido";
            }
               
               
       }
   } 
    
   public String classificarResultadoHdl(){
      if(idade <= 19 && this.vlrHdlInt > 45){
          return "HDL bom";
      }else if(idade >= 20 && this.vlrHdlInt >= 40){
          return "HDL bom";
      }else{
        return "HDL ruim";
   }
       
   }
   
   public void mostrarResultado(){
       JOptionPane.showMessageDialog(null, 
               "paciente: "+ getNomePaciente()+
               "\nTipo sanguinio: "+ getTipoSanguinio()+
               "\nAno de nascimento: "+ getAnoNascimento()+
               "\nIdade: "+this.idade+" anos"+
               "\nNível de LDL: "+vlrLdlString+
               "\nNível de HDL: "+vlrHdlString+
               "\nResultado: \n"+classificarResultadoHdl()+"\n"+classificarResultadoLdl());
   }
   
   
   public String getVlrLdlString(){
       return vlrLdlString;
   }
   public void setVlrLdlString(String vlrLdlString){
       this.vlrLdlString = vlrLdlString;
   }
   public String getVlrHdlString(){
       return vlrHdlString;
   }
   public void setVlrHdlString(String vlrHdlString){
       this.vlrHdlString = vlrHdlString;
   }
   public String getRiscoPacienteString(){
       return riscoPacienteString;
   }
   public void setRiscoPacienteString(String riscoPacienteString){
       this.riscoPacienteString = riscoPacienteString;
   }
   public int getVlrLdlInt(){
       return vlrLdlInt;
   }
   public void setVlrLdlInt(int vlrLdlInt){
       this.vlrLdlInt = vlrLdlInt;
   }
   public int getVlrHdlInt(){
       return vlrHdlInt;
   }
   public void setVlrHdlInt(int vlrHdlInt){
       this.vlrHdlInt = vlrHdlInt;
   }
   public int getIdade(){
       return idade;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
   public String getOp(){
       return op;
   }
   public void setOp(String op){
       this.op = op;
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
