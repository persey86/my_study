package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Circle change color ever punch the button
 */
public class SimpleGUI3C implements ActionListener{

    JFrame frame;

    public static void main(String[] args)
    {
        SimpleGUI3C gui = new SimpleGUI3C();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Try to change colors!");
        button.addActionListener(this);           // Add listener to button

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);    // Add 1st widget - button to frame inveronment
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);  // add 2nd widget - drawPanel to frame
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent event){
        frame.repaint();  //
    }
}
class MyDrawPanel extends JPanel{
    public void paintComponent (Graphics g){   // Method of pannel for drawing "paintComponent()" is calling each pressing the button
        g.fill3DRect(0,0,this.getWidth(), this.getHeight(), true);

        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);

    }
}
