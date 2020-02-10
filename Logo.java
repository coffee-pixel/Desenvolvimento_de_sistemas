/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logo;
import  javax.swing.*;
/**
 *
 * @author PICHAU
 */
public class Logo extends JFrame{

    public Logo(){
        super("logo");
        ImageIcon icone = new ImageIcon("overwatch.gif");
        setIconImage(icone.getImage());
        setSize(300,150);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logo app = new Logo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
