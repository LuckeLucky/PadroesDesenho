package CustoTransporte;


import Transporte.Elemento;

public class PrecoTransporteEpocaEspecial extends PrecoTransporte {

    public PrecoTransporteEpocaEspecial(Elemento elemento) {
        super(elemento);
    }

    @Override
    public void precoTransporte() {
        System.out.println("Preço do transporte em epoca Especial ="+elemento.precoTotal()*0.10);
    }
}
