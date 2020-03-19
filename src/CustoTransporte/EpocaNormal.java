package CustoTransporte;

import Transporte.Elemento;

public class EpocaNormal implements PrecoEmbalagens {

    @Override
    public void aplicarDesconto(Elemento elemento) {
       System.out.println( 0.05*elemento.PrecoTotal()+" preco em epoca normal");
    }
}
