/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

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
    }
    
    public void sacar(float quantidade){
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
