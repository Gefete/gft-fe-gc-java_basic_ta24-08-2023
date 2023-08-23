package Gerard_Fernandez_fe_gc_c4_ta24_M4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Variables para los billetes
		int[] money = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        
        
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
        int continueOption=1;
        
        while (continueOption != 0) {
            System.out.print("Que quieres comer? (pon el nombre exacto del plato): ");
            String selected = scanner.nextLine();
            
           
            boolean incomplete=true;
            
            //En este for se comprueba que la List y el array coincidan los platos
            
        	for (int i = 0; i < menu.length; i++) {
				if(selected.equalsIgnoreCase(menu[i])) {
					totalPrice += prices[i];
					incomplete=false;
					//El pedido sigue
					continueOption=1;
				}
			}
        	
        	if(incomplete) {
        		System.out.println("El plato no existe");
        	}else {
	            //En el arralist se añade el plato elegido para luego comprobarlo
	        	selectedPlate.add(selected); 
        	}
        	try {
	            System.out.print("Vols seguir demanant menjar? (1: Si / 0: No): ");
	            continueOption = scanner.nextInt();
	            // da error si no se pone este nextLine() sin guardar valor
	            scanner.nextLine();
            } catch (Exception e) {
            	continueOption=0;
			} 
            
        }
        
        //Condicional que no permite continuar si se encuentra incongruencia en los platos seleccionados
        
	        // cierre de scanner ya que no se utilizara mas
	        scanner.close();
	        
	        System.out.println();
	        // Mostrar els plats seleccionats i el preu total
	        System.out.println("Platos selecionados:");
	        for (String plate : selectedPlate) {
	            System.out.println("- " + plate);
	        }
	        
	        calculateCash(totalPrice, money);
	        System.out.println("Preu total: " + totalPrice + " euros");
        

	}
	
	
	//Metodo para calcular billetes
	public static void calculateCash(int totalprice, int[] money) {
		System.out.println("tiene que dar billetes monedas:");
        
		//Este bucle devolvera los billetes necesarios para llevar a cabo la transaccion
		for (int i = money.length-1; i >=0; i--) {
			while(totalprice>=money[i]) {
        		System.out.println(money[i]+ "euros");
                totalprice -= money[i];
        	}   
		}
    }

}
