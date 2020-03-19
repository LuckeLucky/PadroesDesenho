package CriacaoReutilizacaoObjetos;

import Transporte.*;

public abstract class Factory {

    public static Composite makeProduct(String type){
        Composite e;

        switch(type){
            case "Caixa":
                e = new Composite("Caixa");
                break;
            case "Contentor":
                e = new Composite("Contentor");
                break;
            default:
                e = null;
                break;
        }
        return e;
    }
}
