package Gerard_Fernandez_fe_gc_c4_ta24_M3;

import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M3_1_F1 {

	public static void main(String[] args) {
		//Entrada de datos por consola
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los nombres de las ciudades
        System.out.print("Introduce el nombre de la primera ciudad: ");
        String city1 = scanner.nextLine();
        
        System.out.print("Introduce el nombre de la segunda ciudad: ");
        String city2 = scanner.nextLine();

        System.out.print("Introduce el nombre de la tercera ciudad: ");
        String city3 = scanner.nextLine();

        System.out.print("Introduce el nombre de la cuarta ciudad: ");
        String city4 = scanner.nextLine();

        System.out.print("Introduce el nombre de la quinta ciudad: ");
        String city5 = scanner.nextLine();

        System.out.print("Introduce el nombre de la sexta ciudad: ");
        String city6 = scanner.nextLine();

        //Se cierra el scanner despues de utilizarlo
        scanner.close();

        // Mostrar los nombres de las ciudades
        System.out.println("\nNombres de las ciudades:");
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);
        System.out.println(city4);
        System.out.println(city5);
        System.out.println(city6);

	}

}
