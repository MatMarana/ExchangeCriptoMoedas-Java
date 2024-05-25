/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.TelaLogin;
import View.JanelaPrincipal;
import Model.Investidor;


/**
 *
 * @author unifmassuena
 */
public class TelaLoginController {
    private TelaLogin view;
    private Investidor investidor;
    
    public void setTela(TelaLogin view){
        this.view = view;
    }
    
    public TelaLoginController(TelaLogin view) {
        this.view = view;
    }
    
    public void chamaJanela(){
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setVisible(true);
    }
    
    public void fechaJanela(){
        view.setVisible(false);
    }
    
}


