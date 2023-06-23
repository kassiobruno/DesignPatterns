package criational.factoryMethod;

//Subclasse que cria um objeto Carro
public class Car extends Vehicle {
  @Override
  public void createVehicle() {
    System.out.println("Um novo carro foi criado");
  }
}