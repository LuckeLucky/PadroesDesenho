package CustoTransporte;

import Transporte.Elemento;

public class EpocaEspecial implements PrecoEmbalagens {

    @Override
    public void aplicarDesconto(Elemento elemento) {
        System.out.println( 0.10*elemento.PrecoTotal()+" preco em epoca normal");
    }
}
