package lab4;

class Vehi{
    String VehicleNo;
    String ChchisNo;
    String EngineNO;
    String Brand;
    double Cost;
    char Model;

    void milage()
    {
        System.out.println("Teri tho lagayi");
    }
}

class Car extends Vehi{
    Boolean  aBoolean=true;
            void drift()
            {
                System.out.println("AC HAI GI");
            }
}

class Bike extends Car{
    void ride(){
        System.out.println("Ride");
    }
}

public class Vehicle {

    public static void main(String[] args) {
        Car car = new Car();
        car.milage();
        car.drift();
        System.out.println("Panwel");
        Bike bike = new Bike();
        bike.aBoolean=false;
        bike.ride();
        bike.drift();
        bike.milage();
        System.out.println("Panwel mile KALE SAHAB");
    }
}
