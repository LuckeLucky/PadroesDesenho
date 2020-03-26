package CriacaoReutilizacaoObjetos;

import Transporte.Composite;

public abstract class FabricaObjetosCarga {

    public static Composite fazerObjectoCarga(String tipo) throws ObjectoCargaInexistente{
        Composite e;

        switch(tipo){
            case "Caixa":
                e = new Composite("Caixa");
                break;
            case "Contentor":
                e = new Composite("Contentor");
                break;
            default:
                throw new ObjectoCargaInexistente();
        }
        return e;
    }
}
