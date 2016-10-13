package torneos;
import java.util.LinkedList;
import paqueteGuerro.Guerrero;

public class Torneo
{
	   protected LinkedList <Guerrero> seleccion=new LinkedList<Guerrero>();
	   protected LinkedList <Guerrero> participantes=new LinkedList<Guerrero>();
	   
	   public Torneo(LinkedList <Guerrero> participantes){
		   this.participantes=participantes;
	   }
	   public void seleccionar(){
		   this.ordenar();
		   this.filtrar();
		   
	   }
	      
	public void ordenar(){}
	public void filtrar(){
		   for (int i=0;i<=16;i++){
			  seleccion.add(participantes.get(i));
		   }
		  participantes=seleccion;
	   }
	   
}
