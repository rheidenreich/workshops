package solid.lsp.rectangles.nonCompliant;

import lombok.Getter;

@Getter
public class Square extends Rectangle {

    public void setWidth(double w){
        super.setWidth(w);
        super.setHeight(w);
    }

    public void setHeight(double h){
        super.setWidth(h);
        super.setHeight(h);
    }
}
