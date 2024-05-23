/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Random;

/**
 *
 * @author unifmassuena
 */
public class Etherium extends Moedas {
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
    
    public void cotacaoEtherium(){
        Random number = new Random();
        float cotacaoMoeda = number.nextFloat();
        System.out.println(cotacaoMoeda);
    }
    
    public void comprarEtherium(int quantidade){
        quantidadeMoeda += quantidade;
    }
    
    public void venderEtherium(int quantidade){
        if(quantidadeMoeda < quantidade){
            System.out.println("Quantidade de Etheriums insuficiente");
        } else {
            quantidadeMoeda -= quantidade;
        }
    } 

    public Etherium(int quantidadeMoeda, float cotacaoMoeda) {
        super(quantidadeMoeda, cotacaoMoeda, "etherium");
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public Etherium() {
    } 
}
