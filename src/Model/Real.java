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
        JOptionPane.showInputDialog(null,"alerta","Digite sua senha",JOptionPane.INFORMATION_MESSAGE);
        reais += quantidade;
        System.out.println(reais);
    }
    
    public void sacar(float quantidade){
        JOptionPane.showInputDialog(null,"alerta","Digite sua senha",JOptionPane.INFORMATION_MESSAGE);
        if(reais < quantidade){
            System.out.println("Saldo insuficiente");
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
