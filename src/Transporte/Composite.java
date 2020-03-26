package Transporte;

import java.util.ArrayList;

public class Composite extends Elemento{

    private ArrayList<Elemento> elementos;

    public Composite(String label) {
        super(label);
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(Elemento elemento){

        this.elementos.add(elemento);
    }

    public void limpar(){

        super.setPreco(0);
        this.elementos.clear();
    }

    @Override
    public void mostrarConteudo() {
        System.out.println(this.getLabel());
        for(int i=0;i<elementos.size();i++){
            elementos.get(i).mostrarConteudo();
        }
    }

    @Override
    public float precoTotal(){
        float soma = 0;
        for(int i=0;i<elementos.size();i++){
           soma += elementos.get(i).precoTotal();
        }
        super.setPreco(soma);
        return soma;
    }
}
