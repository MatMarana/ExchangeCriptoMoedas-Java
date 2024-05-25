/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import Model.Investidor;
/**
 *
 * @author Pichau
 */
public class InvestidorDAO {
    private Connection conn;
    
    public InvestidorDAO(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Investidor investidor) throws SQLException{
        String sql = "INSERT INTO alunos(nome,cpf,senha) " + "values('" + investidor.getNome()
                +"', '" + investidor.getCpf() + "', '" + investidor.getSenha() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultar(Investidor investidor) throws SQLException{
        String sql = "SELECT * FROM alunos WHERE usuario = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,investidor.getCpf());
        statement.setString(2,investidor.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
}
