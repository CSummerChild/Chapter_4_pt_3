/**Class: Triangle
 * @author Tyler Robinson
 * @version 1.3
 * Course: ITEC 2140 Spring 2023
 * Written: April 9, 2024
 */


package triangle;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleSideException("Side lengths must be positive.");
        } else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleSideException("Invalid side lengths for a triangle.");
        } else {
            return true;
        }
    }
}
