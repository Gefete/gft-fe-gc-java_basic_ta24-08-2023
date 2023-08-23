package Gerard_Fernandez_fe_gc_c4_ta24_M3;

import java.util.Arrays;
import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M3_1_F2 {

	public static void main(String[] args) {
		//Entrada de datos por consola
		Scanner scanner = new Scanner(System.in);

        // Se crea el array para los nombres de las ciudades
        String[] arrayCities = new String[6];

        // En este for se repite por tantos huecos haya en el array
        for (int i = 0; i < arrayCities.length; i++) {
        	//Registra mediante scanner le valor pasado por el usuario
            System.out.print("Introduce el nombre de la ciudad " + (i+1) + ": ");
            arrayCities[i] = scanner.nextLine();
        }
        //Se cierra el scanner despues de utilizarlo
        scanner.close();

        // Ordenar el array de ciudades alfabéticamente
        Arrays.sort(arrayCities);

        // Mostrar los nombres de las ciudades ordenadas
        System.out.println("Nombres de las ciudades ordenados:");
        for (String ciudad : arrayCities) {
            System.out.println(ciudad);
        }

	}

}
