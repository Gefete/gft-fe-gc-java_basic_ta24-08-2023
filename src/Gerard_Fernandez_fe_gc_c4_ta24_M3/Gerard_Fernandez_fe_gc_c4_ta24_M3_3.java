package Gerard_Fernandez_fe_gc_c4_ta24_M3;

import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M3_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de numeros a mostrar: ");
        int quantity = scanner.nextInt();
        scanner.close();

        System.out.println("Secuencia de Fibonacci hasta " + quantity + ":");
        int fibonnaci1=0;
        int fibonacci2=0;
        
        //Este for hace que se forme la serie fibonacci
        for (int i = 0; i <= quantity-1; i++) {
        	 
        	if (i <= 1) {
        		System.out.print(i+ " ");
        		fibonnaci1=1;
        		fibonacci2=0;
	        } else {
	        	//Recoge el resultado de los numeros anteriores y los suma
	        	int sumFibonacci=fibonnaci1+fibonacci2;
	        	fibonacci2= fibonnaci1;
	        	fibonnaci1= sumFibonacci;
	        	System.out.print(sumFibonacci+ " ");
	             
	        }
            
        }
    }

   

}
