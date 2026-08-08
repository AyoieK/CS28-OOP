package week2;
public class Car {
  String brand;
  int speed;

  public Car(String brand, int speed) {
    this.brand = brand;
    this.speed = speed;

  }

  public static void main(String[] args) {
    String brand = "Toyota";
    int speed = 100;
    Car car = new Car(brand, speed);
    car.carBrand();
    car.carEngineStart();
    car.carDriver();
    car.carEngineStop();
  }

  void carBrand(){
      System.out.println(brand + " is the brand of the car");
    }

  void carDriver(){
    System.out.println("Car is driving at " + speed + " km/h");
  }

  void carEngineStart(){
    System.out.println("Car engine started");
  }

  void carEngineStop(){
    System.out.println("Car engine stopped");
  }
}