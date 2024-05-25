/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.JanelaPrincipal;
import Model.Real;
import Model.BitCoin;
import Model.Etherium;
import Model.Ripple;
import javax.swing.JLabel;

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
        int quantidadeBitcoin = Integer.valueOf(quantidadeVendida);
        
        bitcoin.venderBitCoin(quantidadeBitcoin);
        
    }
    
    public void comprarBitcoin(){
        String quantidadeComprada = view.getjTextFieldVenderBtc().getText();
        int quantidadeBitcoin = Integer.valueOf(quantidadeComprada);
        
        bitcoin.comprarBitCoin(quantidadeBitcoin);
        
    }
    
     public void venderRipple(){
        String quantidadeVendida = view.getjTextFieldVenderRpp().getText();
        int quantidadeRipple = Integer.valueOf(quantidadeVendida);
        
        ripple.venderRipple(quantidadeRipple);
        
    }
    
    public void comprarRipple(){
        String quantidadeComprada = view.getjTextFieldVenderRpp().getText();
        int quantidadeRipple = Integer.valueOf(quantidadeComprada);
        
        ripple.comprarRipple(quantidadeRipple);
        
    }
    
     public void venderEtherium(){
        String quantidadeVendida = view.getjTextFieldVenderEtr().getText();
        int quantidadeEtherium = Integer.valueOf(quantidadeVendida);
        
        etherium.venderEtherium(quantidadeEtherium);
        
    }
    
    public void comprarEtherium(){
        String quantidadeComprada = view.getjTextFieldVenderEtr().getText();
        int quantidadeEtherium = Integer.valueOf(quantidadeComprada);
        
        etherium.comprarEtherium(quantidadeEtherium);
        
    }
    
    public void alteraValorEtr(){
        float novoValor = etherium.cotacaoEtherium();
        String valor = novoValor + "" ;
        view.getjLabelValorEtr().setText(valor);
    }
    
    public void alteraValorRipple(){
        float novoValor = ripple.cotacaoRipple();
        String valor = novoValor + "" ;
        view.getjLabelValorRpp().setText(valor);
    }
    
    public void alteraValorBitcoin(){
        float novoValor = bitcoin.cotacaoBitCoin();
        String valor = novoValor + "" ;
        view.getjLabelValorBtc().setText(valor);
    }
    
    public void alteraSaldo(){
        float quantidade = real.getReais();
        String quantidade2 = quantidade + "";
        view.getjLabelSaldoValor().setText(quantidade2);
        
    }
    
    public void gerarExtrato(){
        
    }
    
    public void alteraSaldoBtc(){
        
    }
    
    public void alteraSaldoRpp(){
        
    }
    
    public void alteraSaldoEtr(){
        
    }
    
}
