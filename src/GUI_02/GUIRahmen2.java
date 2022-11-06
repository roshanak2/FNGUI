package GUI_02;

import javax.swing.*;

public class GUIRahmen2 {
    private JPanel panelMain;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rahmen_02");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GUIRahmen2().panelMain);
        frame.pack();
        frame.setVisible(true);

    }
    public GUIRahmen2(){


    }
}
