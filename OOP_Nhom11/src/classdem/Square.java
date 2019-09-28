
package classdem;


public class Square implements Geometric2D{
    private double width;
    public Square(){}
    public Square(double w){
       width=w;
    }
    @Override
    public double perimeter() {
        return 4*width;
    }

    @Override
    public double area() {
        return width*width;
    }
    
    
        
}
