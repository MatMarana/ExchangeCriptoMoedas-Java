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
        JOptionPane.showInputDialog(null,"Digite sua senha","Alerta",JOptionPane.INFORMATION_MESSAGE);
        if(reais < quantidade){
            JOptionPane.showInputDialog(null,"Saldo Insuficiente","Alerta",JOptionPane.INFORMATION_MESSAGE);
        } else {
            reais -= quantidade;
        }
    } 

    public Real(float reais) {
        super(reais);
        this.reais = reais;
    }

    public Real() {
    }
    
    

}
