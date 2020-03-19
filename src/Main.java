import Autenticação.Autenticacao;
import CriacaoReutilizacaoObjetos.Factory;
import Transporte.*;

public class Main {
    public static void main(String args[]){
        Composite Contentor =Factory.makeProduct("Contentor");
        Composite Caixa = Factory.makeProduct("Caixa");
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
        System.out.println("preco ="+Contentor.PrecoTotal());


    }
}
