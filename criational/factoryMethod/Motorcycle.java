package criational.factoryMethod;

//Sublcasse que cria um objeto Moto
public class Motorcycle extends Vehicle {
  @Override
  public void createVehicle() {
    System.out.println("Um nova moto foi criada");
  }
}