package ex03;
import java.lang.Math;

public class Area extends Shape{
    @Override
    void RectangleArea(double length, double breadth){
        System.out.println(length * breadth);
    }
    
    @Override
    void SquareArea(double side){
        System.out.println(Math.pow(side, 2));
    }

    @Override
    void CircleArea(double radius){
        System.out.println(3.14 * Math.pow(radius, 2));
    }
}
