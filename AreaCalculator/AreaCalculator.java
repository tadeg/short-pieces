public class AreaCalculator {

    // CONTENT: a concept of Method overloading
    // an option when the same method name is used, but with different parameters 
    
    public static double area (double radius) {
        if (radius <0 ) {
            return -1.0;
        }
        double power = Math.pow(radius, 2);
        double areaOfFigure = Math.PI * power;
        return areaOfFigure;
    }

    public static double area (double rectSide1, double rectSide2) {
        if ((rectSide1 <0 ) || (rectSide2 <0)) {
            return -1.0;
        }
        double areaOfFigure = rectSide1 * rectSide2;
        return areaOfFigure;
    }
}
