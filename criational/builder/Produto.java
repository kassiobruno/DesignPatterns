package criational.builder;

//Classe do objeto complexo a ser construído
public class Produto {
  private String propriedade1;
  private String propriedade2;
  //...outras propriedades

  public void setPropriedade1(String propriedade1) {
    this.propriedade1 = propriedade1;
  }

  public void setPropriedade2(String propriedade2) {
    this.propriedade2 = propriedade2;
  }

  //...outros setters
}
