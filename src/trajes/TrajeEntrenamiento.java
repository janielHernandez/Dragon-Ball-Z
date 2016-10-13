package trajes;

public class TrajeEntrenamiento extends Traje
{
  private int porcentaje=2;      
      public int getPorcentaje()
      {
	   return porcentaje;
      }
      public void setPorcentaje(int porcentaje){
    	  this.porcentaje = porcentaje;
       }
      public boolean esEntrenamiento(){
    	  return true;
      }

      public String getTipo(){
      	return "entrenamiento";
      }

}
