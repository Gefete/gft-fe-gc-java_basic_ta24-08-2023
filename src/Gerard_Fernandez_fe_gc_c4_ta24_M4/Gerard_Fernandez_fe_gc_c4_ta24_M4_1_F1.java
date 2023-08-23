package Gerard_Fernandez_fe_gc_c4_ta24_M4;

import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M4_1_F1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Variables para los billetes
	        int cashBillet5 = 5;
	        int cashBillet10 = 10;
	        int cashBillet20 = 20;
	        int cashBillet50 = 50;
	        int cashBillet100 = 100;
	        int cashBillet200 = 200;
	        int cashBillet500 = 500;

	        //Variable donde se guardara el total del precio
	        int totalPrice = 0;

	        // Array que guardara los platos
	        String[] menu = {"Solomillo al punto", "Salmon al horno", "Ternera al dente", "Ensalada Caribenya", "Entrecot a la salsa"};
	        // Array que guardara el precio de los platos
	        int[] prices = {10, 15, 20, 25, 30};

	        // menú de platos con su precio
	        System.out.println("Menu del restaurante:");
	        for (int i = 0; i < menu.length; i++) {
	            System.out.println((i+1) + " // " + menu[i] + " - " + prices[i] + "euros");
	        }

	        // En esta variable se guardara la eleccion de plato del usuario
	        System.out.print("Escoge un plato del 1 al " + menu.length + ": ");
	        int option = scanner.nextInt();

	        // Calcular el precio total
	        if (option >= 1 && option <= menu.length) {
	        	//Se resta uno a la eleccion por la logica del array que cuenta el '0'
	        	totalPrice = prices[option - 1];
	            System.out.println("Has escogido el plato: " + menu[option - 1]);
	            System.out.println("El total de su eleccion es: " + totalPrice + " euros");
	        } else {
	            System.out.println("valor incorrecto o fuera de rango");
	        }

	        scanner.close();
	    }
}