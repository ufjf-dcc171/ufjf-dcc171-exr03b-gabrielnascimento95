/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr3b_labiii;

import javax.swing.JFrame;

/**
 *
 * @author gabrielsantos
 */
public class EXR3b_LABIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        janelaOperacoes janela = new janelaOperacoes();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 200);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
    
}
