package trajes;
import java.util.ArrayList;


public class TrajeModularizado extends Traje
{
     private ArrayList <Pieza> piezas=new ArrayList <Pieza>();
     public TrajeModularizado(ArrayList<Pieza> piezas){
			this.piezas=piezas;
			}
     @Override
     public int cantPiezas(){
    	 return piezas.size();
     }
	 public float sumatoriaResistencia(){
	  float sum=0;
	  for(Pieza pieza: piezas){
			if(!pieza.estaGastada())
			sum+=pieza.getResistencia();				
		}
	  return sum;
	  }
	 @Override
	 public boolean estaDesgastado(){
		 for(Pieza pieza: piezas){
			 if(!pieza.estaGastada())
				 return false;
		}
	     return true;
	 }
	 public float porcentajePiezaNoGastada(){
		int t=piezas.size();
		int piezasNOGastada=0;
		for(Pieza pieza: piezas){
		  if(!pieza.estaGastada())
		     piezasNOGastada++;
		  }
		return piezasNOGastada/t;
	 }
	 public boolean esModularizado(){
   	  return true;
     } 
	 @Override
		public String getTipo(){
	    	return "modularizado";
	    }
}
