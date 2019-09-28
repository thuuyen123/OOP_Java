
package astractclass;


public class Main {
    public static void main(String[] args) {
        Outer ot=new Outer("Outer class");
        Outer.Inner ii=ot.new Inner(12);
        System.out.println(ot.getName());
        System.out.println(ii.getAge());
        DemoAbstract d=new ConDemo("Demo for abstract");
        System.out.println();
    }
    
}
