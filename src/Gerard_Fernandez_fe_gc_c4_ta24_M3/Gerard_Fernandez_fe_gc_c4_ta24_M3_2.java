package Gerard_Fernandez_fe_gc_c4_ta24_M3;

import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta24_M3_2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

        // Se crea el array bidimensional de alumnos
        double[][] notasAlumnos = new double[5][3];
        
        

        // En este for se llena el segundo array con las notas que son introducidas por el usuario
        for (int i = 0; i < notasAlumnos.length; i++) {
        	
            System.out.println("Notas para el alumno " + (i+1) + ":");
            
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                System.out.print("Introduce la nota " + (j+1) + ": ");
                notasAlumnos[i][j] = scanner.nextDouble();
            }
        }

        // Calcular y mostrar la media y si el alumno ha aprobado o suspendido
        for (int i = 0; i < notasAlumnos.length; i++) {
            double suma = 0;
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                suma += notasAlumnos[i][j];
            }
            double media = suma / notasAlumnos[i].length;

            System.out.printf("Media del alumno %d: %.2f %n", (i + 1), media);

            if (media >= 5) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Suspendido");
            }

            System.out.println(); // Separador entre alumnos
        }

        scanner.close();
	}

}
