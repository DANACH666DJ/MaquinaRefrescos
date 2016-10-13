import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
       
		fileAdmin fich1=new fileAdmin("monedas.txt");
		fileAdmin fich2=new fileAdmin("precioProducto.txt");
		fileAdmin fich3=new fileAdmin("productos.txt");
		
		 Principal princ = new Principal(fich1,fich2,fich3);
	        
		princ.ejecucion();
		
		

	}

}
