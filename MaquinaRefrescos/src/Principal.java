import java.util.Scanner;

public class Principal {
        private Scanner teclado;
        private Seleccion selec;
        private Visor visor;
        private Clasificador clas;
        private Dispensador dispen;
        private Deposito depost;
        private fileAdmin fich1;
        private fileAdmin fich2;
        private fileAdmin fich3;
        private String producto;
        private int cant;
        
        
        
        
        
		public Principal(fileAdmin fich1,fileAdmin fich2,fileAdmin fich3){
			teclado = new Scanner(System.in); // Para leer las opciones de teclado
			selec=new Seleccion();
			visor=new Visor();
			clas=new Clasificador();
			dispen=new Dispensador();
			depost=new Deposito();
			this.fich1=fich1;
			this.fich2=fich2;
			this.fich3=fich3;
			
			
		}
		
		
		
		
		public void ejecucion(){
			
			int op = 0;
			int op1=0;// Opcion
			boolean salir = false;
			
			visor.mostarBienvenida();
			
			while (!salir) { // Estructura que repite el algoritmo del menu principal hasta que se la condicion sea falsa
				// Se muestra el menu principal
				System.out.println(".......................... \n" 
								+  ".  Seleccionar Producto :1\n"
								+  ".  Insertar Moneda :2\n" 
								+  ".  Devolver Moneda :3\n" 
								+  ".  Salir :4\n" 
								+  ".  \n" 
								+  ".  \n" 
								+  ".  \n" 
								+  "..........................");
				try{
					op = teclado.nextInt(); // Se le da a la variable op el valor del teclado
					System.out.println("OPCION SELECCIONADA:" + op);
					switch (op) {
						case 1:// 
							System.out.println("Elige producto: cocacola : 1 ,FantaNaranja: 2,FantaLimon: 3,Nestea: 4");
							op1=teclado.nextInt();
							switch (op1) {
							case 1:
								
								producto="cocacola";
								cant=Integer.parseInt(fich1.CantidadBebidas(producto));
								System.out.println(cant);
								break;
                             case 2:
								
								break;
                             case 3:
 								
 								break;
                             case 4:
 								
 								break;

							default:
								break;
							}
						    
							break;
						case 2:// 
							insertarMoneda();
							break;
						case 3:
							
							break;
						case 4:// Salir
							salir = true;
							break;
						default:// No valido
							System.out.println("");
							break;
					}
				}catch (Exception e) {
					System.out.println("");
		            // flushing scanner
					//e.printStackTrace();
					teclado.next();
				}
			}
			
			//teclado.close();

		}
		
		public void insertarMoneda(){
			clas.insertarMonedas();
		}
		
		
	

	}


