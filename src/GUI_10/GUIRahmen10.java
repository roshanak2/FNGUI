package GUI_10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIRahmen10 {
    public JPanel panelMain1;
    private JButton endeButton1;
    private JButton zeichnenButton1;

    public GUIRahmen10(MyFrame myFrame) {
        zeichnenButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.setJButtonZeichneIsSelected(true);
                myFrame.repaint();
            }
        });
        endeButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getPanelMain1(){
        return panelMain1;
    }
}
