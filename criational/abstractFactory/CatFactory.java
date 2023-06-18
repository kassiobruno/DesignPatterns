package criational.abstractFactory;

//Implantação da fábrica concreta para criar gatos
public class CatFactory implements AnimalFactory {
  @Override
  public Animal createAnimal() {
    return new Cat();
  }  
}
