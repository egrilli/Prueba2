package Prueba2;



public class Television extends Electrodomestico{
  
   
    private final static int iResolucionDefecto=20;
    private int iResolucion;
    private boolean bSintonizadorTDT;
 
    
    
    public double precioFinal(){
        
        double plus=super.precioFinal();
  
 
        if (iResolucion>40){
            plus+=iPrecioBase*0.3;
        }
        if (bSintonizadorTDT){
            plus+=50;
        }
  
        return plus;
    }
  
  
    public Television(){
        this(iPrecioBaseDefecto, iPesoDefecto, sConsumoEnergeticoDefecto, sColorDefecto, iResolucionDefecto, false);
    }
  

    public Television(Integer iPrecioBase, int iPeso){
        this(iPrecioBase, iPeso, sConsumoEnergeticoDefecto, sColorDefecto, iResolucionDefecto, false);
    }
  
  
    public Television(Integer iPrecioBase, int iPeso, String sConsumoEnergetico, String sColor, int iResolucion, boolean bSintonizadorTDT){
        super(iPrecioBase, iPeso, sConsumoEnergetico, sColor);
        this.iResolucion=iResolucion;
        this.bSintonizadorTDT=bSintonizadorTDT;
    }
}