package Transporte;

public class Leaf extends Elemento {

    public Leaf(String label,float preco){
        super(label);
        super.setPreco(preco);
    }

    @Override
    public float precoTotal() {
        return super.getPreco();
    }


    @Override
    public void mostrarConteudo() {
        System.out.println(this.getLabel());
    }

}
