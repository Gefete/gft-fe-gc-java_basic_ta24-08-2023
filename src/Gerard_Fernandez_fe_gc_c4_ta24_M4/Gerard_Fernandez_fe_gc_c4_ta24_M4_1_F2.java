package Gerard_Fernandez_fe_gc_c4_ta24_M4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M4_1_F2 {

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
        String[] menu = new String[5]; 
        // Array que guardara el precio de los platos
        int[] prices = new int[5]; 

        // Bucle para rellenar platos y precios en sus respectivos arrays
        for (int i = 0; i < menu.length; i++) {
        	//Nombre plato
            System.out.print("Nombre del plato " + (i + 1) + ": ");
            menu[i] = scanner.nextLine();
            
            //Precio plato
            System.out.print("Precio del plato " + (i + 1) + ": ");
            prices[i] = scanner.nextInt();
            scanner.nextLine();
        }

        
        System.out.println();
        // menú de platos con su precio
        System.out.println("Menu del restaurante:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " // " + menu[i] + " - " + prices[i] + " euros");
        }
 
        System.out.println();
        // Lista para almacenar los platos pedidos
        List<String> selectedPlate = new ArrayList<>();

        // Bucle para pedir platos al usuario el mismo decide cuando parar
        boolean continueOrdering = true;
        while (continueOrdering) {
            System.out.print("Que quieres comer? /numero de plato/ (1 a 5): ");
            int selected = scanner.nextInt();
            // da error si no se pone este nextLine() sin guardar valor
            scanner.nextLine(); 

            if (selected >= 1 && selected <= menu.length) {
            	selectedPlate.add(menu[selected - 1]);
                totalPrice += prices[selected - 1];
            } else {
                System.out.println("Numero incorrecto no corresponde a ningun plato");
            }

            System.out.print("Vols seguir demanant menjar? (1: Si / 0: No): ");
            int continueOption = scanner.nextInt();
            // da error si no se pone este nextLine() sin guardar valor
            scanner.nextLine(); 

            if (continueOption == 0) {
                continueOrdering = false;
            }
        }
        // cierre de scanner ya que no se utilizara mas
        scanner.close();
        
        System.out.println();
        // Mostrar els plats seleccionats i el preu total
        System.out.println("Platos selecionados:");
        for (String plate : selectedPlate) {
            System.out.println("- " + plate);
        }
        System.out.println("Preu total: " + totalPrice + " euros");

        
	}

}