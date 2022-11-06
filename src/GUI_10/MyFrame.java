package GUI_10;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private Font f1 = new Font("Comic Sans MS",Font.BOLD,20);
    private Font f2 = new Font("Thoma",Font.BOLD,12);
    private Font fGraph = new Font("New Times Roman",Font.PLAIN, 5);

    private int sizeX;
    private int sizeY;

    private boolean jButtonZeichneIsSelected = false;

    public MyFrame(){

        setContentPane(new GUI_10.GUIRahmen10(this).panelMain1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Funktionszeichner");
        pack();
        setVisible(true);

    }

    @Override
    public void paintComponents(Graphics g){
        super.paintComponents(g);
        paint(g);
    }

    public void setJButtonZeichneIsSelected(boolean jButtonZeichneIsSelected) {
        this.jButtonZeichneIsSelected = jButtonZeichneIsSelected;

    }


    public void paint(Graphics g){

        super.paintComponents(g);
        sizeX = this.getWidth();
        sizeY = this.getHeight();

        g.setColor(Color.WHITE);
        g.setFont(f1);
        g.drawString("Roshanak",50,70);


        g.setColor(Color.BLACK);
        g.drawLine(10,sizeY/2+20 ,sizeX,sizeY/2 +20); // X-ACHSE
        g.drawLine(sizeX/2,40,sizeX/2,sizeY); // Y-Achse


            g.setFont(f2);
            g.drawString("x",sizeX-20,sizeY/2+20);
            for (int i = -10; i<= 10; i++){
                String str =String.valueOf(i);
                if (i != 0){
                    g.drawString("|"+str,sizeX/2+i * sizeX/12,sizeY/2+10+20);

                }
            }

            g.drawString("y",sizeX/2 + 15,50);
            for(int i = 10; i >= -10;i--){
                if (i!=0){
                    g.drawString("-"+i,sizeX/2,((-i *sizeX/12)+ sizeY/2+20));
                }
            }


        if (jButtonZeichneIsSelected){
            g.setFont(fGraph);
            for (double x= -5; x <= 5; x = x + 0.001){
                double y = x * x -1;
                g.drawString(".",sizeX/2 + (int) (x *sizeX/12),sizeY/2+20- (int)(y*sizeX/12));

            }


    }












    }
}

