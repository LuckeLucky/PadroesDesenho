package Transporte;

import java.util.ArrayList;

public class Composite implements Elemento{

    private ArrayList<Elemento> elementos;

    String label;
    double preco;

    public Composite(String label) {
        this.setLabel(label);
        this.elementos = new ArrayList<>();
    }

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


    public void adicionarElemento(Elemento elemento){
        this.elementos.add(elemento);
    }

    @Override
    public void showOptions() {
        System.out.println(this.getLabel());
        for(int i=0;i<elementos.size();i++){
            elementos.get(i).showOptions();
        }
    }

    @Override
    public double PrecoTotal(){
        double soma = 0;
        for(int i=0;i<elementos.size();i++){
           soma += elementos.get(i).PrecoTotal();
        }
        this.setPreco(soma);
        return soma;
    }
}
