package Autenticação;

import java.util.HashMap;

public class Autenticacao {
    private static Autenticacao instancia = null;
    private HashMap<String,String> utilizadores;

    private Autenticacao() {
        this.utilizadores = new HashMap<>();
    }

    public static Autenticacao getInstancia(){
        if(instancia == null){
            instancia = new Autenticacao();
        }
        return instancia;
    }

    public boolean criarUtilizador(String nome,String password){
        if(nome.equals("") || password.equals("")){
            return false;
        }
        utilizadores.put(nome,password);
        return true;
    }

    public boolean validarUtilizador(String nome,String password){
        return utilizadores.get(nome).equals(password);
    }
}
