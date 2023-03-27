package de.hans.wif.lectures.prog1.support;

import java.awt.*;

public class CircleSegment extends Circle {

    private int startAngle;
    private int endAngle;


    public CircleSegment(int x, int y, int radius, int startAngle, int endAngle) {
        super(x, y, radius);
        this.startAngle = startAngle;
        this.endAngle = endAngle;
    }

    public void draw (Graphics g){
        g.fillArc(getX() - getRadius(), getY() - getRadius(), 2 * getRadius(), 2 * getRadius(), startAngle, endAngle - startAngle);
    }
}
