package de.hans.wif.lectures.prog1.support;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class CartesianCoordinateObject extends GraphicsPanel.GraphicObject {
    double xMin;
    double xMax;
    double yMin;
    double yMax;
    double xAxis;
    double yAxis;


    private double xStep;

    public CartesianCoordinateObject(double xMin, double xMax, double yMin, double yMax) {
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;

    }

    //public abstract void draw(Graphics g);

    public double getXMax(){
        return xMax;
    }

    public double getXMin(){
        return xMin;
    }

    public double getYMax(){
        return yMax;
    }

    public double getYMin(){
        return yMin;
    }



    protected Point mapCoordinates(double cartesianX, double cartesianY){
      double rangeX = Math.abs(getXMax() - getXMin());
      double rangeY = Math.abs(getYMax() - getYMin());

      /*double getSize hat keinen Eigenschaften die ich erstmal einsetzen muss, und die getSIZE soll dimension-methoden sein*/
      double unitsPerPixelX = getSize().getWidth() / rangeX; //getRow = getWidth
      double unitsPerPixelY = getSize().getHeight() / rangeY; //getColumn = getHeight

      //center the coordinate system in the output screen
        /* gleiches Spiel wie oben, keine Eigenschaften eingesetzt deshalb fehler*/
        AffineTransform system = AffineTransform.getTranslateInstance(getSize().width / 2, getSize().height / 2);

      //scale the units variables
      //rotate the units variables so that the y-axis points upwards
      system.scale(unitsPerPixelX, -unitsPerPixelY);

      //shift the original coordinates to where it got left off??
       system.translate(-(getXMax() - (rangeX / 2)), -(getYMax() - (rangeY / 2)));

       //transform points
        Point2D ptSrc = new Point2D.Double(cartesianX, cartesianY);
        Point2D ptDistance = new Point2D.Double();

        //put it all together?
        Point pt = new Point();
        pt.setLocation(ptDistance.getX(), ptDistance.getY());

        return pt;
    }

    public void draw(Graphics g){






        int w = this.getSize().width/2;

        int h = this.getSize().height/2;
        Graphics2D achse = (Graphics2D) g;
        achse.setStroke(new BasicStroke(2));
        achse.setColor(Color.black);
        achse.drawLine(0,h,w*2,h);
        achse.drawLine(w,0,w,h*2);
        //achse.drawLine((int)getXMax(), (int)getYMax(), (int)getXMin(), (int)getYMin());


        //achse.drawString("0", w - 7, h + 13);

    }


}
