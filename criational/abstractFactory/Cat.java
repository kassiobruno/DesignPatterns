package criational.abstractFactory;

//Implementação de outro produto específico
public class Cat implements Animal {
  @Override
  public void makeSound() {
    System.out.println("O gato mia. ");
  }
}