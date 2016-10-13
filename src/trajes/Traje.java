package trajes;

public class Traje
{
	protected int nivelDesgaste=0;    
	public int getNivelDesgaste(){
		return nivelDesgaste;
	}
	public void aumentarNivelDesgaste(int aumentoDesgaste){
		this.nivelDesgaste+=aumentoDesgaste;
	}
	public boolean estaDesgastado(){
      return this.nivelDesgaste>10;
	}
    public int cantPiezas(){
    	return 1;
    }
    public String getTipo(){
    	return null;
    }
}
