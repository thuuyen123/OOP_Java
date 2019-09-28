
package car;



public class Car extends Vehicle{
    //types of engine, number of seats
    private String type;
    private int numofseat;
    public Car(){}
    public Car(String vin, String manufacturer, 
            String color, int year, double cost,
            String type,int numofseat){
        super(vin, manufacturer, color, year, cost);
        this.type=type;
        this.numofseat=numofseat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumofseat() {
        return numofseat;
    }
    @Override
    public double getCost(){
        if(super.getCost()>50000)
            return super.getCost()*0.95;
        else
            return super.getCost();
    }
    public void setNumofseat(int numofseat) {
        this.numofseat = numofseat;
    }
    public String tString(){
        return super.toString()+"\t"+type+"\t"+numofseat;
    }
}
