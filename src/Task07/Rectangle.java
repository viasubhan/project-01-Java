package Task07;

import java.util.Formatter;

public class Rectangle {
    Formatter formatter = new Formatter();
    double width;
    double height;

    public Rectangle(){

    }

    public void AreaOfRectangle(){
//        System.out.println("Area is " + width + " * " + height + " = " + (width*height) );
        formatter.format("Area is %.1f * %.1f = %.2f\n", width, height, width * height);

    }

    public void PerimeterOfRectangle(){
//        System.out.println("Perimeter is " + "2" + " * " + "(" + width + " + " + height + ")" + " = " + (2*(width+height)));
        formatter.format("Perimeter is 2 * (%.1f + %.1f) = %.1f", width, height, 2 * (width + height));
        System.out.println(formatter.out());

    }

}
