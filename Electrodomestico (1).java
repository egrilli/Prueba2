package Prueba2;
import java.util.Scanner;
public class Electrodomestico {
	
	Scanner scan=new Scanner(System.in);
	
	   
	  protected Integer iPrecioBase;
	  protected String sColor;
	  protected String sConsumoEnergetico;
	  protected int  iPeso;
	
	  protected final static Integer iPrecioBaseDefecto=100;
      protected final static String sColorDefecto="blanco";
      protected final static String sConsumoEnergeticoDefecto="F";
	  protected final static int iPesoDefecto=5;
	   
	
	  
	   
	    public void colorDisponible(){
	    	
	    	// Aca estamos Ingresando  y validando los colores que podemos ingresar.
			System.out.println("Que color de Electrodomestico desea Ingresar");
			System.out.println("Blanco, negro,rojo,azul,gris");
			String sColor=scan.next();
			System.out.println("****");
			
			String colores[]= {"blanco","negro","rojo","azul","gris"};
			boolean encontrado=false;
			
			
		     for(int i=0;i<colores.length && !encontrado;i++){
	             
		            if(colores[i].equalsIgnoreCase(sColor)){
		                encontrado=true;
		                
		               System.out.println("El color Ingresado es "  +sColor+  " y si Corresponde a las opciones disponibles");
		               System.out.println("****");
		               break;
		            }
		              
		        }
		          
		        if(encontrado){
		            this.sColor=sColor;
		        }else{
		            this.sColor=sColorDefecto;
		            System.out.println("El color ingresado no corresponde, por lo tanto su color por defecto es "+sColorDefecto);
		            System.out.println("****");
		        }
		           
		
		}
	       
	          
		public String   getsConsumoEnergetico() {
			return sConsumoEnergetico;
		}
		
		
		public void setcConsumoEnergetico(String sConsumoEnergetico) {
			this.sConsumoEnergetico = sConsumoEnergetico;       
		}
	      
	 
	    public void  comprobarConsumoEnergetico( ){
	          
	    	System.out.println("Que consumo energetico tiene el producto: ");
			System.out.println("Las opciones son:");
			System.out.println("A,B,C,D,E,F");
			String  sConsumoEnergeticoScan=scan.next();
			System.out.println("****");
			
			setcConsumoEnergetico(sConsumoEnergeticoScan);
			String consumoener[]= {"a","b","c","d","e","f"};
			boolean encontradoconsumo=false;
			
			
		     for(int i=0;i<consumoener.length && !encontradoconsumo;i++){
	             
		            if(consumoener[i].equalsIgnoreCase(sConsumoEnergeticoScan)){
		            	encontradoconsumo=true;
		                System.out.println("Su consumo Energetico es: "+sConsumoEnergeticoScan );
		                System.out.println("****");
		            }
		              
		        }
		          
		        if(encontradoconsumo){
		            this.sConsumoEnergetico=sConsumoEnergeticoScan;
		        }else{
		            this.sConsumoEnergetico=sConsumoEnergeticoDefecto;
		            System.out.println("El consumo energetico por defecto es: "+sConsumoEnergeticoDefecto);
		            System.out.println("****");
		        }   	
		     
		        }
	   
	 
	    public double getiPrecioBase() {
	        return iPrecioBase;
	    }
	 
	    public String getColor() {
	        return sColor;
	    }
	   
	   
	   
		public int getiPeso() {
			return iPeso;
		}
		public void setiPeso(int iPeso) {
			this.iPeso = iPeso;
		}
	  
	    public  Integer pesoElectro() {
	    	
			
	    	
			 do {
				 
				while(true) {
				try {
					 System.out.println("Cual es el Peso del Electrodomestico");
						System.out.println("El peso tiene que ser mayor a 0");
						 iPeso=scan.nextInt();
						 System.out.println("****");
						 break;
				} catch (Exception e) {
					System.err.println("Valor no admitido");
					scan.next();
				     System.out.println("****");
					continue;
					
				}
				}
		
			 if(iPeso>=1) {
				 setiPeso(iPeso);
				 System.out.println("El peso SI corresponde a los valores Pedidos");
				 System.out.println();
				
				 break;
			 }else {
				 System.out.println("El peso No corresponde a los valores Pedidos");
				 break;
			 } 
				 
			}while(iPeso>=0);
			
			return iPeso;
	    
	    }
			
			 public double precioFinal(){
	    	Integer suma=0;
			Integer suma1=0;
			
			String Rswitch=getsConsumoEnergetico().toUpperCase();
	        switch(Rswitch){
	            case "A":
	            	suma=suma+100;
	                break;
	            case "B":
	            	suma=suma+80;
	                break;
	            case "C":
	            	suma=suma+60;
	                break;
	            case "D":
	            	suma=suma+50;
	                break;
	            case "E":
	            	suma=suma+30;
	                break;
	            case "F":
	            	suma=suma+10;
	                break;
	        }
	   
	        if(getiPeso()>=0 && getiPeso()<19){
	        	suma1=suma1+10;
	        }else if(getiPeso()>=20 && getiPeso()<49){
	        	suma1=suma1+50;
	        }else if(getiPeso()>=50 && getiPeso()<=79){
	        	suma1=suma1+80;
	        }else if(getiPeso()>=80){
	        	suma1=suma1+100;
	        }
	        System.out.println("El precio base por defecto es de: " +iPrecioBaseDefecto);
	        System.out.println("El precio variable por Categoria es de: "+suma);
	        System.out.println("El precio variable por Peso es de: "+suma1);
	        
	        Integer precioFinalf=(iPrecioBaseDefecto+suma+suma1);
	        
	        System.out.println("El precio final es de $ " +precioFinalf);
	        System.out.println(" ");
	       
	        return precioFinalf;
	    }
	   
	
	    public Electrodomestico(){
	        this(iPrecioBaseDefecto, iPesoDefecto, sConsumoEnergeticoDefecto, sColorDefecto);
	    }
	   
	  
	    public Electrodomestico(Integer iPrecioBase, int iPeso){
	        this(iPrecioBaseDefecto, iPesoDefecto, sConsumoEnergeticoDefecto, sColorDefecto);
	    }
	   
	  
	    public Electrodomestico(Integer iPrecioBase, int iPeso, String sConsumoEnergetico, String sColor){
	        this.iPrecioBase=iPrecioBase;
	        this.iPeso=iPeso;
	        comprobarConsumoEnergetico();
	        colorDisponible();
	        pesoElectro();
	    }
	   
	}

