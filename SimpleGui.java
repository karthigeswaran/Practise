import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class SimpleGui implements ActionListener{
    JFrame frame;
    MyDrawPanel drawPanel;
    int x=20;
    int y=20;
    public static void main(String[] args){
        SimpleGui gui1=new SimpleGui();
        gui1.go();
    }
    public void go(){
        frame = new JFrame("SimpleGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Change color");
        button.addActionListener(this);
        
        drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }
    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            
            int red = (int) (Math.random()*256);
            int green = (int) (Math.random()*256);
            int blue = (int) (Math.random()*256);
    
            Color randomColor = new Color(red, green, blue);
    
            g.setColor(randomColor);
            g.fillOval(10,10,10,10);
        }
    }
}