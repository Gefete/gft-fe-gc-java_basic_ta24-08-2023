package Gerard_Fernandez_fe_gc_c4_ta24_M2;

import java.util.ArrayList;
import java.util.List;

public class Gerard_Fernandez_fe_gc_c4_ta24_M2_1_F4 {

	public static void main(String[] args) {
        // Crea las listas con el nombre y 1r apellido
        List<Character> name = new ArrayList<>();
        List<Character> surname = new ArrayList<>();

        //Añade la lista de caracteres del nombre
		name.add('G');
		name.add('e');
		name.add('r');
		name.add('a');
		name.add('r');
		name.add('d');

		//Añade la lista de caracteres del apellido
		surname.add('F');
		surname.add('e');
		surname.add('r');
		surname.add('n');
		surname.add('a');
		surname.add('n');
		surname.add('d');
		surname.add('e');
		surname.add('z');
        
        // Se Crea una lista para el nombre completo
        List<Character> nameComplete = new ArrayList<>();
        nameComplete.addAll(name);
        // Se añade la separación entre nombre y apellido
        nameComplete.add(' '); 
        nameComplete.addAll(surname);

        // Imprime el nombre y el apellido en una sola list completo
        for (char letter : nameComplete) {
            System.out.print(letter);
        }
    }


}
