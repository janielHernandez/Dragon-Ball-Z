package torneos;
import java.util.LinkedList;
import paqueteGuerro.Guerrero;

public class PowerIsBest extends Torneo
{
   public PowerIsBest(LinkedList <Guerrero> participantes){
	   super(participantes);
   }
   @Override
   public void ordenar(){
	   for (Guerrero p1: participantes){		  
	   for(Guerrero p2: participantes){
		 if(p1.getNivelEnergia()<=p2.getNivelEnergia()){
			  participantes.addFirst(p2);
			 } 
		 }
	  }
   }   
}
