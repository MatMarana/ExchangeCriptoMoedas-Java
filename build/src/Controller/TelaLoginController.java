/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.Conexao;
import View.TelaLogin;
import View.JanelaPrincipal;
import Model.Investidor;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DAO.InvestidorDAO;
import java.sql.ResultSet;

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
    
    
    public void consultarInvestidor(){
        String cpf = view.getjTextField1().getText();
        String senha = view.getjTextField2().getText();
        Investidor investidor = new Investidor(cpf,senha);
        Conexao conn = new Conexao();
        
        try(Connection connection = conn.getConnection()){
            InvestidorDAO dao = new InvestidorDAO(connection);
            try(ResultSet resultado = dao.consultar(investidor)){
                if(resultado.next()){
                    JOptionPane.showMessageDialog(view,
                            "Login Feito com Sucesso", "Login Feito!",
                        JOptionPane.INFORMATION_MESSAGE);
                    JanelaPrincipal janela = new JanelaPrincipal();
                    janela.setVisible(true);
                    view.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(view,
                            "Cpf ou Senha Incorretos", "Erro!",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de Conexão", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}


