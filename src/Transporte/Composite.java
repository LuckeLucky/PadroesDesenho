package Transporte;

import java.util.ArrayList;

public abstract class Recipiente implements Elemento{

    private ArrayList<Elemento> elementos;

    public Recipiente() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(Elemento elemento){
        this.elementos.add(elemento);
    }

    public void mostrarElementos(){

        for(int i =0;i<elementos.size();i++){
            elementos.get(i)
        }
    }
}
