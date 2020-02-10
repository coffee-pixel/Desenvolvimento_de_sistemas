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
public class CorDeFundo3 extends JFrame{
    public CorDeFundo3(){
        
        super("Cor de fundo três");
        Container tela = getContentPane();
        tela.setBackground(Color.yellow);
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
                 
    }
     public static void main(String[] args) {
        
        CorDeFundo3 app = new CorDeFundo3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
    }
}
