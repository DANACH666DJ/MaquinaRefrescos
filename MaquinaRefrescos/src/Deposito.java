
public class Deposito {
	private int valor;
	private int cantidad;
	private Clasificador clasf;
	
	
	public Deposito(int valor,int cantidad){
		valor=0;
		cantidad=0;
		
	}
	
	public void a�adir(){
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
