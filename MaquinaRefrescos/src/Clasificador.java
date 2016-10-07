import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Clasificador {
	private int saldo;
	private Visor visor;
	private Dispensador disp;
	private Seleccion selec;
	private HashMap<Deposito,Integer> depos;
	
	
	public Clasificador(){
		saldo=0;
		visor=new Visor();
		disp=new Dispensador();
		selec=new Seleccion();
		depos = new HashMap<Deposito, Integer>();
	}
	
	public void insertarMonedas(){
		
	}
	
	public int retornarMoneda(){
		
		return saldo;
	}
	
	public void SeleccionarProducto(){
		
		
	}

	
	
	

}
