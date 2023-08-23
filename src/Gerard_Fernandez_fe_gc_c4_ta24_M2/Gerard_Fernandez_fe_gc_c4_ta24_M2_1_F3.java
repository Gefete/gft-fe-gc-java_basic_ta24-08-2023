package Gerard_Fernandez_fe_gc_c4_ta24_M2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gerard_Fernandez_fe_gc_c4_ta24_M2_1_F3 {

	public static void main(String[] args) {
		// Crear una lista con el nombre y apellidos
		List<Character> nameComplete = new ArrayList<>();
		nameComplete.add('G');
		nameComplete.add('e');
		nameComplete.add('r');
		nameComplete.add('a');
		nameComplete.add('r');
		nameComplete.add('d');

        // Se crea un map 
        Map<Character, Integer> frequencyLetters = new HashMap<>();

        // Calcular la frecuencia de las letras
        for (char letter : nameComplete) {
            if (Character.isLetter(letter)) {
                char letraMin = Character.toLowerCase(letter);
                frequencyLetters.put(letraMin, frequencyLetters.getOrDefault(letraMin, 0) + 1);
            }
        }

        // Imprimir las letras y su frecuencia
        // "frecuenciaLetras.entrySet()" itera sobre cada elemento del Map
        // "Map.Entry<Character, Integer> entry" recoge cada calve y valor sobre el que a iterado el foreach
        for (Map.Entry<Character, Integer> entry : frequencyLetters.entrySet()) {
            System.out.println("Letra: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
        }
	}

}
