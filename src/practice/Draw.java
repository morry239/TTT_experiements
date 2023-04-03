package practice;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(new Color(255,230,204));
        g.fillRect(0,0,800,600);
        g.setColor(Color.BLACK);

        g.drawLine(325, 50, 325, 500);
        g.drawLine(475, 50, 475, 500);

        g.drawLine(175, 200, 625, 200);
        g.drawLine(175, 350, 625, 350);

        g.setColor(Color.CYAN);
        if(Gui.spieler == 0){
            g.drawString("Spieler: X", 25, 50);
        }else if(Gui.spieler == 1){
            g.drawString("Spieler: O", 25,50);
        }

        if(Gui.winner == 1){
            g.drawString("Spieler: X", 25, 100);
        }else if(Gui.spieler == 2){
            g.drawString("Spieler: O", 25,100);
        }

        if(Gui.state[0] == 1){
            g.drawString(StringLoader.imgX, 175, 50);
        } else if (Gui.state[0] == 2){
            g.drawString(StringLoader.imgO, 175, 50);
        }

        if(Gui.state[1] == 1){
            g.drawString(StringLoader.imgX, 325, 50);
        } else if (Gui.state[1] == 2){
            g.drawString(StringLoader.imgO, 325, 50);
        }

        if(Gui.state[2] == 1){
            g.drawString(StringLoader.imgX, 475, 50);
        } else if (Gui.state[2] == 2){
            g.drawString(StringLoader.imgO, 475, 50);
        }

        if(Gui.state[3] == 1){
            g.drawString(StringLoader.imgX, 175, 200);
        } else if (Gui.state[3] == 2){
            g.drawString(StringLoader.imgO, 175, 200);
        }

        if(Gui.state[4] == 1){
            g.drawString(StringLoader.imgX, 325, 200);
        } else if (Gui.state[4] == 2){
            g.drawString(StringLoader.imgO, 325, 200);
        }

        if(Gui.state[5] == 1){
            g.drawString(StringLoader.imgX, 475, 200);
        } else if (Gui.state[5] == 2){
            g.drawString(StringLoader.imgO, 475, 200);
        }

        if(Gui.state[6] == 1){
            g.drawString(StringLoader.imgX, 175, 350);
        } else if (Gui.state[6] == 2){
            g.drawString(StringLoader.imgO, 175, 350);
        }

        if(Gui.state[7] == 1){
            g.drawString(StringLoader.imgX, 325, 350);
        } else if (Gui.state[7] == 2){
            g.drawString(StringLoader.imgO, 325, 350);
        }

        if(Gui.state[8] == 1){
            g.drawString(StringLoader.imgX, 475, 350);
        } else if (Gui.state[8] == 2){
            g.drawString(StringLoader.imgO, 475, 350);
        }

        repaint();
    }
}
