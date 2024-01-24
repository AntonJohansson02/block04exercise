public class TestOverlaps {
    public static void main(String[] args){
        Square square       = new Square(1,1); //static Square, dynamic Square
        Rectangle rectangle = new Rectangle(1,2); //static Rectangle, dynamic Rectangle
        Triangle triangle   = new Triangle(1,3); //static Triangle, dynamic Triangle

        // TODO: Step 1c: Predict what the result of these method calls will be.
        //   Fill in the blanks in the comment for each line before running the program.
        // square.overlaps(triangle);      // Polygon.overlaps: Polygon{} vs Triangle{}
        // square.overlaps(square);        // Polygon.overlaps: Polygon{} vs Polygon{}
        // triangle.overlaps(rectangle);   // Polygon.overlaps: Triangle{} vs Rectangle{}
        // triangle.overlaps(triangle);    // Polygon.overlaps: Triangle{} vs Triangle{}

        // TODO: Step 2b: After you have uncommented all three overridden implementations
        //   of the method 'overlaps' in the subclasses, as per step 2a,
        //   again predict the result of the same method calls above.
        //   Fill in the blanks below before running the program.
        // Square.overlaps: Square{} vs Triangle{}
        // Square.overlaps: Square{} vs Square{}
        // Triangle.overlaps: Triangle{} vs Rectangle{}
        // Triangle.overlaps: Triangle{} vs Triangle{}

        // TODO: Step 3: Now we introduce a variable with static type Polygon. What will
        //   the results be this time? Fill in the blanks as before, then uncomment all
        //   the lines below (mark all the lines and choose
        //           Code -> Comment with Block Comment
        //   from the top IntelliJ menu.
        //   You can comment out the lines from above (10-13) using the same command.
        //   Then run the program again, and see if your predictions were correct.
        //   Can you explain these outputs in terms of static and dynamic types?
        
        Polygon polyTriangle = new Triangle(1,4);

        square.overlaps(polyTriangle);          // Square.overlaps: Square{} vs Triangle{}
        triangle.overlaps(polyTriangle);        // Triangle.overlaps: Triangle{} vs Triangle{}
        polyTriangle.overlaps(triangle);        // Triangle.overlaps: Triangle{} vs Triangle{}
        polyTriangle.overlaps(polyTriangle);    // Triangle.overlaps: Triangle{} vs Triangle{}
        triangle.overlaps(triangle);            // Triangle.overlaps: Triangle{} vs Triangle{}

        // TODO: Step 4b: After you have uncommented the overloaded declaration and
        //   implementation of the method 'overlaps' in the Triangle subclass,
        //   as per step 4a, again predict the output of the five lines above.
        //   Then run the program and see if your predictions were correct.
        //   Can you still explain the outputs in terms of static and dynamic types?
        //   Square.overlaps: Square{} vs Triangle{}
        // Triangle.overlaps: Triangle{} vs Triangle{}
        // Triangle.overlaps: Triangle{} vs Triangle{}
        // Triangle.overlaps: Triangle{} vs Triangle{}
        // Triangle2.overlaps: Triangle{} vs Triangle{}


    }//main

}//TestOverlaps
