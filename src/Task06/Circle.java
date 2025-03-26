package Task06;

public class Circle {
    double radius;


    public Circle(){

    }

    public void PerimetersOfCircle(){
        double perimetres = 2 * Math.PI * radius;
        System.out.println(perimetres);
    }

    public void AreaOfCircle(){
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
