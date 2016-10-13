package paqueteGuerro;
import java.util.ArrayList;

import trajes.Pieza;
import trajes.Traje;
import trajes.TrajeComun;
import trajes.TrajeModularizado;

public class pruebas
{

	public static void main(String[] args)
	{	   
	   
	   ArrayList <Pieza> piezas=new ArrayList<Pieza>();
	   Pieza pieza1=new Pieza((float)0.14, 13);
	   Pieza pieza2=new Pieza((float)0.1, 5);
	   Pieza pieza3=new Pieza((float)0.56, 3);
	   piezas.add(pieza1);
	   piezas.add(pieza2);
	   piezas.add(pieza3);
	   Traje tm=new TrajeModularizado (piezas);	   
	   Traje te= new TrajeComun(1);
	   Guerrero goku =new Guerrero(100,13, 700, te);  
	   Guerrero vegueta =new Guerrero(90,7, 500, tm);	   
	   System.out.println(goku.toString());
       vegueta.recibirAtaque(goku);
       System.out.print(vegueta.toString());
	}

}
