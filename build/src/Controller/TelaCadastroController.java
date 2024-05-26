/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.TelaCadastro;
import Model.Investidor;
import DAO.InvestidorDAO;
import DAO.Conexao;
import View.TelaBemVindo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
         
    
    public void salvarInvestidor(){
        String nome = view.getjTextField3().getText();
        String cpf = view.getjTextField1().getText();
        String senha = view.getjTextField2().getText();
        Investidor investidor = new Investidor(nome,cpf,senha);
        Conexao conn = new Conexao();
        try{
            Connection connection = conn.getConnection();
            InvestidorDAO dao = new InvestidorDAO(connection);
            dao.inserir(investidor);
            JOptionPane.showMessageDialog(view,"Usuário Cadastrado Com Sucesso", "Cadastrado!", 
                    JOptionPane.INFORMATION_MESSAGE);
            TelaBemVindo janela = new TelaBemVindo();
            janela.setVisible(true);
            view.setVisible(false);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Falha no Cadastro", "Erro!",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
