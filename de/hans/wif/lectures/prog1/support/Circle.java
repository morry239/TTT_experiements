package de.hans.wif.lectures.prog1.support;

import java.awt.*;
import de.hans.wif.lectures.prog1.support.GraphicsPanel.GraphicObject;

public class Circle extends GeometricObject {
    //private int x;
    //private int y;
    /*int x;
    int y; <--- nicht notwendig da diese in der Oberklasse schon definiert wurden*/

    /*GetX- und GetY- Methoden sollten hier nicht neu definiert werden (s. oben)*/
    private Color color;
    private int radius;

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    public int getCircle(){
        return this.radius;
    }


    public int getRadius(){
        return radius;
    }

    public int setRadius(){
        this.radius = radius;
        return radius;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;

    }


    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getCircumference(){
      return 2.0 * Math.PI * getRadius();
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        String res = sb.append("ich hab ganzen Tag herumgeistert").toString();
        return res;
    }

    public void draw(Graphics g){
        g.drawOval(x, y, radius, radius);
        g.fillOval(x, y, radius, radius);
        g.setColor(getColor());
    }
    //Eigenschaften sind private
    //Methoden und Konstruktoren sind public
    //Füge Getter und Setter ein
    //die Klassen bleiben immer public da eine einige Datei für jede Klasse verwendet wird
}
