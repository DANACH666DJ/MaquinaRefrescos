import java.util.HashMap;
import java.util.Scanner;

public class Principal {
        private Scanner teclado;
        private Seleccion selec;
        private Visor visor;
        private Clasificador clas;
       
        

        private fileAdmin fich1;
        private fileAdmin fich2;
        private fileAdmin fich3;
        private String producto;
        private int cant;
        
        
       
        /**
         * Constructor sin parametros
         */
        public Principal (){
        	

			HashMap<Integer,Deposito> depos;
			HashMap<String,Dispensador> dispen;
        	
			teclado = new Scanner(System.in); // Para leer las opciones de teclado
			selec=new Seleccion();
			visor=new Visor();
			clas=new Clasificador();
			
			depos = crearDepositosAMano();
			clas.setDepos(depos);
			
			dispen=crearDispensadoresAMano();
			clas.setDispensadores(dispen);
			
        }
        
        
        /**
         * 
         * @param fich1
         * @param fich2
         * @param fich3
         */
		public Principal(fileAdmin fich1,fileAdmin fich2,fileAdmin fich3){
			
			HashMap<Integer,Deposito> depos;
			HashMap<String,Dispensador> dispen;
			
			teclado = new Scanner(System.in); // Para leer las opciones de teclado
			selec=new Seleccion();
			visor=new Visor();
			clas=new Clasificador();
			
			
		
			this.fich1=fich1;
			this.fich2=fich2;
			this.fich3=fich3;
			depos = crearDepositosAMano();
			clas.setDepos(depos);
			
			dispen=crearDispensadoresAMano();
			clas.setDispensadores(dispen);
			
			
		}
		
		public HashMap<Integer,Deposito> crearDepositosAMano(){
	        HashMap<Integer,Deposito> auxDepos;
	        Deposito depost5;
	        Deposito depost10;
	        Deposito depost20;
	        Deposito depost50;
	        Deposito depost1;
	        Deposito depost2;
			
	        
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
		
		
		public HashMap<String,Dispensador> crearDispensadoresAMano(){
	        HashMap<String,Dispensador> auxDispens;
	        Dispensador dispenCoca;
	        Dispensador dispenFantNaranj;
	        Dispensador dispenFantLimon;
	        Dispensador dispenNestea;
	        Dispensador dispenRedbull;
	        Dispensador dispenMountView;
			
	        
	    	auxDispens=new HashMap<String,Dispensador>();
	        
			dispenCoca=new Dispensador("cocacola",10, 100);
			auxDispens.put("cocacola",dispenCoca);
			dispenFantNaranj=new Dispensador("fantaNaranja",15, 100);
			auxDispens.put("fantaNaranja", dispenFantNaranj);
			dispenFantLimon=new Dispensador("fantanLimon",25, 100);
			auxDispens.put("fantaLimon", dispenFantLimon);
			dispenNestea=new Dispensador("nestea",5, 100);
			auxDispens.put("nestea", dispenNestea);
			dispenRedbull=new Dispensador("redbull",8, 200);
			auxDispens.put("redbull",dispenRedbull );
			dispenMountView=new Dispensador("mountaiView",7, 200);	
			auxDispens.put("mountaiView",dispenMountView );
			
			
			
			return auxDispens;
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
							
							break;
						case 2:// 
							System.out.println("Introduce moneda:5,10,20,50,100,200");
							op1=teclado.nextInt();
							InsertarMoneda(op1);
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
		
		public void InsertarMoneda(int moneda){
			clas.insertarMonedas(moneda);
		}
		
		
		
		
	

	}


