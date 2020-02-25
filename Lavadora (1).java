package Prueba2;


 
public class Lavadora extends Electrodomestico{
  
   
    private final static int iCargaDefecto=5;
  
   
    private int iCarga;
  
   
    public int getCarga() {
        return iCarga;
    }
  
  
    public double precioFinal(){
        
        double plus=super.precioFinal();
  
       
        if (iCarga>30){
            plus+=50;
        }
  
        return plus;
    }
  
  
    public Lavadora(){
        this(iPrecioBaseDefecto, iPesoDefecto, sConsumoEnergeticoDefecto, sColorDefecto, iCargaDefecto);
    }
  
     
    public Lavadora(Integer iPrecioBase, int iPeso){
        this(iPrecioBase, iPeso, sConsumoEnergeticoDefecto, sColorDefecto, iCargaDefecto);
    }
  
   
    
    public Lavadora(Integer iPrecioBase, int iPeso, String sConsumoEnergetico, String sColor, int iCarga){
        super(iPrecioBase,iPeso, sConsumoEnergetico,sColor);
        this.iCarga=iCarga;
    }
}