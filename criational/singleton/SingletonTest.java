package criational.singleton;

public class SingletonTest {
  public static void main(String[] args) {
    //Obtenção da instância Singleton
    Singleton instance = Singleton.getInstance();

    //Chamada de um método na instância Singleton
    instance.showMessage();
  }
}