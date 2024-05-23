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
    private TelaLogin view = new TelaLogin();
    private Investidor investidor;
    
    public void setTela(TelaLogin view){
        this.view = view;
    }
    
    public void salvaInvestidor(){
        String cpf = view.getCpf();
        String senha = view.getSenha();
        investidor = new Investidor(cpf,cpf,senha);
    }
    
    public void chamaJanela(){
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setVisible(true);
    }
    
}


