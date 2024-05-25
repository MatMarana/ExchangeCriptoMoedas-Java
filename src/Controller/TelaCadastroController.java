/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.TelaCadastro;
import View.JanelaPrincipal;
import Model.Investidor;

/**
 *
 * @author Pichau
 */
public class TelaCadastroController {
    private TelaCadastro view;

    public TelaCadastroController(TelaCadastro view) {
        this.view = view;
    }
    
    
    public void setTela(TelaCadastro view){
        this.view = view;
    }
    
    public void chamaJanela(){
        String nome = view.getjTextField3().getText();
        String cpf = view.getjTextField1().getText();
        String senha = view.getjTextField2().getText();
        Investidor investidor = new Investidor(nome,cpf,senha);
        
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setVisible(true);
    }
    
    public void fechaJanela(){
        view.setVisible(false);
    }
}
