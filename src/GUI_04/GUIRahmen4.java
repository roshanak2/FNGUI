package GUI_04;

import javax.swing.*;
import java.awt.*;

public class GUIRahmen4 extends JFrame{
    private JPanel panelMain;
    private Font f1 = new Font("Comic Sans MS",Font.BOLD,20);
    private Font f2 = new Font("Thoma",Font.BOLD,12);

    public static void main(String[] args) {
        GUIRahmen4 frame = new GUIRahmen4();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GUI_04.GUIRahmen4().panelMain);

        frame.pack();
        frame.setVisible(true);
    }

    public GUIRahmen4(){

    }
    public void paint(Graphics g){
        super.paintComponents(g);

        g.setFont(f2);
        g.drawString("x",580,290);
        for (int i = -5; i<= 5; i++){
            String str =String.valueOf(i);
            if (i != 0){
                g.drawString("|"+str,298+i *50,280);

            }
        }
        g.drawString("y",290,60);
        for(int i = 4; i >= -4;i--){
            if (i!=0){
                g.drawString("-"+i,300,((-i *50)+275));
            }
        }


        g.setColor(Color.pink);
        g.setFont(f1);
        g.drawString("Roshanak",50,70);

        g.setColor(Color.BLUE);
        g.drawString(". ",300,270);
        g.fillOval(295,265,10,10);

        g.setColor(Color.BLACK);
        g.drawLine(10,270,600,270); // X-ACHSE
        g.drawLine(300,40,300,500); // Y-Achse

    }
}

