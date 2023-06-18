package criational.abstractFactory;
//Implementação de um produto específico
public class Dog implements Animal {
  @Override
  public void makeSound() {
    System.out.println("O cão late. ");
  }
}
