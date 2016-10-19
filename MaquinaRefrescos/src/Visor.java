
public class Visor {
	private int saldo;
	
	
	public Visor(){
		saldo=0;
	}
	
	
	public void mostarBienvenida(){
	    System.out.println("Bienvenido a tu máquina favorita");
	}
	
	public void mostrarSaldo(int saldo){
		System.out.println("El saldo disponible es : "+saldo);
	}
	
	public void mostrarPrecio(){
		
	}
	
	public void mostrarError(){
		System.out.println("Error en el sistema");
	}
	
	

}
