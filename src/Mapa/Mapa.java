
package Mapa;


public class Mapa {
    
    public static void main(String[] args){
        /**/
        ExameGlicemia eg = new ExameGlicemia();
        eg.cadastrarExame();
        eg.classificarResultado();
        eg.mostrarResultado(); 
        
        /**/
        ExameColesterol ec = new ExameColesterol(2023);
        ec.cadastrarExame();
        ec.classificarResultado();
        ec.mostrarResultado(); 
        
        /**/
        ExameTriglicerideo et = new ExameTriglicerideo(2023);
        et.cadastrarExame();
        et.classificarResultado();
        et.mostrarResultado(); 
    }
}
