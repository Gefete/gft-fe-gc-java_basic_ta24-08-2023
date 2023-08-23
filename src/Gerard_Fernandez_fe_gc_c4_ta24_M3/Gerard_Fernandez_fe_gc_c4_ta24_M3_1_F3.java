package Gerard_Fernandez_fe_gc_c4_ta24_M3;

import java.util.Arrays;
import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M3_1_F3 {

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

        // Crear un nuevo array para las ciudades modificadas
        String[] arraycitiesModified = new String[arrayCities.length];

        // Modificar las vocales "a" por el número 4 y guardar en el nuevo array
        for (int i = 0; i < arrayCities.length; i++) {
        	arraycitiesModified[i] = arrayCities[i].replace('a', '4');
        }

        // Ordenar el nuevo array de ciudades modificadas alfabéticamente
        Arrays.sort(arraycitiesModified);

        scanner.close();

        // Mostrar los nombres de las ciudades modificadas y ordenadas
        System.out.println("Nombres de las ciudades modificadas y ordenadas:");
        for (String cityModify : arraycitiesModified) {
            System.out.println(cityModify);
        }

	}

}
