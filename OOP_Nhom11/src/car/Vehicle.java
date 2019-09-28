
package car;



public class Vehicle {
   //VIN (Vehicle Identification Number), manufacturer, 
    //manufacture year, cost, color
    private String vin,manufacturer,color;
    private int year;
    private double cost;
    public Vehicle(){}

    public Vehicle(String vin, String manufacturer, 
            String color, int year, double cost) {
        this.vin = vin;
        this.manufacturer = manufacturer;
        this.color = color;
        this.year = year;
        this.cost = cost;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString(){
        return vin+"\t"+manufacturer+"\t"+color+"\t"+year+"\t"+cost;
    }    
}
