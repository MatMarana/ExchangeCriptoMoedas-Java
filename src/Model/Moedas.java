/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifmassuena
 */
public class Moedas {
    private int bitcoins;
    private float valorBitcoins;
    private float bitcoinsReal;
    private int ripple;
    private float valorRipple;
    private float rippleReal;
    private int etherium;
    private float valorEtherium;
    private float etheriumReal;
    private float real;

    public int getBitcoins() {
        return bitcoins;
    }

    public void setBitcoins(int bitcoins) {
        this.bitcoins = bitcoins;
    }

    public int getRipple() {
        return ripple;
    }

    public void setRipple(int ripple) {
        this.ripple = ripple;
    }

    public int getEtherium() {
        return etherium;
    }

    public void setEtherium(int etherium) {
        this.etherium = etherium;
    }

    public float getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public float getValorBitcoins() {
        return valorBitcoins;
    }

    public void setValorBitcoins(float valorBitcoins) {
        this.valorBitcoins = valorBitcoins;
    }

    public float getValorRipple() {
        return valorRipple;
    }

    public void setValorRipple(float valorRipple) {
        this.valorRipple = valorRipple;
    }

    public float getValorEtherium() {
        return valorEtherium;
    }

    public void setValorEtherium(float saldoEtherium) {
        this.valorEtherium = saldoEtherium;
    }

    public float getBitcoinsReal() {
        return bitcoinsReal;
    }

    public void setBitcoinsReal(float bitcoinsReal) {
        this.bitcoinsReal = bitcoinsReal;
    }

    public float getRippleReal() {
        return rippleReal;
    }

    public void setRippleReal(float rippleReal) {
        this.rippleReal = rippleReal;
    }

    public float getEtheriumReal() {
        return etheriumReal;
    }

    public void setEtheriumReal(float etheriumReal) {
        this.etheriumReal = etheriumReal;
    }
    
    

    public Moedas(int moeda, float saldo, String tipoMoedas) {
        if(tipoMoedas.equals("bitcoin")){
            this.bitcoins = moeda;
            this.valorBitcoins = saldo;
            bitcoinsReal = bitcoins * valorBitcoins; 
        }
        if(tipoMoedas.equals("ripple")){
            this.ripple = moeda;
            this.valorRipple = saldo;
            rippleReal = ripple * valorRipple;
            
        }
        if(tipoMoedas.equals("etherium")){
            this.etherium = moeda;
            this.valorEtherium = saldo;
            etheriumReal = etherium * valorEtherium;
            
        }
    } 

    public Moedas(float real) {
        this.real = real;
    }

    public Moedas() {
    }
    
    
}
