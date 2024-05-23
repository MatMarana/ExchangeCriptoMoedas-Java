/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.TelaPrincipalController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author unifmassuena
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        controller = new TelaPrincipalController(this);
    }
    
    public TelaPrincipalController getController() {
        return controller;
    }

    public void setController(TelaPrincipalController controller) {
        this.controller = controller;
    }

    public JButton getjButtonAttCotacao() {
        return jButtonAttCotacao;
    }

    public void setjButtonAttCotacao(JButton jButtonAttCotacao) {
        this.jButtonAttCotacao = jButtonAttCotacao;
    }

    public JButton getjButtonComprarBtc() {
        return jButtonComprarBtc;
    }

    public void setjButtonComprarBtc(JButton jButtonComprarBtc) {
        this.jButtonComprarBtc = jButtonComprarBtc;
    }

    public JButton getjButtonComprarEtr() {
        return jButtonComprarEtr;
    }

    public void setjButtonComprarEtr(JButton jButtonComprarEtr) {
        this.jButtonComprarEtr = jButtonComprarEtr;
    }

    public JButton getjButtonComprarRpp() {
        return jButtonComprarRpp;
    }

    public void setjButtonComprarRpp(JButton jButtonComprarRpp) {
        this.jButtonComprarRpp = jButtonComprarRpp;
    }

    public JButton getjButtonDepositar() {
        return jButtonDepositar;
    }

    public void setjButtonDepositar(JButton jButtonDepositar) {
        this.jButtonDepositar = jButtonDepositar;
    }

    public JButton getjButtonGerarExtrato() {
        return jButtonGerarExtrato;
    }

    public void setjButtonGerarExtrato(JButton jButtonGerarExtrato) {
        this.jButtonGerarExtrato = jButtonGerarExtrato;
    }

    public JButton getjButtonSacar() {
        return jButtonSacar;
    }

    public void setjButtonSacar(JButton jButtonSacar) {
        this.jButtonSacar = jButtonSacar;
    }

    public JButton getjButtonVenderBTc() {
        return jButtonVenderBTc;
    }

    public void setjButtonVenderBTc(JButton jButtonVenderBTc) {
        this.jButtonVenderBTc = jButtonVenderBTc;
    }

    public JButton getjButtonVenderEtr() {
        return jButtonVenderEtr;
    }

    public void setjButtonVenderEtr(JButton jButtonVenderEtr) {
        this.jButtonVenderEtr = jButtonVenderEtr;
    }

    public JButton getjButtonVenderRipple() {
        return jButtonVenderRipple;
    }

    public void setjButtonVenderRipple(JButton jButtonVenderRipple) {
        this.jButtonVenderRipple = jButtonVenderRipple;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabelValorBtc() {
        return jLabelValorBtc;
    }

    public void setjLabelValorBtc(JLabel jLabelValorBtc) {
        this.jLabelValorBtc = jLabelValorBtc;
    }

    public JLabel getjLabelValorEtr() {
        return jLabelValorEtr;
    }

    public void setjLabelValorEtr(JLabel jLabelValorEtr) {
        this.jLabelValorEtr = jLabelValorEtr;
    }

    public JLabel getjLabelValorRpp() {
        return jLabelValorRpp;
    }

    public void setjLabelValorRpp(JLabel jLabelValorRpp) {
        this.jLabelValorRpp = jLabelValorRpp;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    public void setjTabbedPane2(JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    public JTextField getjTextFieldComprarBtc() {
        return jTextFieldComprarBtc;
    }

    public void setjTextFieldComprarBtc(JTextField jTextFieldComprarBtc) {
        this.jTextFieldComprarBtc = jTextFieldComprarBtc;
    }

    public JTextField getjTextFieldComprarEtr() {
        return jTextFieldComprarEtr;
    }

    public void setjTextFieldComprarEtr(JTextField jTextFieldComprarEtr) {
        this.jTextFieldComprarEtr = jTextFieldComprarEtr;
    }

    public JTextField getjTextFieldComprarRpp() {
        return jTextFieldComprarRpp;
    }

    public void setjTextFieldComprarRpp(JTextField jTextFieldComprarRpp) {
        this.jTextFieldComprarRpp = jTextFieldComprarRpp;
    }

    public JTextField getjTextFieldDeposito() {
        return jTextFieldDeposito;
    }

    public void setjTextFieldDeposito(JTextField jTextFieldDeposito) {
        this.jTextFieldDeposito = jTextFieldDeposito;
    }

    public JTextField getjTextFieldSaque() {
        return jTextFieldSaque;
    }

    public void setjTextFieldSaque(JTextField jTextFieldSaque) {
        this.jTextFieldSaque = jTextFieldSaque;
    }

    public JTextField getjTextFieldVenderBtc() {
        return jTextFieldVenderBtc;
    }

    public void setjTextFieldVenderBtc(JTextField jTextFieldVenderBtc) {
        this.jTextFieldVenderBtc = jTextFieldVenderBtc;
    }

    public JTextField getjTextFieldVenderEtr() {
        return jTextFieldVenderEtr;
    }

    public void setjTextFieldVenderEtr(JTextField jTextFieldVenderEtr) {
        this.jTextFieldVenderEtr = jTextFieldVenderEtr;
    }

    public JTextField getjTextFieldVenderRpp() {
        return jTextFieldVenderRpp;
    }

    public void setjTextFieldVenderRpp(JTextField jTextFieldVenderRpp) {
        this.jTextFieldVenderRpp = jTextFieldVenderRpp;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonDepositar = new javax.swing.JButton();
        jButtonSacar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDeposito = new javax.swing.JTextField();
        jTextFieldSaque = new javax.swing.JTextField();
        jButtonGerarExtrato = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonComprarBtc = new javax.swing.JButton();
        jButtonComprarEtr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonComprarRpp = new javax.swing.JButton();
        jTextFieldComprarRpp = new javax.swing.JTextField();
        jTextFieldComprarBtc = new javax.swing.JTextField();
        jTextFieldComprarEtr = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonVenderBTc = new javax.swing.JButton();
        jButtonVenderEtr = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonVenderRipple = new javax.swing.JButton();
        jTextFieldVenderRpp = new javax.swing.JTextField();
        jTextFieldVenderBtc = new javax.swing.JTextField();
        jTextFieldVenderEtr = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonAttCotacao = new javax.swing.JButton();
        jLabelValorEtr = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelValorBtc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelValorRpp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDepositar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonDepositar.setText("Depositar");
        jButtonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositarActionPerformed(evt);
            }
        });

        jButtonSacar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonSacar.setText("Sacar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Digite o valor a ser depositado:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Digite o valor a ser sacado: ");

        jTextFieldDeposito.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDepositoActionPerformed(evt);
            }
        });

        jTextFieldSaque.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaqueActionPerformed(evt);
            }
        });

        jButtonGerarExtrato.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGerarExtrato.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonGerarExtrato.setText("Gerar Extrato");
        jButtonGerarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSaque, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(jTextFieldDeposito))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGerarExtrato)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDepositar))
                .addGap(106, 106, 106)
                .addComponent(jButtonGerarExtrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSacar))
                .addGap(59, 59, 59))
        );

        jTabbedPane2.addTab("tab1", jPanel1);

        jButtonComprarBtc.setText("Comprar BitCoin");

        jButtonComprarEtr.setText("Comprar Etherium");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Digite a quantidade de Bitcoins:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Digite a quantidade de Ripples: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("DIgite a quantidade de Etheruims");

        jButtonComprarRpp.setText("Comprar Ripple");

        jTextFieldComprarRpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComprarRppActionPerformed(evt);
            }
        });

        jTextFieldComprarBtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComprarBtcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11)))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldComprarEtr, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldComprarRpp, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldComprarBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonComprarBtc)
                    .addComponent(jButtonComprarRpp)
                    .addComponent(jButtonComprarEtr))
                .addGap(39, 90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComprarBtc)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldComprarBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButtonComprarRpp)
                    .addComponent(jTextFieldComprarRpp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel11)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldComprarEtr, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonComprarEtr))
                        .addGap(55, 55, 55))))
        );

        jTabbedPane2.addTab("tab2", jPanel2);

        jButtonVenderBTc.setText("Vender  BitCoin");

        jButtonVenderEtr.setText("Vender Etherium");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Digite a quantidade de Bitcoins:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Digite a quantidade de Ripples: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("DIgite a quantidade de Etheruims: ");

        jButtonVenderRipple.setText("Vender Ripple");

        jTextFieldVenderRpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVenderRppActionPerformed(evt);
            }
        });

        jTextFieldVenderBtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVenderBtcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(72, 72, 72)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldVenderRpp, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVenderEtr, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVenderRipple)
                            .addComponent(jButtonVenderEtr)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextFieldVenderBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jButtonVenderBTc)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVenderBTc)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldVenderBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButtonVenderRipple)
                    .addComponent(jTextFieldVenderRpp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButtonVenderEtr)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldVenderEtr, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(64, 64, 64))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab3", jPanel4);

        jButtonAttCotacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAttCotacao.setText("Atualizar Cotação");
        jButtonAttCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAttCotacaoActionPerformed(evt);
            }
        });

        jLabelValorEtr.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelValorEtr.setText("valor");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("BitCoins:");

        jLabelValorBtc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelValorBtc.setText("valor");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Etherium");

        jLabelValorRpp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelValorRpp.setText("valor");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Ripple");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelValorBtc)
                        .addGap(14, 14, 14))
                    .addComponent(jLabelValorEtr, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelValorRpp)
                .addGap(49, 49, 49))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButtonAttCotacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelValorEtr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelValorBtc))
                .addGap(132, 132, 132)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelValorRpp))
                .addGap(44, 44, 44)
                .addComponent(jButtonAttCotacao)
                .addGap(86, 86, 86))
        );

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jTabbedPane2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAttCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAttCotacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAttCotacaoActionPerformed

    private void jButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDepositarActionPerformed

    private void jTextFieldSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaqueActionPerformed

    private void jButtonGerarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGerarExtratoActionPerformed

    private void jTextFieldComprarBtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComprarBtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComprarBtcActionPerformed

    private void jTextFieldComprarRppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComprarRppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComprarRppActionPerformed

    private void jTextFieldVenderRppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVenderRppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVenderRppActionPerformed

    private void jTextFieldVenderBtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVenderBtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVenderBtcActionPerformed

    private void jTextFieldDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDepositoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    
    TelaPrincipalController controller;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAttCotacao;
    private javax.swing.JButton jButtonComprarBtc;
    private javax.swing.JButton jButtonComprarEtr;
    private javax.swing.JButton jButtonComprarRpp;
    private javax.swing.JButton jButtonDepositar;
    private javax.swing.JButton jButtonGerarExtrato;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JButton jButtonVenderBTc;
    private javax.swing.JButton jButtonVenderEtr;
    private javax.swing.JButton jButtonVenderRipple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelValorBtc;
    private javax.swing.JLabel jLabelValorEtr;
    private javax.swing.JLabel jLabelValorRpp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextFieldComprarBtc;
    private javax.swing.JTextField jTextFieldComprarEtr;
    private javax.swing.JTextField jTextFieldComprarRpp;
    private javax.swing.JTextField jTextFieldDeposito;
    private javax.swing.JTextField jTextFieldSaque;
    private javax.swing.JTextField jTextFieldVenderBtc;
    private javax.swing.JTextField jTextFieldVenderEtr;
    private javax.swing.JTextField jTextFieldVenderRpp;
    // End of variables declaration//GEN-END:variables
}
