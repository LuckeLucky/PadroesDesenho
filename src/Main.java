import Autenticação.Autenticacao;

public class Main {
    public static void main(String args[]){
        Autenticacao aut;
        aut = Autenticacao.getInstancia();
        System.out.println(aut.criarUtilizador("teste","olatudobem"));
        System.out.println(aut.validarUtilizador("teste",""));

    }
}
