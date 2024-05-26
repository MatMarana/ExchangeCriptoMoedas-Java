/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author unifmassuena
 */
public class Real extends Moedas{
    private float reais;

    public float getReais() {
        return reais;
    }

    public void setReais(float reais) {
        this.reais = reais;
    }
    
    public void depositar(float quantidade){
        reais += quantidade;
        System.out.println(reais);
    }
    
    public void sacar(float quantidade){
        if(reais < quantidade){
            JOptionPane.showInputDialog(null,
                    "Saldo Insuficiente","Alerta",JOptionPane.INFORMATION_MESSAGE);
        } else {
            reais -= quantidade;
        }
    } 
    
    public float comprarBitcoin(float reaisGastos){
        if(reais < reaisGastos){
            JOptionPane.showInputDialog(null,
                    "Saldo Insuficiente","Alerta",JOptionPane.INFORMATION_MESSAGE);
        } else {
            reais -= reaisGastos + (reaisGastos * 0.02);
        }
        return reais;
    }
    
    public float venderBitcoin(){
        reais += valorBitcoins - (valorBitcoins * 0.03);
        return reais;
    }
    
    public float comprarRipple(float reaisGastos){
        if(reais < reaisGastos){
            JOptionPane.showInputDialog(null,
                    "Saldo Insuficiente","Alerta",JOptionPane.INFORMATION_MESSAGE);
        } else {
            reais -= reaisGastos + (reaisGastos * 0.01);
        }
        return reais;
    }

    public float venderRipple(){
        reais += valorRipple - (valorRipple * 0.01);
        return reais;
    }
    
    public float comprarEtherium(float reaisGastos){
        if(reais < reaisGastos){
            JOptionPane.showInputDialog(null,
                    "Saldo Insuficiente","Alerta",JOptionPane.INFORMATION_MESSAGE);
        } else {
            reais -= reaisGastos + (reaisGastos * 0.01);
        }
        return reais;
    }
    
    public float venderEtherium(){
        reais += valorEtherium - (valorEtherium * 0.02);
        return reais;
    }


    public Real(float reais) {
        super(reais);
        this.reais = reais;
    }

    public Real() {
    }
    
    

}
