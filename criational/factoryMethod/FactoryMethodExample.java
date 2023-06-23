package criational.factoryMethod;

//Clase que utiliza a Fábrica
public class FactoryMethodExample {
  public static void main(String[] args) {
    Vehicle vehicle1 = new Car();
    vehicle1.createVehicle(); //Saída = Um novo carro foi criado.

    Vehicle vehicle2 = new Motorcycle();
    vehicle2.createVehicle(); //Saída = Uma nova moto foi criada.
  }
}