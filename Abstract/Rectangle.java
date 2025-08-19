package Abstract;

public class Rectangle extends Shape {

    int l;
    int b;

    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
        area();
        corner();
    }

    @Override
    void area(){
        System.out.println("Area of reactangle is: "+(l*b));
    }

    @Override
    void corner(){
        System.out.println("Rectangle has 4 corner");
    }   
}
