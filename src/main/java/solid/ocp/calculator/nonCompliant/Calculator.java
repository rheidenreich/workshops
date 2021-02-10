package solid.ocp.calculator.nonCompliant;

import solid.ocp.calculator.nonCompliant.impl.Addition;
import solid.ocp.calculator.nonCompliant.impl.Subtraction;

/***
 * Sums the areas of a list of shapes
 */
public class Calculator {

    public void calculate(Operation o){
        if(o instanceof Addition){
            Addition addition = (Addition) o;
            addition.setResult(addition.getLeft() + addition.getRight());
        }
        else if(o instanceof Subtraction){
            Subtraction subtraction = (Subtraction) o;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
}
