import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class fileAdmin {
	private HashMap<String, String> ham=new HashMap<>();

	public fileAdmin(String nomFichero) throws IOException {
		// TODO Auto-generated constructor stub
		
		leerfichero(nomFichero);
	}
	
	
	public void leerLinea(int linea){
		
	}
	
	public void leerfichero(String fichero)throws IOException{
		

		FileReader fr = new FileReader(fichero);
		BufferedReader bf = new BufferedReader(fr);
		String lineaLeida = bf.readLine();
		while (lineaLeida != null) {
			String sar[] = lineaLeida.split("=");
			ham.put(sar[0], sar[1]);
			lineaLeida = bf.readLine();
		}
		bf.close();
		fr.close();
		
		
		
	}
	
	public String CantidadBebidas(String producto){
		return ham.get(producto);
		
		
	}
	
	
}
