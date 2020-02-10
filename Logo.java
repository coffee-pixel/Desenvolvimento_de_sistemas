/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logo;
import  javax.swing.*;
import java.awt.*;
/**
 *
 * @author PICHAU
 */
public class Logo extends JFrame{
    JLabel texto1, texto2;
    public Logo(){
        super("logo");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("logo2.png");
        setIconImage(icone.getImage());
        tela.setBackground(Color.lightGray);
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null); 
        texto1 = new JLabel("Primeiro teste com JLabel");
        texto2 = new JLabel("Segundo teste com JLabel");
        texto1.setBounds(50,20,80,20);
        texto2.setBounds(50,30,80,20);
        texto1.setForeground(Color.darkGray);
        texto2.setForeground(Color.blue);
        texto1.setFont(new Font("Arial", Font.BOLD, 10));
        texto2.setFont(new Font("arial", Font.BOLD, 10));
        
        tela.add(texto1);
        tela.add(texto2);
    }
    



    public static void main(String[] args) {
        Logo app = new Logo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
