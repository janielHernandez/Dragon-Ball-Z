package paqueteGuerro;

import trajes.Traje;

public class Saiyan extends Guerrero
{
	private float nivelExperienciaOriginal;
	private float potencialOriginal;
	private float nivelBajoDeEnegia;
	public Saiyan(float potencial, float nivelExperiencia,float nivelEnergia, Traje traje)
	{
	  super(potencial,nivelExperiencia,nivelEnergia, traje);
	  this.potencialOriginal=potencial;
	  this.nivelExperienciaOriginal=nivelExperiencia;
	}
	public void aumentarResistencia(int nivel){
		switch(nivel){
			case 1: this.nivelEnergia+= this.nivelEnergia*0.05;
			break;
			case 2: this.nivelEnergia+= this.nivelEnergia*0.07;
			break;
			case 3: this.nivelEnergia+= this.nivelEnergia*0.15;
			break;
			
		}
	}
	public void volverEstadoOriginal(){
		this.potencial=potencialOriginal;
		this.nivelEnergia=nivelDeEnergiaOriginal;
		this.nivelExperiencia=nivelExperienciaOriginal;
	}
	public void siNivelDeEnergiaEsBajo(){
		if (nivelDeEnergiaOriginal/nivelEnergia<nivelBajoDeEnegia){
		   this.volverEstadoOriginal();
		}
	}
	public void convertirSuperSaiyan(int nivel){
		this.potencial+=this.potencial*1.5;
		this.aumentarResistencia(nivel);
	}
	@Override
	public void comerSemilla(){
		nivelEnergia+=nivelDeEnergiaOriginal*0.05;		
	}
	

}
