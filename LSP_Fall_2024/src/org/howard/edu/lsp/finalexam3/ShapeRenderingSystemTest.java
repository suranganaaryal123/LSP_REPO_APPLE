package src.org.howard.edu.lsp.finalexam3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeRenderingSystemTest {

    @Test
    public void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.createShape("circle"); 
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape rectangle = factory.createShape("rectangle"); 
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape triangle = factory.createShape("triangle");  
        assertNotNull(triangle);
        assertTrue(triangle instanceof Triangle);
    }

    @Test
    public void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape unknown = factory.createShape("hexagon");  // Change getShape() to createShape()
        assertNull(unknown);
    }
}
