package CustoTransporte;

public class PercentagemPreco {
    private PrecoTransporte precoTransporteEpocaNormal;
    private PrecoTransporte precoTransporteEpocaEspecial;

    public PercentagemPreco() {
        this.precoTransporteEpocaNormal = new PrecoTransporteEpocaNormal();
        this.precoTransporteEpocaEspecial = new PrecoTransporteEpocaEspecial();
    }

    public float getPercentagem(String epoca) throws EpocaInexistente {
        switch(epoca){
            case "Normal":
                return precoTransporteEpocaNormal.percentagemPreco();
            case "Especial":
                return precoTransporteEpocaEspecial.percentagemPreco();
            default:
                throw new EpocaInexistente();
        }
    }
}
