import java.util.HashMap;
import java.util.Scanner;

public class Principal {
        private Scanner teclado;
        private Seleccion selec;
        private Visor visor;
        private Clasificador clas;
        private Dispensador dispen;

        private fileAdmin fich1;
        private fileAdmin fich2;
        private fileAdmin fich3;
        private String producto;
        private int cant;

        
        
        
        
        
		public Principal(fileAdmin fich1,fileAdmin fich2,fileAdmin fich3){
			
			HashMap<Integer,Deposito> depos;
			
			teclado = new Scanner(System.in); // Para leer las opciones de teclado
			selec=new Seleccion();
			visor=new Visor();
			clas=new Clasificador();
			dispen=new Dispensador();
		
			this.fich1=fich1;
			this.fich2=fich2;
			this.fich3=fich3;
			depos = crearDepositosAMano();
			clas.setDepos(depos);
			
			
			
			
		}
		
		//metodo qye al restar actualiza el fichero
		
		//public...{
		//}
		
		//
		public HashMap<Integer,Deposito> crearDepositosAMano(){
	        HashMap<Integer,Deposito> auxDepos;
	        Deposito depost5;
	        Deposito depost10;
	        Deposito depost20;
	        Deposito depost50;
	        Deposito depost1;
	        Deposito depost2;
			
	        //int[] valorMonedas = {200, 100, 50, 20, 10, 5};
	        //lees de fichero [6, 5, 9, 10, 165, 6]
	        //arrayList.add(new Deposito(valorMoneda[i], aux[i]);
	        //OTYRO METODO A PARTE: 
	        //restas cantidad al devolver una moneda
	        //vuelves a escribir en fichero para guardar la cantidad que has restado
	        
	        //en un bucle creo un deposito con el valor y la cantidad que toque
	       // Deposito dep = new Deposito(valorMonedas[i], aux[i]);
	        
	        
	    	auxDepos=new HashMap<Integer,Deposito>();
	        
			depost5=new Deposito(5,10);
			auxDepos.put(5,depost5);
			depost10=new Deposito(10,10);
			auxDepos.put(10, depost10);
			depost20=new Deposito(20,10);
			auxDepos.put(20, depost20);
			depost50=new Deposito(50,10);
			auxDepos.put(50, depost50);
			depost1=new Deposito(1,10);
			auxDepos.put(1, depost1);
			depost2=new Deposito(2,10);	
			auxDepos.put(2, depost2);
			
			
			return auxDepos;
		}
		
//		public HashMap<Integer,Deposito> crearDepositosFichero(){
//			
//		}
		
		
		
		
		
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
								InsertarMoneda();
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
		
		public void InsertarMoneda(){
			
		}
		
		
		
		
	

	}


