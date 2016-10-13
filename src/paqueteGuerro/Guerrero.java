package paqueteGuerro;
import trajes.Traje;
import trajes.TrajeComun;
import trajes.TrajeModularizado;


public class Guerrero 
{
    protected float potencial;
    protected float nivelExperiencia;
    protected float nivelEnergia;
    protected float nivelDeEnergiaOriginal;
    protected Traje traje;
    protected int desgastePorAtaque=5;
    protected float porcentajeDisminucion=(float)0.1;
	
	public Guerrero(float potencial,float nivelExperiencia,float nivelEnergia, Traje traje)
	{
	  this.potencial=potencial;
	  this.nivelExperiencia=nivelExperiencia;
	  this.nivelEnergia=nivelEnergia;
	  this.traje=traje;
	  this.nivelDeEnergiaOriginal=nivelEnergia;
	}
	public float getPotencial(){
		return potencial;
	}
	public Traje geTraje(){
		return traje;
	}
	public float getNivelExperiencia(){
		return nivelExperiencia;
	}
	public float getNivelEnergia(){
		return nivelEnergia;
	}
	public void morir(){
		nivelEnergia=0;
	}
	public boolean estaMuerto(){
		if(this.nivelEnergia==0){
			return true;
		}
		return false;
	}
	public void aumentarExperienciaYAplicarAtaque(Guerrero atacante){
		this.nivelExperiencia++;
		this.nivelEnergia-= atacante.getPotencial()*porcentajeDisminucion;		
	}
	public void accionesTrajeComunCasoDeAtaque(Guerrero atacante){
		if (traje.estaDesgastado()){
		  this.aumentarExperienciaYAplicarAtaque(atacante);
		    }else {
		  this.aumentarExperienciaYAplicarAtaque(atacante);
		  this.nivelEnergia+=((TrajeComun)traje).getPorcentaje();
		}
	}
	public void accionesTrajeEntrenamientoCasoDeAtaque(Guerrero atacante){
		if (traje.estaDesgastado()){
			this.aumentarExperienciaYAplicarAtaque(atacante);
		} else {
			this.nivelEnergia-= atacante.getNivelExperiencia()*porcentajeDisminucion;
			this.nivelExperiencia+=2;
		}
	}
	public void accionesTrajeModuladoCasoDeAtaque(Guerrero atacante){
		if(((TrajeModularizado)traje).estaDesgastado()){
			  this.aumentarExperienciaYAplicarAtaque(atacante);
			    }else {
			  this.nivelEnergia-= atacante.getNivelExperiencia()*porcentajeDisminucion;
			  this.nivelEnergia+= ((TrajeModularizado)traje).sumatoriaResistencia();
			  this.nivelExperiencia+=((TrajeModularizado)traje).porcentajePiezaNoGastada();
			    }
	
	}
	public void recibirAtaque(Guerrero atacante){
		traje.aumentarNivelDesgaste(desgastePorAtaque);
		this.realizarAcciones(atacante);
	  }
	public void comerSemilla(){
		nivelEnergia=nivelDeEnergiaOriginal;		
	}
	public void setDesgastePorAtaque(int desgastePorAtaque){
		this.desgastePorAtaque=desgastePorAtaque;
	}
	public void realizarAcciones(Guerrero atacante){
		switch(traje.getTipo()){
			case "comun": this.accionesTrajeComunCasoDeAtaque(atacante);
			break;
			case "entrenamiento": this.accionesTrajeEntrenamientoCasoDeAtaque(atacante); 
			break;
			case "modularizado": this.accionesTrajeModuladoCasoDeAtaque(atacante);
			break;
		}
		
		/*if (((TrajeEntrenamiento)traje).esEntrenamiento())
			this.accionesTrajeEntrenamientoCasoDeAtaque(atacante); 
		else 
		if(((TrajeComun)traje).esComun())
			this.accionesTrajeComunCasoDeAtaque(atacante);
		else
		if(((TrajeModularizado)traje).esModularizado())
				this.accionesTrajeModuladoCasoDeAtaque(atacante);
		}*/
	}
	@Override
	public String toString(){
		return "Potencial defensivo: "+this.potencial +"\n"+ "Nivel enegía: "+ this.nivelEnergia+ "\n"+ "Nivel experiencia: "+ this.nivelExperiencia+ "\n";
	}
	
	
}


