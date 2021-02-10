package solid.lsp.rectangles.nonCompliant;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testArea() throws Exception {
        Rectangle r = new Rectangle();
        r.setHeight(5);
        r.setWidth(4);

        assertEquals(5*4, r.area());
    }
}