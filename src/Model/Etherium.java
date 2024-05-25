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
    private int quantidadeMoeda = 0;
    private float cotacaoMoeda = 0;

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
    
    public float cotacaoEtherium(){
        Random number = new Random();
        cotacaoMoeda = number.nextFloat();
        System.out.println(cotacaoMoeda);
        return cotacaoMoeda;
    }
    
    public void comprarEtherium(int quantidade){
        JOptionPane.showInputDialog(null,"alerta","Digite sua senha",JOptionPane.INFORMATION_MESSAGE);
        quantidadeMoeda += quantidade;
    }
    
    public void venderEtherium(int quantidade){
        JOptionPane.showInputDialog(null,"alerta","Digite sua senha",JOptionPane.INFORMATION_MESSAGE);
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
