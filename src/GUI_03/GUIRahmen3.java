package GUI_03;

import javax.swing.*;
import java.awt.*;

public class GUIRahmen3 extends JFrame{
    private JPanel panelMain;
    private Font f1 = new Font("Comic Sans MS",Font.BOLD,20);


    public static void main(String[] args) {
        GUIRahmen3 frame = new GUIRahmen3();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GUIRahmen3().panelMain);

        frame.pack();
        frame.setVisible(true);
    }

    public GUIRahmen3(){

    }
    public void paint(Graphics g){
        super.paintComponents(g);

        g.setColor(Color.pink);
        g.setFont(f1);
        g.drawString("Roshanak",50,70);

        g.setColor(Color.BLUE);
        g.drawString(".< Hier ist die Mittel!: ",300,270);
        g.fillOval(295,265,10,10);

        g.setColor(Color.BLACK);
        g.drawLine(10,270,600,270); // X-ACHSE
        g.drawLine(300,40,300,500); // Y-Achse

    }
}
