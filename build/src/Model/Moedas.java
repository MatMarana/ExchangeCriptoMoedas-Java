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
    private float bitcoins;
    protected float valorBitcoins = 100;
    private float ripple;
    protected float valorRipple = 30;
    private float etherium;
    protected float valorEtherium = 70;
    private double real;

    public float getBitcoins() {
        return bitcoins;
    }

    public void setBitcoins(float bitcoins) {
        this.bitcoins = bitcoins;
    }

    public float getRipple() {
        return ripple;
    }

    public void setRipple(float ripple) {
        this.ripple = ripple;
    }

    public float getEtherium() {
        return etherium;
    }

    public void setEtherium(float etherium) {
        this.etherium = etherium;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
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

    

    public Moedas(float moeda, float saldo, String tipoMoedas) {
        if(tipoMoedas.equals("bitcoin")){
            this.bitcoins = moeda;
            this.valorBitcoins = saldo;
        }
        if(tipoMoedas.equals("ripple")){
            this.ripple = moeda;
            this.valorRipple = saldo; 
            
        }
        if(tipoMoedas.equals("etherium")){
            this.etherium = moeda;
            this.valorEtherium = saldo;            
        }
    } 

    public Moedas(float real) {
        this.real = real;
    }

    public Moedas() {
    }
    
    
}
