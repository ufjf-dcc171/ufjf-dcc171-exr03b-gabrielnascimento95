/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr3b_labiii;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabrielsantos
 */
public class janelaOperacoes extends JFrame{
    private final JButton btnSomar = new JButton("Somar");
    private final JButton btnDividir = new JButton("Dividir");
    private final JButton btnSubtrair = new JButton("Subtrair");
    private final JButton btnMultiplicar = new JButton("Multiplicar");
    private final JLabel campo1 = new JLabel("Digite o primeiro número: ");
    private final JTextField campo2 = new JTextField(4);
    private final JLabel campo3 = new JLabel("Digite o segundo número: ");
    private final JTextField campo4 = new JTextField(4);
    private float variavelUm = 0, variavelDois = 0;
    
    public janelaOperacoes() throws HeadlessException{
        super ("Calculadora Java");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(campo1);
        add(campo2);
        add(campo3);
        add(campo4);
        add(btnSomar);
        add(btnDividir);
        add(btnSubtrair);
        add(btnMultiplicar);
        
        BotaoClicado bc= new BotaoClicado();
        btnSomar.addActionListener(bc);
        btnDividir.addActionListener(bc);
        btnSubtrair.addActionListener(bc);
        btnMultiplicar.addActionListener(bc);
    }
    
    private class BotaoClicado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == btnSomar){
                variavelUm = Float.parseFloat(campo2.getText());
                variavelDois = Float.parseFloat(campo4.getText());
                JOptionPane.showMessageDialog(null, "Botao /Somar/ clicado.");
                JOptionPane.showMessageDialog(null,"A soma é: " + (variavelDois + variavelUm));
            }else if(e.getSource() == btnSubtrair){
                variavelUm = Float.parseFloat(campo2.getText());
                variavelDois = Float.parseFloat(campo4.getText());
                JOptionPane.showMessageDialog(null, "Botao /Subtrair/ clicado.");
                JOptionPane.showMessageDialog(null,"A subtração é (primeiro - segundo): " + (variavelUm - variavelDois));                
            }else if(e.getSource() == btnMultiplicar){
                variavelUm = Float.parseFloat(campo2.getText());
                variavelDois = Float.parseFloat(campo4.getText());
                JOptionPane.showMessageDialog(null, "Botao /Multiplicar/ clicado.");
                JOptionPane.showMessageDialog(null,"A multiplicação é: " + (variavelDois * variavelUm));
            }else{
                variavelUm = Float.parseFloat(campo2.getText());
                variavelDois = Float.parseFloat(campo4.getText());
                JOptionPane.showMessageDialog(null, "Botao /Dividir/ clicado.");
                JOptionPane.showMessageDialog(null,"A divisão é (primeiro pelo o segundo): " + (variavelUm / variavelDois));
            }
        }
    }
            
}
