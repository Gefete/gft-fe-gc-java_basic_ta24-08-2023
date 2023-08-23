package Gerard_Fernandez_fe_gc_c4_ta24_M3;

import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M3_1_F4 {

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
        
        //Cierre del scanner, no se utilliza mas
        scanner.close();
        
        // Crear nuevos arrays bidimensionales para las ciudades invertidas
        char[][] arraysInvertCities = new char[arrayCities.length][];

        // Llenar los nuevos arrays con los nombres invertidos letra por letra
        for (int i = 0; i < arrayCities.length; i++) {
        	//Se añade el tamaño del segundo array (segun la longitud de la palabra)
        	arraysInvertCities[i] = new char[arrayCities[i].length()];
        	
            //Este for itera por cada caracter que contenga la palabra seleccionada en el array
            for (int j = 0; j < arraysInvertCities[i].length; j++) {
            	arraysInvertCities[i][j] = arrayCities[i].charAt(arrayCities[i].length()-1-j);
            }
        }

        // Mostrar los nombres de las ciudades invertidas
        System.out.println("Nombres de las ciudades invertidos:");
        for (int i = 0; i < arraysInvertCities.length; i++) {
            System.out.println(arraysInvertCities[i]);
        }

	}

}
