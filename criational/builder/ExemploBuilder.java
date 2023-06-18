package criational.builder;

//Exemplo de uso do Builder
public class ExemploBuilder {
  public static void main(String[] args)  {
    Produto produto = new ProdutoBuilder()
      .setPropriedade1("Valor 1")
      .setPropriedade2("Valor 2")
      //..outros setters
      .build();

    System.out.println(produto);
  }
}
