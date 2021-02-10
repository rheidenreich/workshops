package solid.lsp.rectangles.nonCompliant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private double height = 0.0;
    private double width = 0.0;

    public double area(){
        return height * width;
    }
}
