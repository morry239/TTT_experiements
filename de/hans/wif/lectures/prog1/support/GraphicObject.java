package de.hans.wif.lectures.prog1.support;

public class GraphicObject {
    public static void main(String[] args){
        //SinFunctionPlotter sincos = new SinFunctionPlotter(299,2340,2999,2999,299,200,299, 877);


        GraphicsPanel graphicsPanel = new GraphicsPanel(640, 480, "Programmierung 1 Übung 7");
        //graphicsPanel.addGraphicObject(sincos);
        // number of line segments to plot

        //graphicsPanel.addGraphicObject(f);
        graphicsPanel.addGraphicObject(new FunctionPlotter(-Math.PI, 3*Math.PI, -1.1, 1.1, 0.01));
    }
}
