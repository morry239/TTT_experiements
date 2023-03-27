package de.hans.wif.lectures.prog1.support;
import de.hans.wif.lectures.prog1.support.GraphicsPanel.GraphicObject;

import java.awt.*;

public abstract class GeometricObject extends GraphicsPanel.GraphicObject {
    //Eigenschaften sind private
    //private int x;
    //private int y;
    int x;
    int y;
    private Color color;
    private double umfang;
    private int radius;
    private int width;
    private int height;


    public abstract double getArea();
    public abstract double getCircumference();


    public GeometricObject(int x, int y){
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public void print(){
        System.out.print(
          new StringBuilder()
          .append("all I want")
          .append("for ").append(x)
          .append(" is ").append(y)
          .toString()
        );
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        String res = sb.append("juhuu").toString();
        return res;
    }

    //Methoden und Konstruktoren sind public
    public void draw(Graphics g){
        Rectangle rechtseck = new Rectangle(x, y, width, height);
        Circle kreis = new Circle(x, y, radius);
        CircleSegment cseg = new CircleSegment(x, y, radius, radius, radius);
        g.fillRect(getX(), getY(), 1, 1);
        g.drawOval(getX(), getY(), 40, 40);
        g.drawOval(getX(), getY(), 130,50);
        System.out.println ("Winter Wunderland");
    }

    protected int getX(){
        return x;
    }

    protected void setX(){
        this.x = x;
    }

    protected int getY(){
        return y;
    }

    protected void setY(){
        this.y = y;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;

    }





    //Füge Getter und Setter ein
    //die Klassen bleiben immer public da eine einige Datei für jede Klasse verwendet wird
}
