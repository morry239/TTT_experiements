package de.hans.wif.lectures.prog1.support;

import org.w3c.dom.css.Rect;

import java.awt.*;

public class Klassenhierarchie {
    public String color(Circle radius){
         return "PrintCircle: " + radius.getCircle();
    }

    public String color(Rectangle width, Rectangle height){
         return "PrintRectangle" + width.getRectangle() + height.getRectangle();
    }
    public static void main(String[] args) {
     //die Rectangle- und Circle Objekten erzeugen und dieses auf dem Bildschirm ausgeben
        //Rectangle r = new Rectangle(2,2, Color.getColor("red"), 7, 9);
        //Circle c = new Circle(2,2,Color.getColor("green"), 9);

        Klassenhierarchie k = new Klassenhierarchie();

        Rectangle rect = new Rectangle(300, 320, 50, 450);
        Circle circle = new Circle(300, 210, 50);
        CircleSegment lamp = new CircleSegment(400, 240, 120, 45, 135); //hilfsstellung
        CircleSegment sonne = new CircleSegment(640, 0, 120, 180, 270);
        //CircleSegment untereteil = new CircleSegment(300,320,90, 45,225);
        CircleSegment utt = new CircleSegment(320,320,90, 0,180);

        GraphicsPanel graphicsPanel = new GraphicsPanel(640, 480, "PRG1-52");
        graphicsPanel.addGraphicObject(rect);
        graphicsPanel.addGraphicObject(circle);
        graphicsPanel.addGraphicObject(sonne);
        //graphicsPanel.addGraphicObject(lamp);
        graphicsPanel.addGraphicObject(utt);

        //r.x = 2;
        //r.y = 3;

        //System.out.println(k.color(9,9,Color.getColor("red", 1));
        /*System.out.println(new StringBuilder(r.toString())
                .append(", area = ").append(r.getArea())
             */

        //r.print();


    }
}
