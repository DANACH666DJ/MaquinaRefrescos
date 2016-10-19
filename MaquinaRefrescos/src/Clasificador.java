import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Clasificador {
	private int saldo;
	private Visor visor;
	private Seleccion selec;
	private HashMap<Integer,Deposito> depos;
	private HashMap<String, Dispensador> dispen;
	
	
	public Clasificador(){
		saldo=0;
		visor=new Visor();
		selec=new Seleccion();
		depos = new HashMap<Integer,Deposito>();
		dispen = new HashMap<String,Dispensador>();
	}
	
	public void insertarMonedas(int moneda){
		
		depos.get(moneda).añadir();
		saldo += moneda;
		visor.mostrarSaldo(saldo);
		
	}
	
	public int retornarMoneda(){
		
		return saldo;
	}
	
	public void SeleccionarProducto(){
		
		
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Visor getVisor() {
		return visor;
	}

	public void setVisor(Visor visor) {
		this.visor = visor;
	}


	public Seleccion getSelec() {
		return selec;
	}

	public void setSelec(Seleccion selec) {
		this.selec = selec;
	}

	public void setDepos(HashMap<Integer, Deposito> depos) {
		// TODO Auto-generated method stub
		this.depos = depos;		
	}

	public void setDispensadores(HashMap<String, Dispensador> dispen) {
		
		// TODO Auto-generated method stub
		this.dispen=dispen;
		
	}

	


}
