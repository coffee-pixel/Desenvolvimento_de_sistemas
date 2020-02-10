/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cordefundo1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author PICHAU
 */
public class CorDeFundo2 extends JFrame{
    public CorDeFundo2(){
        
        super("Cor de fundo dois");
        Container tela = getContentPane();
        tela.setBackground(new Color(128,125,150));
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
                 
    }
     public static void main(String[] args) {
        
        CorDeFundo2 app = new CorDeFundo2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
    }
}
