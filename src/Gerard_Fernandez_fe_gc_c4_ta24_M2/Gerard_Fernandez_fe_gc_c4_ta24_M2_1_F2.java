package Gerard_Fernandez_fe_gc_c4_ta24_M2;

import java.util.ArrayList;
import java.util.List;

public class Gerard_Fernandez_fe_gc_c4_ta24_M2_1_F2 {

	public static void main(String[] args) {
		// Crear una lista con el nombre y apellidos
		List<Character> nameComplete = new ArrayList<>();
		nameComplete.add('G');
		nameComplete.add('e');
		nameComplete.add('r');
		nameComplete.add('a');
		nameComplete.add('r');
		nameComplete.add('d');

        // Recorre la lista e imprime VOCAL, CONSONANTE o mensaje de número
        for (char letter : nameComplete) {
            if (Character.isLetter(letter)) {
                if (esVocal(letter)) {
                    System.out.println(letter+" VOCAL");
                } else {
                    System.out.println(letter+" CONSONANTE");
                }
            } else if (Character.isDigit(letter)) {
                System.out.println(letter+" Els noms de persones no contenen números!");
            }
        }
    }

	//Metodo para comprobar si es una vocal
    public static boolean esVocal(char letter) {
        char vocal = Character.toLowerCase(letter);
        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';

	}

}
