
package ex4;


public class Main {
    public static void main(String[] args) {
        OtherClass o=new OtherClass();
        o.setAge(45);
        o.setName("Lai thi Teo");
        System.out.println("");
        System.out.println(o.getName());
        System.out.println(o.getNumberOfWords());
        System.out.println(o.getOld());
        AbstractClassDemo a=new OtherClass();
        a.setName("To Vinh Hoa nam");
        a.setAge(67);
        System.out.println(a.getNumberOfWords());
        System.out.println(a.getOld());
        Geometric2D g=new Square(12);
        Square s=new Square(14);
        System.out.println(g.perimeter());
        System.out.println(s.area());
        Outer o1=new Outer("Outer class");
        Outer.Inner i=o1.new Inner(1,9,2019);
        System.out.println(i.getD());
    }
    
}
