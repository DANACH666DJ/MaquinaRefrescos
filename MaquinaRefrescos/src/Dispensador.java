import java.util.Scanner;

public class Dispensador {
	private int precio;
	private int cantidad;
	private String producto;


	
	public Dispensador(String producto,int cantidad, int precio){
		this.producto=producto;
		this.cantidad=cantidad;
		this.precio = precio;
		
	}
	
	
	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public void dispensar(){
		
		
		
	}


	
	

}
