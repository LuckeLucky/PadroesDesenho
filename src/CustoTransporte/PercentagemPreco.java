package CustoTransporte;

public class PercentagemPreco {
    private PrecoTransporte precoTransporteEpocaNormal;
    private PrecoTransporte precoTransporteEpocaEspecial;

    public PercentagemPreco() {
        this.precoTransporteEpocaNormal = new PrecoTransporteEpocaNormal();
        this.precoTransporteEpocaEspecial = new PrecoTransporteEpocaEspecial();
    }

    public float getPercentagem(String epoca) throws EpocaInexistente {
        epoca = epoca.toLowerCase();
        switch(epoca){
            case "normal":
                return precoTransporteEpocaNormal.percentagemPreco();
            case "especial":
                return precoTransporteEpocaEspecial.percentagemPreco();
            default:
                throw new EpocaInexistente();
        }
    }
}
