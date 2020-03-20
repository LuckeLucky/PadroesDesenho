package CustoTransporte;

import Transporte.Elemento;

public class PrecoTransporteEpocaNormal extends PrecoTransporte {


    public PrecoTransporteEpocaNormal(Elemento elemento) {
        super(elemento);
    }

    @Override
    public void precoTransporte() {
        System.out.println("Preço do transporte em epoca Normal ="+elemento.precoTotal()*0.05);
    }
}
