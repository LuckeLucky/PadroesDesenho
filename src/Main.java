import Autenticação.*;
import CriacaoReutilizacaoObjetos.*;
import CustoTransporte.*;
import Transporte.*;

public class Main {
    public static void main(String args[]){
        Pool p = Pool.getInstance();
        Composite Contentor =p.createComposite("Contentor");
        Composite Caixa = p.createComposite("Caixa");
        Composite Embalagem = new Composite("Embalagem");
        Leaf comprimido1 = new Leaf("Comprimido",120);
        Leaf comprimido2 = new Leaf("Comprimido",120);
        Embalagem.adicionarElemento(comprimido1);
        Embalagem.adicionarElemento(comprimido2);
        Caixa.adicionarElemento(Embalagem);
        Contentor.adicionarElemento(Caixa);
        Contentor.showOptions();
        PrecoTransporte pt = new PrecoTransporteEpocaNormal(Contentor);
        pt.precoTransporte();


    }
}
