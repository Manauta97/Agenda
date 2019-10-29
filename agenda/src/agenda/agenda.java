package agenda;

import java.util.Scanner;

public class agenda {
	
	public static int opciones() {
		Scanner leer = new Scanner(System.in);
		
		int opcion = 0;
		boolean bandera = true;
		
		do {
			System.out.println(" *******  AGENDA  ********");
			System.out.println("* 1 --> Ver Contactos     *");
			System.out.println("* 2 --> Guardar Contactos *");
			System.out.println("* 3 --> Borrar Contactos  *");
			System.out.println("* 4 --> Buscar Contactos  *");
			System.out.println("* 5 --> Editar Contactos  *");
			System.out.println("* 6 --> Salir             *");
			System.out.println(" *************************");
		
			System.out.println("Elige una de las 6 opciones");
			opcion = leer.nextInt();
			
			if (opcion >= 1 && opcion <= 6) {
				bandera = true;
			}
		
			if (bandera = false) {
				System.out.println("");
				System.out.println("Escribe una opción valida");
			}	
		} while (bandera);
		
		return opcion;
	
	}
	
	public static int buscarHueco(String matriz[][]) {
		int hueco = -1;
		for (int i = 0; i <= matriz.length; i++) {
			if (matriz[i][0] == null) {
				hueco = i;
				break;	
			}
		}
		return hueco;
	}
	
	public static void guardarContacto(String matriz[][]) {
		Scanner leer = new Scanner(System.in);
		
		int hueco = buscarHueco(matriz);
		if (hueco == -1) {
			System.out.println("No hay hueco disponibles");
		}else {
			System.out.println("Dime un nombre");
			matriz[hueco][0] = leer.nextLine();
			
			System.out.println("Dime el nº de teléfono");
			matriz[hueco][1] = leer.nextLine();
			
		}
	}
	
	public static void verContacto(String matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			
			if (matriz[i][0] != null) {
				System.out.println("Nombre ---> " + matriz[i][0] + " Teléfono ---> " + matriz[i][1] );
			} 	
		}
		
	}
	
	public static void borrarContacto(String matriz[][]) {
		Scanner leer = new Scanner(System.in);
		String nombre = "";
		int pos = buscarContacto(matriz);
		if (pos!=-1) {
			matriz[pos][0] = null;
			matriz[pos][1] = null;
			System.out.println("Contacto borrado");
		}else {
			System.out.println("Contacto NO borrado");
		}

	
//		System.out.println("Dime el nombre del contacto que quieres borrar");
//		nombre = leer.nextLine();
//		
//		for (int i = 0; i < matriz.length; i++) {
//		
//			if ((matriz[i][0] != null) && matriz[i][0].equalsIgnoreCase(nombre)) {
//				
//				matriz[i][0] = null;
//				matriz[i][1] = null;
//				
//				System.out.println("El contacto ha sido borrado");
//				
//			}
//		}
	}
	
	public static int buscarContacto(String matriz[][]) {
		Scanner leer = new Scanner(System.in);
		boolean encontrado = false;
		String nombre = "";
		
		System.out.println("Dime que contacto quieres buscar");
		nombre = leer.nextLine();
		
		for (int i = 0; i < matriz.length; i++) {
			
			if ((matriz[i][0] != null) && matriz[i][0].equalsIgnoreCase(nombre)) {
				System.out.println("El contacto de nombre " + matriz[i][0] + " y Telefono " + matriz[i][1] + " ha sido encontrado");
				encontrado = true;
				return i;
			}
		}
		
		if (encontrado = false) {
			System.out.println("Contacto no encontrado");
		}
		return -1;
		
	}
	
	public static void editarContacto(String matriz[][]){
		Scanner leer = new Scanner(System.in);
		String nombre = "";
		
		int pos = buscarContacto(matriz);
		
		System.out.println("Nombre editado");
		matriz[pos][0] = leer.nextLine();
		System.out.println("Numero editado");
		matriz[pos][1] = leer.nextLine();
		
		
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		String mAgenda[][] = new String[20][2];
		
		do {
		
		switch (opc = opciones()) {
		case 1:
			verContacto(mAgenda);
			break;
		case 2:
			guardarContacto(mAgenda);
			break;
		case 3:
			borrarContacto(mAgenda);
			break;
		case 4:
			buscarContacto(mAgenda);
			break;
		case 5:
			editarContacto(mAgenda);
			break;
		case 6:
			System.out.println("");
			System.out.println("¡ADIOS!");
			System.out.println("");
			break;
			
		default:
			break;
		}
			
		} while (opc != 6);
		
	}

}
