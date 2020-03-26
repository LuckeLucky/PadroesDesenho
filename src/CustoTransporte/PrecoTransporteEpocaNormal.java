package CustoTransporte;

import Transporte.Elemento;

public class PrecoTransporteEpocaNormal implements PrecoTransporte {


    @Override
    public float percentagemPreco() {
        return 0.05f;
    }
}
