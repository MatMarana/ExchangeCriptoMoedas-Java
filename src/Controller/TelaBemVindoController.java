/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.TelaBemVindo;
import View.TelaLogin;
import View.TelaCadastro;

/**
 *
 * @author unifmassuena
 */
public class TelaBemVindoController {
    private TelaBemVindo view;
    
    public TelaBemVindoController(TelaBemVindo view) {
        this.view = view;
    }
    
    public void setView(TelaBemVindo view){
        this.view = view;
    }
    
    public void ChamaLogin(){ // Função que abre a tela de Login
        TelaLogin view = new TelaLogin();
        view.setVisible(true);
    }
    public void ChamaCadastro(){
        TelaCadastro view = new TelaCadastro(); // Função que Abre a tela de Cadastro
        view.setVisible(true);
    }
    
    public void fechaJanela(){ // Função que Fecha a tela de Bem-vindo
        view.setVisible(false);
    }
    
}
