package car;



import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        VehicleMS list=new VehicleMS();
        while(true){
            System.out.println("1. input a Car");
            System.out.println("2. input a Motor");
            System.out.println("3. display a list");
            System.out.println("4. delete");
            System.out.println("5. Update");
            System.out.println("6. sort by year");
            System.out.println("7. sum of group by year");
            System.out.println("8. sortByYearAndColor");
            System.out.println("9. sort by cost");
            System.out.println("10. sort by mat");
            System.out.println("0. exit");
            System.out.print("enter selection: ");
            int choice;
            Scanner in=new Scanner(System.in);
            choice=Integer.parseInt(in.nextLine());
            switch(choice){
                case 1:list.inputCar();
                       break;
                case 2:list.inputMotor();
                       break;
                case 3:list.dipslay();
                       break;
                case 4:list.delete();
                       break;
                case 5:list.update();
                       break;  
                case 6:
                    list.sortByYear();
                    list.dipslay();
                case 7:list.sumByYear();
                     break;
                case 8:list.sortByYearAndColor();
                    list.dipslay();
                    break;
                case 9:
                    list.sortByCost();
                    list.dipslay();
                    break;
                case 10:
                    list.sortByManufacturer();
                    list.dipslay();
                    break;
                case 0:System.out.println("bye!!!!");
                       System.exit(0);
                       break; 
                default: System.out.println("only enter 0-10");
                        break;
            }
            
        }
    }
    
}
