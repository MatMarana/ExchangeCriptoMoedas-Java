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
    
    private float ripple;

    public float getQuantidadeMoeda() {
        return ripple;
    }

    public void setQuantidadeMoeda(int quantidadeMoeda) {
        this.ripple = quantidadeMoeda;
    }

    public float getCotacaoMoeda() {
        return valorRipple;
    }

    public void setCotacaoMoeda(float cotacaoMoeda) {
        this.valorRipple = cotacaoMoeda;
    }
    
    public float cotacaoRipple(){
        Random number = new Random();
        float valorAnterior = valorRipple;
        float variacao = (number.nextFloat() - 0.5f) * 0.1f;
        valorRipple = valorAnterior * (1 + variacao);
        System.out.println(valorRipple);
        return valorRipple;
    }
    
    public float comprarRipple(float reaisGastos){
        ripple += reaisGastos / valorRipple;
        return ripple;
    }
    
    public float venderRipple(float quantidade){
        if(ripple < quantidade){
            JOptionPane.showMessageDialog(null, 
                    "Quantidade de Bitcoins Insuficiente","Alerta",JOptionPane.ERROR_MESSAGE);
        } else {
            ripple -= quantidade;
        }
        return ripple;
    } 

    public Ripple(int quantidadeMoeda, float cotacaoMoeda) {
        super(quantidadeMoeda, cotacaoMoeda, "ripple");
        this.ripple = quantidadeMoeda;
    }

    public Ripple() {
    } 
}
