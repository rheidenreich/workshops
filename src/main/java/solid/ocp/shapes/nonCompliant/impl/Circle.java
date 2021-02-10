package solid.ocp.shapes.nonCompliant.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import solid.ocp.shapes.nonCompliant.Shape;

@Getter
@Setter
@AllArgsConstructor
public class Circle implements Shape {
    private double radius;
}
