package de.hans.wif.lectures.prog1.support;
import de.hans.wif.lectures.prog1.support.GraphicsPanel.GraphicObject;

import java.awt.*;

public class Rectangle extends GeometricObject {
    //Eigenschaften sind private
    private int width;
    private int height;
    //private int x;
    //private int y;
    /*int x;
    int y;*/
    private Color color;
    //Methoden und Konstruktoren sind public

    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }



    public int getWidth(){
        return width;
    }

    public void setWidth(){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;

    }

    public int getRectangle(){
        return this.height + this.width;
    }

    public double getArea(){
        return height * width;
    }

    @Override
    public double getCircumference(){
        return (2 * width) + (2 * height);
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        String res = sb.append("hier ist die Ansage").toString();
        return res;
    }

    public void draw(Graphics g){
        g.fillRect(x, y, width, height);
        g.setColor(getColor());
    }
    //Füge Getter und Setter ein
    //die Klassen bleiben immer public da eine einige Datei für jede Klasse verwendet wird
}
