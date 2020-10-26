/*Este programa nos dara el descuento del abono
esto dependera de la edad que nos den*/

public class Abono{

    private float precio = 0;
    private int descuento = 0;

    public void Abono (float precio,int descuento){
        this.precio = precio;
        this.descuento = descuento;
    }

    public float getPrecio (){
    return this.precio;
    }
    public void setPrecio (float precio){
    this.precio = precio;
    }

    public int getDescuento (){
    return this.descuento;
    }
    public void setDescuento (int Descuento){
    this.descuento = descuento;
    }
}