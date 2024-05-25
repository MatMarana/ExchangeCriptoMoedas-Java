/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifmassuena
 */
public class Carteira {
    private float saldo; // valor total de dinheiro na conta
    private float saldoBtc;
    private float saldoRipple;
    private float saldoEtherium;
    private Moedas moedas = new Moedas();

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float calculaSaldo(){
        saldo = moedas.getBitcoinsReal() + moedas.getRippleReal() + moedas.getEtheriumReal() + moedas.getReal();
        return saldo;
    }
    
    public float saldoBtc(){
        saldoBtc = moedas.getBitcoinsReal();
        return saldoBtc;
    }
    
    public float saldoRipple(){
        saldoRipple = moedas.getRippleReal();
        return saldoRipple;
    }
    
    public float saldoEtherium(){
        saldoEtherium = moedas.getEtheriumReal();
        return saldoEtherium;
    }
    
    public Carteira(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
