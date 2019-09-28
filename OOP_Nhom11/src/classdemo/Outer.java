
package classdemo;


public class Outer {
   private String name;

    public Outer() {
    }

    public Outer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //nested class
   class Inner{
       private int num;

        public Inner(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
       
   }
}
