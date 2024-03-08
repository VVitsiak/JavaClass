public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Введіть радіус круга як аргумент командного рядка");
        }

        double radius;
        try {
            radius = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Спробуйте числове значення!");
            throw e;
        }
        double circleArea = calculateCircleArea(radius);
        double rectangleArea = calculateRectangleAreaInCircle(radius);

        System.out.println("Площа круга: " + circleArea);
        System.out.println("Площа вписаного прямокутника: " + rectangleArea);
    }

    /**
     * Method to calculates the circle area
     * @param radius od the circule to caclulate the area
     * @return the area of the circle
     */
    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Method to calculates the rectangle area
     * @param radius od the rectangle to calculate the area
     * @return the area of the rectangle
     */
    private static double calculateRectangleAreaInCircle(double radius) {
        double sideLength = 2 * radius / Math.sqrt(2);
        return sideLength * sideLength;

    }
}