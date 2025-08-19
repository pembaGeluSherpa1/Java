package Interface;

public class Circle implements AreaCalculator, Perimeter {
    int r;
    Circle(int r){
        this.r=r;
    }
    @Override
    public void Area() {
        System.out.println("Area of circle: "+(22/7*r*r));
    }
}
