package Prueba2;

public class MainPrueba {
	 
	    public static void main(String[] args) {
	   
	    	//Electrodomestico electrodomestico=new Electrodomestico ();
	    	
	    	
	    	// Metodos de Electrodomestico con Validaciones
	    	
	    	//electrodomestico.colorDisponible();
	    	//electrodomestico.pesoElectro();
	    	//electrodomestico.precioFinal();
	    	
	    	
	      Electrodomestico dataElectroDomesticos[]=new Electrodomestico[10];
	   
	        System.out.println("Ingresar Datos de Electrodomestico 0");
	        dataElectroDomesticos[0]=new Electrodomestico();
	        System.out.println("****************************");
	       
	        System.out.println("Ingresar Datos de Lavadora 1");
	        dataElectroDomesticos[1]=new Lavadora();
	        System.out.println("****************************");
	       
	        
	        System.out.println("Ingresar Datos de Television 2");
	        dataElectroDomesticos[2]=new Television();
	        System.out.println("****************************");
	        
	        
	        System.out.println("Ingresar Datos de Lavadora 3");
	        dataElectroDomesticos[3]=new Lavadora();
	        System.out.println("****************************");
	        
	        System.out.println("Ingresar Datos de Electrodomestico 4");
	        dataElectroDomesticos[4]=new Electrodomestico();
	        System.out.println("****************************");
	        
	        
	        System.out.println("Ingresar Datos de Lavadora 5");
	        dataElectroDomesticos[5]=new Lavadora();
	        System.out.println("****************************");
	        
	        System.out.println("Ingresar Datos de Television 6");
	        dataElectroDomesticos[6]=new Television();
	        System.out.println("****************************");
	        
	        System.out.println("Ingresar Datos de Lavadora 7");
	        dataElectroDomesticos[7]=new Lavadora();
	        System.out.println("****************************");
	       
	        
	        System.out.println("Ingresar Datos de Television 8");
	        dataElectroDomesticos[8]=new Television();
	        System.out.println("****************************");
	       
	        
	        System.out.println("Ingresar Datos de Electrodomestico 9");
	        dataElectroDomesticos[9]=new Electrodomestico();
	   
	       
	        double addElectro=0;
	        double addTV=0;
	        double addLav=0;
	   
	        
	        for(int i=0;i<dataElectroDomesticos.length;i++){
	           
	        	  System.out.println("Resumen de Electrodomestico N°"+i);
		          System.out.println(" ");
	   
	            if(dataElectroDomesticos[i] instanceof Electrodomestico){
	                addElectro=addElectro+dataElectroDomesticos[i].precioFinal();
	            }
	            if(dataElectroDomesticos[i] instanceof Lavadora){
	                addLav=addLav+dataElectroDomesticos[i].precioFinal();
	            }
	            if(dataElectroDomesticos[i] instanceof Television){
	                addTV=addTV+dataElectroDomesticos[i].precioFinal();
	            }
	        
	          
	        }
	   
	       
	        System.out.println("La suma del precio de los electrodomesticos es de "+addElectro);
	        System.out.println("La suma del precio de las lavadoras es de "+addLav);
	        System.out.println("La suma del precio de las televisiones es de "+addTV);
	        System.out.println("*******************");
	   
	    }
	   
	}

