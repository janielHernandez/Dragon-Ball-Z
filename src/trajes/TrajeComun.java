package trajes;

public class TrajeComun extends Traje
{
    private int porcentaje;
	public TrajeComun(int porcentaje)
	{
	  this.setPorcentaje(porcentaje);
	}
	public boolean esComun(){
		return true;
	}
    public int getPorcentaje()
	{
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje){
		this.porcentaje = porcentaje;
	} 
	
	public String getTipo(){
    	return "comun";
    }
	



}
