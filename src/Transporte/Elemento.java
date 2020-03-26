package Transporte;

public abstract class Elemento {

     private String label;
     private float preco;

     public Elemento(String label) {
          this.label = label;
     }

     public String getLabel() {
          return label;
     }

     public float getPreco() {
          return preco;
     }

     public void setPreco(float preco){
          this.preco = preco;
     }

     public abstract float precoTotal();

     public abstract void mostrarConteudo();
}

