import Autenticação.Autenticacao;
import CriacaoReutilizacaoObjetos.Factory;
import CriacaoReutilizacaoObjetos.Pool;
import CustoTransporte.PrecoTransporte;
import CustoTransporte.PrecoTransporteEpocaEspecial;
import CustoTransporte.PrecoTransporteEpocaNormal;
import Transporte.*;

public class Main {
    public static void main(String args[]){
        Pool p = Pool.getInstance();
        Composite Contentor =p.createComposite("Contentor");
        Composite Caixa = p.createComposite("Caixa");
        Composite Embalagem = new Composite("Embalagem");
        Leaf comprimido1 = new Leaf("Comprimido");
        Leaf comprimido2 = new Leaf("Comprimido");
        comprimido1.setPreco(120);
        comprimido2.setPreco(120);
        Embalagem.adicionarElemento(comprimido1);
        Embalagem.adicionarElemento(comprimido2);
        Caixa.adicionarElemento(Embalagem);
        Contentor.adicionarElemento(Caixa);
        Contentor.showOptions();
        PrecoTransporte pt = new PrecoTransporteEpocaNormal(Contentor);
        pt.precoTransporte();


    }
}
