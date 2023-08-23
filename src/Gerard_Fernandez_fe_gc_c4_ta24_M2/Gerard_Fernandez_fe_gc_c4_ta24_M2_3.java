package Gerard_Fernandez_fe_gc_c4_ta24_M2;

public class Gerard_Fernandez_fe_gc_c4_ta24_M2_3 {

	public static void main(String[] args) throws InterruptedException {
		int hour = 0;
        int minutes = 0;
        int seconds = 0;

        while (true) {
        	//Se le da formato al print no es un print normal es un printf (format)
            System.out.printf("%02d:%02d:%02d%n", hour, minutes, seconds);

            seconds++;
            //Si pasan los 60 segundos suma 1 minuto
            if (seconds > 59) {
                seconds = 0;
                minutes++;
                //Si pasa 60 el minutero suma 1 h. y el minutero pasa a 0
                if (minutes > 59) {
                    minutes = 0;
                    hour++;
                    //Si pasa 24 H. vuelve a 0 H.
                    if (hour >= 24) {
                        hour = 0;
                    }
                }
            }
            
            // Pausa durante 1 segundo el hilo que lo ejecuta
            Thread.sleep(1000); 
            
        }
	}
}
