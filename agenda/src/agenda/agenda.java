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
			
			System.out.println("Dime la edad");
			matriz[hueco][1] = leer.nextLine();
			
		}

		
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		String mAgenda[][] = new String[20][2];
		
		do {
			
		
		switch (opc = opciones()) {
		case 1:
			
			break;
		case 2:
			guardarContacto(mAgenda);
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
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
