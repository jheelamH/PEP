import java.util.Scanner;

class Vehicle{
    String model;
    int year;
    Vehicle(String model,int year){
        this.model=model;
        this.year=year;
        System.out.println(model+year);
    }
}
class Cars extends Vehicle{
    String brand;
    Cars(String model,int year,String brand){
        super(model,year);
        this.brand=brand;
        System.out.println(brand);
    }
}
public class ConstructorChaining {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String model= sc.nextLine();
        int year= sc.nextInt();
        String brand= sc.nextLine();
        Cars cars=new Cars(model,year,brand);
    }
}
