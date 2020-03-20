package Transporte;

public abstract class Elemento {

     String label;
     float preco;

     public Elemento(String label) {
          this.label = label;
     }

     public String getLabel() {
          return label;
     }

     public float getPreco() {
          return preco;
     }

     public abstract float precoTotal();
     public abstract void showOptions();
}

