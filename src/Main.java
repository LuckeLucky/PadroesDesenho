import Autenticação.Autenticacao;
import CriacaoReutilizacaoObjetos.Factory;
import CriacaoReutilizacaoObjetos.Pool;
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
        p.releaseComposite(Contentor);
        Composite c2 = p.acquireComposite("Contentor");
        c2.showOptions();
        System.out.println("preco ="+Contentor.PrecoTotal());


    }
}
