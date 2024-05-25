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
public class BitCoin extends Moedas{
    private float bitcoins;
    
    public float cotacaoBitCoin(){
        Random number = new Random();
        float valorAnterior = valorBitcoins;
        float variacao = (number.nextFloat() - 0.5f) * 0.1f;
        valorBitcoins = valorAnterior * (1 + variacao);
        System.out.println(valorBitcoins);
        return valorBitcoins;
    }
    
    public float comprarBitCoin(float reaisGastos){
        bitcoins += reaisGastos / valorBitcoins;
        return bitcoins;   
    }
    
    public float venderBitCoin(float quantidade){
        if(bitcoins < quantidade){
            JOptionPane.showMessageDialog(null, 
                    "Quantidade de Bitcoins Insuficiente","Alerta",JOptionPane.ERROR_MESSAGE);
        } else {
            bitcoins = bitcoins - quantidade;
        }
        return bitcoins;
    } 
    
    public BitCoin(int quantidadeMoeda, float cotacaoMoeda) {
        super(quantidadeMoeda, cotacaoMoeda, "bitcoin");
        this.bitcoins = quantidadeMoeda;
    }

    public BitCoin() {
    }
    
    
    
}
