/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;


/**
 *
 * @author ADMIN
 */
public class Motor extends Vehicle {
     public int power;

    public Motor() {
    }

    public Motor(String vin, String manufacturer, 
            String color, int year, double cost,int power ) {
        super(vin, manufacturer, color, year, cost);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
     public String toString(){
         return super.toString()+"\t"+power;
     }
}
