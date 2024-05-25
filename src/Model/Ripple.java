/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author unifmassuena
 */
public class Ripple extends Moedas {
    
    private int quantidadeMoeda;
    private float cotacaoMoeda;

    public int getQuantidadeMoeda() {
        return quantidadeMoeda;
    }

    public void setQuantidadeMoeda(int quantidadeMoeda) {
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public float getCotacaoMoeda() {
        return cotacaoMoeda;
    }

    public void setCotacaoMoeda(float cotacaoMoeda) {
        this.cotacaoMoeda = cotacaoMoeda;
    }
    
    public float cotacaoRipple(){
        Random number = new Random();
        cotacaoMoeda = number.nextFloat(5,1000);
        return cotacaoMoeda;
    }
    
    public void comprarRipple(int quantidade){
        JOptionPane.showInputDialog(null,"alerta","Digite sua senha",JOptionPane.INFORMATION_MESSAGE);
        quantidadeMoeda += quantidade;
    }
    
    public void venderRipple(int quantidade){
        JOptionPane.showInputDialog(null,"alerta","Digite sua senha",JOptionPane.INFORMATION_MESSAGE);
        if(quantidadeMoeda < quantidade){
            System.out.println("Quantidade de Ripples insuficiente");
        } else {
            quantidadeMoeda -= quantidade;
        }
    } 

    public Ripple(int quantidadeMoeda, float cotacaoMoeda) {
        super(quantidadeMoeda, cotacaoMoeda, "ripple");
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public Ripple() {
    } 
}
