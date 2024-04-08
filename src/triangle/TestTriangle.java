package triangle;

public class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            if (triangle1.checkSides()) {
                System.out.println("Triangle 1 is valid.");
            }

            Triangle triangle2 = new Triangle(1, 1, 3);
            if (triangle2.checkSides()) {
                System.out.println("Triangle 2 is valid.");
            }

            Triangle triangle3 = new Triangle(-2, 5, 7); // Invalid triangle
            triangle3.checkSides();
        } catch (IllegalTriangleSideException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
