package java8.static_default;

interface Vehicle{

    default void showFuelEfficiency(){
        System.out.println("Vehicle Fuel Efficiency: 15Km/l");
    }
    static double convertKmToMiles(double km){
        return km*0.621;
    }
}

class Car implements Vehicle{
    @Override
    public void showFuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 18Km/l");
    }
}

class Bike implements Vehicle{

}



public class StaticDefaultMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.showFuelEfficiency();
        bike.showFuelEfficiency();

        double miles = Vehicle.convertKmToMiles(10.0);
        System.out.println(miles);
    }
}
