package solid.lsp.rectangles.nonCompliant;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class SquareTest {

    @Test
    public void calculateArea() throws Exception {
        Square s = new Square();
        s.setHeight(5.0);

        assertEquals(5.0*5.0, s.area());
    }
}