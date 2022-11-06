package GUI_12;

import GUI_10.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIRahmen12 {
    private JPanel panel;
    private JTextField textFieldax;
    private JTextField textFieldbx;
    private JTextField textFieldc;
    private JButton zeichnenButton;
    private JButton endeButton;


        public GUIRahmen12(GUI_12.MyFrame myFrame) {
            zeichnenButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myFrame.setJButtonZeichneIsSelected(true);
                    myFrame.repaint();
                }
            });
            endeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }


    public JPanel getPanel(){
            return panel;
        }
    }



