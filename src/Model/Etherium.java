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
public class Etherium extends Moedas {
    private float etherium;

    public float getQuantidadeMoeda() {
        return etherium;
    }

    public void setQuantidadeMoeda(int quantidadeMoeda) {
        this.etherium = quantidadeMoeda;
    }

    public float getCotacaoMoeda() {
        return valorEtherium;
    }

    public void setCotacaoMoeda(float cotacaoMoeda) {
        this.valorEtherium = cotacaoMoeda;
    }
    
    public float cotacaoEtherium(){
        Random number = new Random();
        float valorAnterior = valorEtherium;
        float variacao = (number.nextFloat() - 0.5f) * 0.1f;
        valorEtherium = valorAnterior * (1 + variacao);
        System.out.println(valorEtherium);
        return valorEtherium;
    }
    
    public float comprarEtherium(float reaisGastos){
        etherium += reaisGastos / valorEtherium;
        return etherium;
    }
    
    public float venderEtherium(float quantidade){
        if(etherium < quantidade){
            JOptionPane.showMessageDialog(null, 
                    "Quantidade de Ehteriums Insuficiente","Alerta",JOptionPane.ERROR_MESSAGE);
        } else {
            etherium -= quantidade;
        }
        return etherium;
    } 

    public Etherium(int quantidadeMoeda, float cotacaoMoeda) {
        super(quantidadeMoeda, cotacaoMoeda, "etherium");
        this.etherium = quantidadeMoeda;
    }

    public Etherium() {
    } 
}
