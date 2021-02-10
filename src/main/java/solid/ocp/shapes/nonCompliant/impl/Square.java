package solid.ocp.shapes.nonCompliant.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import solid.ocp.shapes.nonCompliant.Shape;

@Setter
@Getter
@AllArgsConstructor
public class Square implements Shape {
    private double side;
}
