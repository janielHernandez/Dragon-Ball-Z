package torneos;
import java.util.LinkedList;
import paqueteGuerro.Guerrero;

public class Funny extends Torneo
{

	 public Funny(LinkedList <Guerrero> participantes){
		   super(participantes);
	   }
	 @Override
	 public void ordenar(){
	   	for(Guerrero p1:participantes){
	   	for(Guerrero p2:participantes){
		  if(p1.geTraje().cantPiezas()<=p2.geTraje().cantPiezas()){
		    participantes.addFirst(p2);
		  }
	   	}
	   }
	 }
	 
	 

}
