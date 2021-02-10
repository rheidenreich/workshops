package solid.ocp.shapes.nonCompliant;

import org.junit.Before;
import org.junit.Test;
import solid.ocp.shapes.nonCompliant.impl.AreaCalculator;
import solid.ocp.shapes.nonCompliant.impl.Circle;
import solid.ocp.shapes.nonCompliant.impl.Square;

import static junit.framework.TestCase.assertEquals;


public class AreaCalculatorTest {

    private AreaCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new AreaCalculator();
    }

    @Test
    public void calculate() throws Exception {
        Shape[] shapes = new  Shape[2];
        shapes[0] = new Square(3.0);
        shapes[1] = new Circle(2.0);

        assertEquals(21.566370614359172, calculator.calculate(shapes));
    }

}