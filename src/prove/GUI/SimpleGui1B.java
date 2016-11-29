package proove;

/**
 * Created on 29.11.2016.
 */
public class SimpleGui1B implements ActionListener{
    JButton button;

    public static void main(String[] args)
    {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);  // "Add me" to list of listener

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
        }
}
