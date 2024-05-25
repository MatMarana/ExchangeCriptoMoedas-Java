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
    
    public float cotacaoBitCoin(){
        Random number = new Random();
        cotacaoMoeda = number.nextFloat(5,1000);
        System.out.println(cotacaoMoeda);
        return cotacaoMoeda;
    }
    
    public void comprarBitCoin(int quantidade){
        JOptionPane.showInputDialog(null,"Digite sua senha","Alerta",JOptionPane.INFORMATION_MESSAGE);
        quantidadeMoeda = quantidadeMoeda + quantidade;
    }
    
    public void venderBitCoin(int quantidade){
        JOptionPane.showInputDialog(null,"Digite sua senha","Alerta",JOptionPane.INFORMATION_MESSAGE);
        if(quantidadeMoeda < quantidade){
            System.out.println("Quantidade de BitCoins insuficiente");
            JOptionPane.showMessageDialog(null, "Quantidade de Bitcoins Insuficiente","Alerta",JOptionPane.ERROR_MESSAGE);
        } else {
            quantidadeMoeda -= quantidade;
        }
    } 

    public BitCoin(int quantidadeMoeda, float cotacaoMoeda) {
        super(quantidadeMoeda, cotacaoMoeda, "bitcoin");
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public BitCoin() {
    }
    
    
    
}
