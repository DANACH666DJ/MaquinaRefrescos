import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Clasificador {
	private int saldo;
	private Visor visor;
	private Dispensador disp;
	private Seleccion selec;
	private HashMap<Integer,Deposito> depos;
	
	
	public Clasificador(){
		saldo=0;
		visor=new Visor();
		disp=new Dispensador();
		selec=new Seleccion();
		depos = new HashMap<Integer,Deposito>();
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

	public Dispensador getDisp() {
		return disp;
	}

	public void setDisp(Dispensador disp) {
		this.disp = disp;
	}

	public Seleccion getSelec() {
		return selec;
	}

	public void setSelec(Seleccion selec) {
		this.selec = selec;
	}

	public void setDepos(HashMap<Integer, Deposito> depos2) {
		// TODO Auto-generated method stub
		
		
	}

	


}
