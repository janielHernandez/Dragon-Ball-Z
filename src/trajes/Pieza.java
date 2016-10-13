package trajes;

public class Pieza
{
    private float resistencia;
    private int desgaste;
	public  Pieza(float resistencia, int desgaste)
	{
	  this.setDesgaste(desgaste);
	  this.setResistencia(resistencia);
	}
	public boolean estaGastada(){
		return this.desgaste>=20;
	}
	public int getDesgaste()
	{
		return desgaste;
	}
	public void setDesgaste(int desgaste)
	{
		this.desgaste = desgaste;
	}
	public float getResistencia()
	{
		return resistencia;
	}
	public void setResistencia(float resistencia)
	{
		this.resistencia = resistencia;
	}
	

}
