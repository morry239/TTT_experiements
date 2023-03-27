package de.hans.wif.lectures.prog1.support;

public class SinFunctionPlotter extends FunctionPlotter {

    public SinFunctionPlotter(double xMin, double xMax, double yMin, double yMax, double xStep) {
        super(xMin, xMax, yMin, yMax, xStep);
    }

    public double computeValue(double x){
        x = new java.util.Scanner(System.in).nextDouble();
      double b = Math.sin(x);
      return b;
    }
}
