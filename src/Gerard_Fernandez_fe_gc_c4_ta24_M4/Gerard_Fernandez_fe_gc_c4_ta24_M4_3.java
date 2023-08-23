package Gerard_Fernandez_fe_gc_c4_ta24_M4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

	public class Gerard_Fernandez_fe_gc_c4_ta24_M4_3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] money = {1, 2, 5, 10, 20, 50, 100, 200, 500};

	        int totalPrice = 0;

	        String[] menu = new String[5];
	        int[] prices = new int[5];

	       
	            for (int i = 0; i < menu.length; i++) {
	                System.out.print("Nombre del plato " + (i + 1) + ": ");
	                menu[i] = scanner.nextLine();
	                
	                System.out.print("Precio del plato " + (i + 1) + ": ");
	                prices[i] = scanner.nextInt();
	                scanner.nextLine();
	            }

	            System.out.println("Menu del restaurante:");
	            for (int i = 0; i < menu.length; i++) {
	                System.out.println((i + 1) + " // " + menu[i] + " - " + prices[i] + " euros");
	            }

	            List<String> selectedPlate = new ArrayList<>();
	            int continueOption = 1;

	            while (continueOption != 0) { 
	            	try {
		                System.out.print("¿Qué quieres comer? (pon el nombre exacto del plato): ");
		                String selected = scanner.nextLine();
	
		                boolean incomplete = true;
	
		                for (int i = 0; i < menu.length; i++) {
		                    if (selected.equalsIgnoreCase(menu[i])) {
		                        totalPrice += prices[i];
		                        incomplete = false;
		                        continueOption = 1;
		                    }
		                }
	
		                if (incomplete) {
		                    throw new PlateNotFoundException("El plato no existe");
		                } else {
		                    selectedPlate.add(selected);
		                }
	
		                try {
		                    System.out.print("¿Quieres seguir pidiendo comida? (1: Sí / 0: No): ");
		                    continueOption = scanner.nextInt();
		                    scanner.nextLine();
		                } catch (Exception e) {
		                    continueOption = 0;
		                }
	                } catch (PlateNotFoundException | InputMismatchException e) {
	                	System.out.println("Error: " + e.getMessage());
	                }
	            }

	            scanner.close();

	            System.out.println("Platos seleccionados:");
	            for (String plate : selectedPlate) {
	                System.out.println("- " + plate);
	            }

	            calculateCash(totalPrice, money);
	            System.out.println("Preu total: " + totalPrice + " euros");

	        
	    }

	    public static void calculateCash(int totalprice, int[] money) {
	        System.out.println("Tiene que dar billetes y monedas:");

	        for (int i = money.length - 1; i >= 0; i--) {
	            while (totalprice >= money[i]) {
	                System.out.println(money[i] + " euros");
	                totalprice -= money[i];
	            }
	        }
	    }
	}