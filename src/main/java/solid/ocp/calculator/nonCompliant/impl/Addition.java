package solid.ocp.calculator.nonCompliant.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import solid.ocp.shapes.nonCompliant.Shape;

@Getter
@Setter
@AllArgsConstructor
public class Addition implements Shape {
    private double left;
    private double right;
    private double result = 0.0;
}
