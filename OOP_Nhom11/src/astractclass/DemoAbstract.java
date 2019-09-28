
package astractclass;


public abstract class DemoAbstract {
    private String name;
    public DemoAbstract(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract int getSoTu();
}
