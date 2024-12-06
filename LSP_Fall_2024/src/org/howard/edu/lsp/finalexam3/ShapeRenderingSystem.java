package src.org.howard.edu.lsp.finalexam3;

interface Shape {
    void draw(); // Each shape must define its own draw behavior
}

// Circle Class representing a Circle shape
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rendering a Circle");
    }
}

// Rectangle Class representing a Rectangle shape
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rendering a Rectangle");
    }
}

// Triangle Class representing a Triangle shape
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rendering a Triangle");
    }
}

// Singleton ShapeFactory to manage and provide Shape objects
class ShapeFactory {
    // Static reference to hold the single instance of ShapeFactory
    private static ShapeFactory shapeFactoryInstance;

    // Private constructor to avoid direct object creation
    private ShapeFactory() {}

    // Method to retrieve the singleton instance of ShapeFactory
    public static ShapeFactory getInstance() {
        if (shapeFactoryInstance == null) {
            shapeFactoryInstance = new ShapeFactory();  // Create the instance if not already created
        }
        return shapeFactoryInstance;
    }

    // Returns an instance of a specific Shape based on input string
    public Shape createShape(String shapeName) {
        if (shapeName == null) return null;
        switch (shapeName.toLowerCase()) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "triangle": return new Triangle();
            default: return null; // Invalid shape type provided
        }
    }
}

// ShapeRenderer class to interact with the ShapeFactory and render shapes
public class ShapeRenderingSystem {
    private final ShapeFactory shapeFactory; // The singleton instance of the factory

    // Constructor initializes the shape factory
    public ShapeRenderingSystem() {
        this.shapeFactory = ShapeFactory.getInstance();
    }

    // Method to render the shape based on the specified type
    public void renderShape(String shapeName) {
        Shape shapeObject = shapeFactory.createShape(shapeName); // Fetch the shape object from factory
        if (shapeObject != null) {
            shapeObject.draw(); // Call the draw method on the shape object
        } else {
            System.out.println("Unknown shape type: " + shapeName);
        }
    }

    // Main method to demonstrate rendering of different shapes
    public static void main(String[] args) {
        ShapeRenderingSystem shapeRenderer = new ShapeRenderingSystem();
        shapeRenderer.renderShape("circle");    // Output: Rendering a Circle
        shapeRenderer.renderShape("rectangle"); // Output: Rendering a Rectangle
        shapeRenderer.renderShape("triangle");  // Output: Rendering a Triangle
        shapeRenderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}