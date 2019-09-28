
package car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.HashSet;

public class VehicleMS {
    private ArrayList<Vehicle> list;
    private Scanner in;
    public VehicleMS(){
        list=new ArrayList<>();
        in=new Scanner(System.in);
        list.add(new Car("DF121","dffe" ,"do", 1999, 150000, "vadng", 2));
        list.add(new Car("DF120","dffe" ,"do", 1999, 300000, "vadng", 2));
        list.add(new Car("DF125","dffe" ,"xanh", 2019, 222222, "vadng", 2));
        list.add(new Motor("DF011", "sdf", "xanh", 1999,150000, 4));
        list.add(new Motor("DF010", "sdf", "vang", 1991, 160000, 5));
    }
    private int SearchByVin(String vin){
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).getVin().equalsIgnoreCase(vin))
               return i;
        }
        return -1;
    }
    private Vehicle init(){
        String vin,manufacturer,color;
        int year;
        double cost;
        System.out.print("enter vin:");
        while(true){
            vin=in.nextLine().toUpperCase();
            if((SearchByVin(vin)==-1)&&(vin.matches("[A-Z]{2}\\d{3}")))
                break;
            System.err.println("not correct!!!");
            System.out.print("Enter Vin again:");
        }
        System.out.print("enter manufacturer:");
        manufacturer=in.nextLine();
        System.out.print("enter color:");
        color=in.nextLine();
        System.out.print("year:");
        year=Integer.parseInt(in.nextLine());
        System.out.print("Cost:");
        cost=Double.parseDouble(in.nextLine());
        return new Vehicle(vin, manufacturer, color, year, cost);
    }
    public void inputCar(){
        Vehicle v=init();
        String type;
        int num;
        System.out.print("enter type:");
        type=in.nextLine();
        System.out.print("enter Number of seat:");
        num=Integer.parseInt(in.nextLine());
        list.add(new Car(v.getVin(),v.getManufacturer(),
                v.getColor(),v.getYear(),v.getCost(), type, num));
    }
    public void inputMotor(){
        Vehicle v=init();
        int power;
        System.out.print("enter power:");
        power=Integer.parseInt(in.nextLine());
        list.add(new Motor(v.getVin(),v.getManufacturer(),
                v.getColor(),v.getYear(),v.getCost(), power));
    }
    public void dipslay(){
        int c=0;
        System.out.println("========Car=========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Car){
                System.out.println(list.get(i).toString());
                c++;
            }
        }
        System.out.println("Number of cars:"+c);
        c=0;
        System.out.println("=====================");
        System.out.println("=======Motor=========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Motor){
                System.out.println(list.get(i).toString());
                c++;
            }
        }
        System.out.println("=====================");
        System.out.println("Number of Motors:"+c);
    }
    public void delete(){
        System.out.print("enter Vin to delete:");
        String vin=in.nextLine();
        int pos=SearchByVin(vin);
        if(pos==-1)
            System.out.println("why to delete????");
        else{
            list.remove(pos);
            System.out.println("delete successfully");
        }
    }
    public void update(){
        System.out.print("enter Vin to edit:");
        String vin=in.nextLine();
        int pos=SearchByVin(vin);
        if(pos==-1)
            System.out.println("why to update!!!!");
        else{
            String manufacturer,color;
        int year;
        double cost;
        
        System.out.print("enter manufacturer:");
        manufacturer=in.nextLine();
        System.out.print("enter color:");
        color=in.nextLine();
        System.out.print("year:");
        year=Integer.parseInt(in.nextLine());
        System.out.print("Cost:");
        cost=Double.parseDouble(in.nextLine());
        Vehicle v=list.get(pos);
        v.setManufacturer(manufacturer);
        v.setColor(color);
        v.setCost(cost);
        v.setYear(year);
        }
    }
    //sort by String
    public void sortByManufacturer(){
        Collections.sort(list, new Comparator<Vehicle> () {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getManufacturer().compareTo(o2.getManufacturer());
            }
        });
    }
    //sort by integer
    public void sortByYear(){
        Collections.sort(list, new Comparator<Vehicle> () {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getYear()-o2.getYear();
            }
        });
    }
    //sort double
    public void sortByCost(){
        Collections.sort(list, new Comparator<Vehicle> () {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return (int)(o1.getCost()-o2.getCost());
            }
        });
    }
    // 2 properties year and color
    public void sortByYearAndColor(){
        Collections.sort(list, new Comparator<Vehicle> () {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                if(o1.getYear()==o2.getYear())
                    return o1.getColor().compareTo(o2.getColor());
                else
                    return o1.getYear()-o2.getYear();
            }
        });
    }
    private ArrayList<Integer> getYears(){
        HashSet<Integer> h=new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            h.add(list.get(i).getYear());
        }
        return new ArrayList<>(h);
    }
    public void sumByYear(){
        ArrayList<Integer> ar=getYears();
        int c;
        for (int i = 0; i < ar.size(); i++) {
            c=0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getYear()==ar.get(i)){
                    c++;
                }
            }
            System.out.println("Year "+ar.get(i)+": "+c);
        }
    }
}
