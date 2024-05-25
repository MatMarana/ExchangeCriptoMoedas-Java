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
    
    
    public Carteira(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
