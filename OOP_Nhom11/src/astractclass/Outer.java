
package astractclass;


public class Outer {
    private String name;
    public Outer(){
        
    }   
    public Outer(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    //nested class
    class Inner{
        private int age;
        public Inner(int age){
            this.age=age;
        }
        public int getAge(){
            return age;
        }
    }
}
