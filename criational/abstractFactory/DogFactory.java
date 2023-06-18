package criational.abstractFactory;

//Implementação da fábrica concreta para criar cães
public class DogFactory implements AnimalFactory {
  @Override
  public Animal createAnimal() {
    return new Dog();
  }  
}
