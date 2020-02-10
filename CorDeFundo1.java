
package cordefundo1;

import javax.swing.*;
import java.awt.*;

public class CorDeFundo1 extends JFrame {

    public CorDeFundo1(){
           
        super("Cor de fundo um");
        Container tela = getContentPane();
        tela.setBackground(new Color(255,120,120));
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        
        CorDeFundo1 app = new CorDeFundo1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    
}
