package CustoTransporte;


import Transporte.Elemento;

public abstract class PrecoTransporte {

     Elemento elemento;

     public PrecoTransporte(Elemento elemento) {
          this.elemento = elemento;
     }

     public abstract void precoTransporte();
}
