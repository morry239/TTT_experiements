package de.hans.wif.lectures.prog1.support;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class FunctionPlotter extends CartesianCoordinateObject {
    private double xStep;

    public FunctionPlotter(double xMin, double xMax, double yMin, double yMax, double xStep){
        super(xMin, xMax, yMin, yMax);
        this.xStep = xStep;
    }

    public double getxStep(){
        return xStep;
    }

    public void draw(Graphics g){
        super.draw(g);
        int w = this.getSize().width/2;
        int h = this.getSize().height/2;
        final double MAX_X = 0.5 * Math.PI;
        final double SCALE = w / MAX_X;
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.blue);

        double rangeY = Math.abs(getYMax()-getYMin());
        double rangeX = Math.abs(getXMax()-getXMin());
        //line1
        Polygon p = new Polygon();
        for (double x=-20; x <= 640; x+=rangeX/20) {
            double xScaled = x / SCALE;
            //p.addPoint(w + x, h - (int)Math.round(SCALE * Math.cos(2 * xScaled)));
            p.addPoint((int)(x+xStep+20), h - (int)Math.round(SCALE * Math.cos(5 * xScaled)));
        }
        g2.setColor(Color.blue);
        g2.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        /*Polygon p1 = new Polygon();
        for (int x = -170; x <= 170; x++) {
            p1.addPoint(x + 200, 100 - (int) (50 * Math.cos((x / 100.0) * 2
                    * Math.PI)));

        }
        g2.setColor(Color.red);
        g2.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints);*/



        Polygon p3 = new Polygon();
        for (double x = 0; x <= 640; x+=rangeX/20) {  //for (int x = 0; x <= w; x++)
            double xScaled = x / SCALE;
            //p.addPoint(w + x, h - (int)Math.round(SCALE * Math.cos(2 * xScaled)));
            p3.addPoint((int)(x+xStep), h - (int)Math.round(SCALE * Math.cos(5 * xScaled)));
        }
        g2.setColor(Color.blue);
        g2.drawPolyline(p3.xpoints, p3.ypoints, p3.npoints);

        Point yAxisDist = mapCoordinates(xAxis, getYMax());
        Point yAxisSrc = mapCoordinates(xAxis, getYMin());

        Point xAxisDist = mapCoordinates(getXMax(), yAxis);
        Point xAxisSrc = mapCoordinates(getXMin(), yAxis);


        for(double x = getXMin(); x < getXMax(); x+=rangeX/20){
            Point point = mapCoordinates(x, yAxis);
            g.setColor(Color.BLACK);
            g.drawLine(point.x, point.y-5, point.x,point.y+5 );
        }
        g.drawLine(xAxisSrc.x, yAxisSrc.y, xAxisDist.x, yAxisDist.y);

        for(double y = getYMin(); y < getXMax(); y+=rangeY/20){
            Point point = mapCoordinates(y, yAxis);
            g.setColor(Color.BLACK);
            g.drawLine(xAxisSrc.x, yAxisSrc.y, xAxisDist.x, yAxisDist.y);
        }


    }

    public double computeValue(double x){
        return 0;
    }
}
