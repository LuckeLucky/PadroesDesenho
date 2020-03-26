package CriacaoReutilizacaoObjetos;

import Transporte.Composite;

import java.util.ArrayList;

public class Pool {
    private static Pool instance=null;
    private ArrayList<Composite> composites;
    private ArrayList<Composite> compositesUsed;


    private Pool(){
        composites = new ArrayList<>();
        compositesUsed = new ArrayList<>();
    }

    public static synchronized Pool getInstance() {
        if( instance== null ){
            instance = new Pool();
        }
        return instance;
    }

    public synchronized Composite acquireComposite(String type){
        for(int i =0 ; i< composites.size(); i++){
           if( composites.get(i).getLabel().equals(type)){
               return composites.get(i);
           }
        }
        return null;
    }

    public synchronized void releaseComposite(Composite composite){
        Composite c = null;
        for(int i =0 ; i< compositesUsed.size(); i++){
            if( compositesUsed.get(i).getLabel().equals(composite.getLabel())){
               c = compositesUsed.get(i);
               c.limpar();
               compositesUsed.remove(i);
               break;
            }
        }
        composites.add(c);
    }

    public synchronized Composite createComposite(String type) throws ObjectoCargaInexistente {
        Composite c = FabricaObjetosCarga.fazerObjectoCarga(type);
        compositesUsed.add(c);
        return c;
    }
}
