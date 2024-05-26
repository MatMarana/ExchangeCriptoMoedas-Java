/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.Conexao;
import DAO.InvestidorDAO;
import View.JanelaPrincipal;
import Model.Real;
import Model.BitCoin;
import Model.Etherium;
import Model.Investidor;
import Model.Ripple;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author unifmassuena
 */
public class TelaPrincipalController {
    private JanelaPrincipal view;
    private Real real = new Real();
    private BitCoin bitcoin = new BitCoin();
    private Etherium etherium = new Etherium();
    private Ripple ripple = new Ripple();

    public TelaPrincipalController(JanelaPrincipal view) {
        this.view = view;
    }
    
    public void deposito(){
        String valorDepositado = view.getjTextFieldDeposito().getText();
        float valorDepositoConvertido = Float.valueOf(valorDepositado);
        real.depositar(valorDepositoConvertido);
    }
    
    public void saque(){
        String valorSaque = view.getjTextFieldSaque().getText();
        float valorSacado = Float.valueOf(valorSaque);
        real.sacar(valorSacado);
    }
    
    public void venderBitcoin(){
        String quantidadeVendida = view.getjTextFieldVenderBtc().getText();
        float quantidadeBitcoin = Float.valueOf(quantidadeVendida);
        String bitcoins = bitcoin.venderBitCoin(quantidadeBitcoin) + "";
        String reais = "R$" +real.venderBitcoin() + "";
        view.getjLabelBtcValor().setText(bitcoins);
        view.getjLabelSaldoValor().setText(reais);
        
        
    }
    
    public void comprarBitcoin(){
        String quantidadeComprada = view.getjTextFieldComprarBtc().getText();
        float quantidade = Float.valueOf(quantidadeComprada);
        String reais = "R$" +  real.comprarBitcoin(quantidade) + "";
        String bitcoins = bitcoin.comprarBitCoin(quantidade) + "";
        view.getjLabelBtcValor().setText(bitcoins);
        view.getjLabelSaldoValor().setText(reais);
        
        
    }
    
     public void venderRipple(){
        String quantidadeVendida = view.getjTextFieldVenderRpp().getText();
        float quantidadeRipple = Float.valueOf(quantidadeVendida);
        String ripples = ripple.venderRipple(quantidadeRipple) + "";
        String reais = "R$" +real.venderRipple() + "";
        view.getjLabelRppValor1().setText(ripples);
        view.getjLabelSaldoValor().setText(reais);
        
    }
    
    public void comprarRipple(){
        String quantidadeComprada = view.getjTextFieldComprarRpp().getText();
        float quantidade = Float.valueOf(quantidadeComprada);
        String reais = "R$" +  real.comprarRipple(quantidade) + "";
        String ripples = ripple.comprarRipple(quantidade) + "";
        view.getjLabelRppValor1().setText(ripples);
        view.getjLabelSaldoValor().setText(reais);
        
    }
    
     public void venderEtherium(){
        String quantidadeVendida = view.getjTextFieldVenderEtr().getText();
        float quantidadeEtherium = Float.valueOf(quantidadeVendida);
        String etheriums = etherium.venderEtherium(quantidadeEtherium) + "";
        String reais = "R$" +real.venderEtherium() + "";
        view.getjLabelEtrValor2().setText(etheriums);
        view.getjLabelSaldoValor().setText(reais);
        
    }
    
    public void comprarEtherium(){
        String quantidadeComprada = view.getjTextFieldComprarEtr().getText();
        float quantidade = Float.valueOf(quantidadeComprada);
        String reais = "R$" +  real.comprarEtherium(quantidade) + "";
        String etheriums = etherium.comprarEtherium(quantidade) + "";
        view.getjLabelEtrValor2().setText(etheriums);
        view.getjLabelSaldoValor().setText(reais);
        
    }
    
    public void alteraValorEtr(){
        float novoValor = etherium.cotacaoEtherium();
        String valor = "R$" + novoValor + "" ;
        view.getjLabelValorEtr().setText(valor);
    }
    
    public void alteraValorRipple(){
        float novoValor = ripple.cotacaoRipple();
        String valor = "R$" + novoValor + "" ;
        view.getjLabelValorRpp().setText(valor);
    }
    
    public void alteraValorBitcoin(){
        float novoValor = bitcoin.cotacaoBitCoin();
        String valor = "R$" + novoValor + "" ;
        view.getjLabelValorBtc().setText(valor);
    }
    
    public void alteraSaldo(){
        float quantidade = real.getReais();
        String quantidade2 = "R$" + quantidade + "";
        view.getjLabelSaldoValor().setText(quantidade2);
        
    }
    
    public void consultarSenha(){
        String senha = JOptionPane.showInputDialog(view,
                "Digite a Senha","Senha",JOptionPane.INFORMATION_MESSAGE);
        Investidor investidor = new Investidor(senha);
        Conexao conn = new Conexao();
        try(Connection connection = conn.getConnection()){
            InvestidorDAO dao = new InvestidorDAO(connection);
            JOptionPane.showMessageDialog(view,
                "Senha Correta", "Prabéns!",
                JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de Conexão", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    public void gerarExtrato(){
        
    }
    
    
}
