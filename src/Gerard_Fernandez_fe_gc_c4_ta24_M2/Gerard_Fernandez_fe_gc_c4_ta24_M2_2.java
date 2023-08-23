package Gerard_Fernandez_fe_gc_c4_ta24_M2;

import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M2_2 {

	public static void main(String[] args) {
		//Se define un Scanner para recibir cuanta altura se quiere en las 2 opciones
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese la altura para los 2 resultados: ");
		
		// Altura de la escala
		int heigth = scanner.nextInt();
		scanner.close();
        
		//Este realiza la escala ascendente de numeros
		for (int i = 1; i <= heigth; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            // Salto de línea al final de cada fila
            System.out.println(); 
        }
        
        
        System.out.println();
        
        //Este realiza una piramide de asteriscos
        for (int i = heigth; i >= 1; i--) {
        	//Este for pondra los espacios
            for (int j = 1; j <= heigth-i; j++) {
                System.out.print(" ");
            }
            //Este pintara los asteriscos (multiplica 2 
            //para crear un efecto espejo y asi realizar una piramide)
            for (int k = 2; k <= 2*i; k++) {
                System.out.print("*");
            }
            // Salto de línea al final de cada fila
            System.out.println(); 
        }

	}

}
