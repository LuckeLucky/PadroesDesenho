package CriacaoReutilizacaoObjetos;

import Transporte.*;

public abstract class FabricaObjetosCarga {

    public static Composite fazerObjectoCarga(String tipo) throws ObjectoCargaInexistente{
        tipo = tipo.toLowerCase();
        Composite e;

        switch(tipo){
            case "caixa":
                e = new Composite("Caixa");
                break;
            case "contentor":
                e = new Composite("Contentor");
                break;
            default:
                throw new ObjectoCargaInexistente();
        }
        return e;
    }
}
