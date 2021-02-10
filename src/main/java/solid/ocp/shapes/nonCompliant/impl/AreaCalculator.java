package solid.ocp.shapes.nonCompliant.impl;

import solid.ocp.shapes.nonCompliant.Shape;

/***
 * Sums the areas of a list of shapes
 */
public class AreaCalculator {

    public double calculate(Shape[] shapes){
        double total = 0.0;
        for (Shape s:shapes) {
            if(s instanceof Square){
                double side = ((Square) s).getSide();
                total += side*side;
            }
            else if(s instanceof Circle){
                double radius =((Circle) s).getRadius();
                total += radius * radius * Math.PI;
            }
        }
        return total;
    }
}
