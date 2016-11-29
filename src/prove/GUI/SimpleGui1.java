package proove;

/**
 * Created on 29.11.2016.
 */
public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for close frame

        frame.getContentPane().add(button);  // add button on the pannel of frame

        frame.setSize(300, 300); // size of the frame in px

        frame.setVisible(true);  // make frame active (allow to show the frame)
    }
}
