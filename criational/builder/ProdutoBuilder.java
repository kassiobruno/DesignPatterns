package criational.builder;

//Classe Builder para construir o objeto complexo
public class ProdutoBuilder {
  private Produto produto;

  public ProdutoBuilder() {
    this.produto = new Produto();
  }

  public ProdutoBuilder setPropriedade1(String propriedade1) {
    produto.setPropriedade1(propriedade1);
    return this;
  }

  public ProdutoBuilder setPropriedade2(String propriedade2) {
    produto.setPropriedade2(propriedade2);
    return this;
  }

  //...outros setters

  public Produto build() {
    return produto;
  }
}
