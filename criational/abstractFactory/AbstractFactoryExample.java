package criational.abstractFactory;

//Classe de teste
public class AbstractFactoryExample {
  public static void main(String[] args) {

    //Criação da fábrica de cães
    AnimalFactory dogFactory = new DogFactory();
    //Criação de cão utilizando a fábrica
    Animal dog = dogFactory.createAnimal();
    //Chama o método do cão
    dog.makeSound();

    // Criação da fábrica de gatos
    AnimalFactory catFactory = new CatFactory();
    // Criação do gato utilizando a fábrica
    Animal cat = catFactory.createAnimal();
    // Chama o método do gato
    cat.makeSound();
  }
}
