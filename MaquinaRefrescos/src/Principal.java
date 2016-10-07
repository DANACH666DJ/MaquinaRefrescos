import java.util.Scanner;

public class Principal {
        private Scanner teclado;
        
		public Principal(){
			teclado = new Scanner(System.in); // Para leer las opciones de teclado
			
		}
		
		public void ejecucion(){
			int op = 0; // Opcion
			boolean salir = false;
			
			while (!salir) { // Estructura que repite el algoritmo del menu principal hasta que se la condicion sea falsa
				// Se muestra el menu principal
				System.out.println(".......................... \n" 
								+  ".  \n"
								+  ".  \n" 
								+  ".  \n" 
								+  ".  \n" 
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
							
							break;
						case 3:
							
							break;
						case 7:// Salir
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
		

	}


