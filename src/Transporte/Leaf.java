package Transporte;

public class Leaf extends Elemento {

    public Leaf(String label,float preco){
        super(label);
        super.preco = preco;
    }

    @Override
    public float precoTotal() {
        return super.preco;
    }


    @Override
    public void showOptions() {

        System.out.println(this.getLabel());
    }

}
