
public class Deposito {
	private int valor;
	private int cantidad;
	
	
	public Deposito(){
		valor=0;
		cantidad=0;
	}
	
	public void añadir(){
		cantidad++;
	}
	
	public void restar(){
		cantidad--;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
