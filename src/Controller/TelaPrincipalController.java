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

/**
 *
 * @author unifmassuena
 */
public class TelaPrincipalController {
    private JanelaPrincipal view;
    private Real real;
    private BitCoin bitcoin;
    private Etherium etherium;
    private Ripple ripple;

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
    
}
