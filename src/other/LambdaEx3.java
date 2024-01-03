package other;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaEx3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda Example in GUI");
        JButton button = new JButton("Click me");

        // Using a lambda expression to handle the button click event
        button.addActionListener(e -> {
            System.out.println("The button has been clicked!");
        });

        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
