package GUI_12;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private Font f1 = new Font("Comic Sans MS",Font.BOLD,20);
    private Font f2 = new Font("Thoma",Font.BOLD,12);
    private Font fGraph = new Font("New Times Roman",Font.PLAIN, 5);

    private int sizeX;
    private int sizeY;


    private boolean jButtonZeichneIsSelected = false;


    private double a = 0;
    private double b = 0;
    private double c =0;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



    public MyFrame(){

        setContentPane(new GUI_12.GUIRahmen12(this).getPanel());
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


    public void paint(Graphics g) {

        super.paintComponents(g);
        sizeX = this.getWidth();
        sizeY = this.getHeight();

        if (a != 0 || b != 0 || c != 0) {
            double y;
            int startX = sizeX / 100 - 1;
            for (double x = startX * -1; x <= startX;x++){

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

