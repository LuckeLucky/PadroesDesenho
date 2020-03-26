import Autenticação.*;
import CriacaoReutilizacaoObjetos.*;
import CustoTransporte.*;
import Transporte.*;

public class Main {
    public static void main(String args[]){
        Pool p = Pool.getInstancia();
        Composite Contentor = null;
        Composite Caixa = null;
        try {
            Contentor = p.createComposite("Contentor");
            Caixa = p.createComposite("Caixa");
        } catch (ObjectoCargaInexistente objectoCargaInexistente) {
            objectoCargaInexistente.printStackTrace();
        }
        Composite Embalagem = new Composite("Embalagem");
        Leaf comprimido1 = new Leaf("Comprimido",120);
        Leaf comprimido2 = new Leaf("Comprimido",120);
        Embalagem.adicionarElemento(comprimido1);
        Embalagem.adicionarElemento(comprimido2);
        Caixa.adicionarElemento(Embalagem);
        Contentor.adicionarElemento(Caixa);
        Contentor.showOptions();
        PercentagemPreco pp = new PercentagemPreco();
        try {
            float x =Contentor.precoTotal()*pp.getPercentagem("Normal");
            System.out.println("O preco do transporte é "+x+" enquanto o total era "+Contentor.precoTotal());
        } catch (EpocaInexistente epocaInexistente) {
            epocaInexistente.printStackTrace();
        }

        p.releaseComposite(Contentor);
        Contentor.showOptions();


    }
}
