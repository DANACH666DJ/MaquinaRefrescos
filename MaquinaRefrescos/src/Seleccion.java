
public class Seleccion extends Tecla {
	private Clasificador clas;

	@Override
	public void pulsar() {
		// TODO Auto-generated method stub
		
	}
	
	public Seleccion(){
		clas=new Clasificador();
		
	}

	public void elegirProducto(){
		clas.SeleccionarProducto();
	}
	
	
}
