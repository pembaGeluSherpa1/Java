package Abstract;

public class Cricle extends Shape {
    int r;
     Cricle(int r){
        this.r=r;
        area();
        corner();
     }

    void area() {
        System.out.println("Area of the circle: "+(2*22/7*r*r));
    }

    void corner() {
        System.out.println("Circle has -1 corner");
    }
    
}
