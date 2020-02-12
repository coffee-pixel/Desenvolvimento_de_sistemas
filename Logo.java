/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logo;
import  javax.swing.*;//importando bibliotecas
import java.awt.*;//importando bibliotecas
/**
 *
 * @author PICHAU
 */
public class Logo extends JFrame{//classe
    JLabel texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8;//criando atributos, JLabel é uma classe grafica/metodo construtor dentro do Swing
    JTextField caixa1,caixa2,caixa3,caixa4,caixa5,caixa6,caixa7,caixa8;
    
    public Logo(){
        super("Cadastro cliente");//colocando um nome no rodape
        Container tela = getContentPane();//colocando algumas propriedades do JFrame na tela
        ImageIcon icone = new ImageIcon("pessoa3.jpg");//caminho e nome da imagem(logo)
        setIconImage(icone.getImage());//colocar a imagem na janela
        tela.setBackground(Color.lightGray);//colocando uma cor na tela
        setSize(600,500);//mudando o tamanho da tela
        setVisible(true);//deixando a tela visivel 
        setLocationRelativeTo(null); //deixando a tela centralizada
        setLayout(null);//definir o layout da pagina
        
        texto1 = new JLabel("Nome");//metodos para criar objetos/ dar nomes a eles
        texto2 = new JLabel("Idade");
        texto3 = new JLabel("Telefone");
        texto4 = new JLabel("Celular");
        texto5 = new JLabel("CPF");
        texto6 = new JLabel("Endereço");
        texto7 = new JLabel("CEP");
        texto8 = new JLabel("Estado");
        
        caixa1 = new JTextField(50);
        caixa2 = new JTextField(2);
        caixa3 = new JTextField(40);
        caixa4 = new JTextField(40);
        caixa5 = new JTextField(40);
        caixa6 = new JTextField(50);
        caixa7 = new JTextField(40);
        caixa8 = new JTextField(50);
        
        texto1.setBounds(50,20,80,20);//posicionar os objetos na tela
        texto2.setBounds(50,60,80,20);
        texto3.setBounds(50,100,80,20);
        texto4.setBounds(50,140,80,20);
        texto5.setBounds(50,180,80,20);
        texto6.setBounds(50,220,80,20);
        texto7.setBounds(50,260,80,20);
        texto8.setBounds(50,300,80,20);
        
        caixa1.setBounds(50,40,200,20);
        caixa2.setBounds(50,80,20,20);
        caixa3.setBounds(50,120,110,20);
        caixa4.setBounds(50,160,110,20);
        caixa5.setBounds(50,200,110,20);
        caixa6.setBounds(50,240,200,20);
        caixa7.setBounds(50,280,110,20);
        caixa8.setBounds(50,320,200,20);
        
        texto1.setForeground(Color.darkGray);//colocando cor nos objetos
        texto2.setForeground(Color.darkGray);
        texto3.setForeground(Color.darkGray);
        texto4.setForeground(Color.darkGray);
        texto5.setForeground(Color.darkGray);
        texto6.setForeground(Color.darkGray);
        texto7.setForeground(Color.darkGray);
        texto8.setForeground(Color.darkGray);
        
        texto1.setFont(new Font("Courier New", Font.BOLD, 14));//colocando uma fonte nos objetos
        texto2.setFont(new Font("Courier New", Font.BOLD, 14));
        texto3.setFont(new Font("Courier New", Font.BOLD, 14));
        texto4.setFont(new Font("Courier New", Font.BOLD, 14));
        texto5.setFont(new Font("Courier New", Font.BOLD, 14));
        texto6.setFont(new Font("Courier New", Font.BOLD, 14));
        texto7.setFont(new Font("Courier New", Font.BOLD, 14));
        texto8.setFont(new Font("Courier New", Font.BOLD, 14));
        
        tela.add(texto1);//colocando os objetos na tela
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(texto8);
        
        tela.add(caixa1);
        tela.add(caixa2);
        tela.add(caixa3);
        tela.add(caixa4);
        tela.add(caixa5);
        tela.add(caixa6);
        tela.add(caixa7);
        tela.add(caixa8);
        
        texto1.requestFocus();
    }
    



    public static void main(String[] args) {
        Logo app = new Logo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
