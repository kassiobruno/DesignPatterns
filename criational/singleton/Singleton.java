package criational.singleton;

public class Singleton {
  private static Singleton instance;

  //Construtor privado para evitar instanciação direta
  private Singleton() {
  }

  //Método estático para retornar a única instância da classe
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }

  //Outros métodos da classe
  public void showMessage() {
    System.out.println("Olá, eu sou uma instância Singleton!");
  }
}