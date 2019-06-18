package src1.tareas;

import libs.Input;

public class MarioDificil {

	public static void main(String[] args) {
		// imprima una media piramide de una altura especificada por el usuario
		int lineaGatitos = 1, gatitos, espacios, altura,alturaCopy,abismo,gatitosT2;
		
		System.out.print("Ingrese la altura deseada de la piramide: ");
		altura=Input.get_int();
		alturaCopy = altura;
		
		while(lineaGatitos <= altura) {
			System.out.println();
			espacios = alturaCopy-1;
			while (espacios > 0) {
				System.out.print(" ");
				espacios--;
			}	
			gatitos = 0;
			while (gatitos < lineaGatitos) {
				System.out.print("#");
				gatitos++;
			}
			abismo = 0;
			while (abismo < 2) {
				System.out.print(" ");
				abismo++;
			}	
			gatitosT2 = 0;
			while (gatitosT2 < lineaGatitos) {
				System.out.print("#");
				gatitosT2++;
			}
			
		lineaGatitos++;
		alturaCopy--;
		}

	}

}
