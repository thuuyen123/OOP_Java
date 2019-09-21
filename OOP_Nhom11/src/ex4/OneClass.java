
package ex4;


public class OneClass extends AbstractClassDemo 
        implements Geometric2D, Geometric3D {
    
    @Override
    public String getOld() {
        return super.getAge()>=50?"old":"adult";
    }

    @Override
    public int getNumberOfWords() {
        String n=super.getName();
        String[] st=n.split(" ");
        return st.length;
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
