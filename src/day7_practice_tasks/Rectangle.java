package day7_practice_tasks;

public class Rectangle {
    public double width;
    public double length;

    public void calculateArea(){
        System.out.println("area of rectangle; " + (length*width));

    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of Rectangle: " + 2*(length+width));

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
