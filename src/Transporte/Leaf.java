package Transporte;

public class Leaf implements Elemento {

    String label;
    double preco;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Leaf(String label) {
        this.setLabel(label);
    }

    @Override
    public void showOptions() {
        System.out.println(this.getLabel());
    }

    @Override
    public double PrecoTotal(){
        return this.getPreco();
    }
}
