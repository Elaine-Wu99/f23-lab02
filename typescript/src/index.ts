import { newRenderer } from "./renderer.js";
import { Shape } from "./shapes/shape.js";
import { square } from "./shapes/square.js";
import { newRectangle } from "./shapes/rectangle.js";
import { circle } from "./shapes/circle.js";

const squareShape: Shape = square(5);
const rectangleShape: Shape = newRectangle(4, 6);
const circleShape: Shape = circle(3);

const squareRenderer = newRenderer(squareShape);
const rectangleRenderer = newRenderer(rectangleShape);
const circleRenderer = newRenderer(circleShape);

squareRenderer.draw();
rectangleRenderer.draw();
circleRenderer.draw();
