package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        Shape square = new Square(3.0);
        Shape rectangle = new Rectangle(2, 3);


        Renderer circleRenderer = new Renderer(circle);
        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer squareRenderer = new Renderer(square);

        circleRenderer.draw();
        rectangleRenderer.draw();
        squareRenderer.draw();
    }
}
